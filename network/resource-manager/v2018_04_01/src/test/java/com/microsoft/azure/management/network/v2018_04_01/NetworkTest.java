/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.arm.core.TestBase;
import com.microsoft.azure.management.network.v2018_04_01.implementation.NetworkManager;
import com.microsoft.azure.management.resources.implementation.ResourceManager;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.arm.utils.SdkContext;
import org.junit.Test;
import org.junit.Assert;
import com.microsoft.azure.arm.resources.Region;
import com.microsoft.azure.management.resources.ResourceGroup;

import java.util.ArrayList;

public class  NetworkTest extends TestBase {
    protected static ResourceManager resourceManager;
    protected static NetworkManager networkManager;
    private static String rgName;
    @Override
    protected void initializeClients(RestClient restClient, String defaultSubscription, String domain) {
        resourceManager = ResourceManager
                .authenticate(restClient)
                .withSubscription(defaultSubscription);
        networkManager = NetworkManager
                .authenticate(restClient, defaultSubscription);
    }
    @Override
    protected void cleanUpResources() {
        if (rgName != null) {
            resourceManager.resourceGroups().deleteByName(rgName);
        }
    }

    @Test
    public void canListGetUpdateCrossConnection() {
        rgName = null;

        // List cross connections
        //
        PagedList<ExpressRouteCrossConnection> crossConns = networkManager.expressRouteCrossConnections()
                .list();

        ExpressRouteCrossConnection provisionedCrossCon = null;
        for (ExpressRouteCrossConnection crossCon : crossConns) {
            System.out.println(crossCon.id());
            if (crossCon.serviceProviderProvisioningState() == ServiceProviderProvisioningState.PROVISIONED) {
                provisionedCrossCon = crossCon;
            }
        }

        if (provisionedCrossCon == null) {
            System.out.println("Couldn't find a cross connection with 'provisioned' state");
        }
        else {
            // Retrieve a cross connection
            //
            ExpressRouteCrossConnection crossCon = networkManager.expressRouteCrossConnections()
                    .getByResourceGroup(provisionedCrossCon.resourceGroupName(), provisionedCrossCon.name());

            System.out.println("Retrieved: " + crossCon.id());
            // Create a Microsoft peering
            //
            ExpressRouteCrossConnectionPeering msPeering = createMicrosoftPeering(crossCon);

            // Update cross connection
            //
            crossCon.update()
                    .withTag("tag-key-1", "tag-value-1")
                    .apply();
        }
    }

    private ExpressRouteCrossConnectionPeering createMicrosoftPeering(ExpressRouteCrossConnection crossCon) {
        // Prepare peering payload
        //
        ExpressRouteCircuitPeeringConfig microsoftPeeingConfig = new ExpressRouteCircuitPeeringConfig();
        microsoftPeeingConfig
                .withAdvertisedPublicPrefixes(new ArrayList<String>())
                .advertisedPublicPrefixes().add("123.1.0.0/24");
        microsoftPeeingConfig.withCustomerASN(23);
        microsoftPeeingConfig.withRoutingRegistryName("ARIN");
        //
        Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig = new Ipv6ExpressRouteCircuitPeeringConfig();
        ipv6PeeringConfig.withPrimaryPeerAddressPrefix("3FFE:FFFF:0:CD30::/126");
        ipv6PeeringConfig.withSecondaryPeerAddressPrefix("3FFE:FFFF:0:CD30::4/126");
        ExpressRouteCircuitPeeringConfig ipv6MicrosoftPeeingConfig = new ExpressRouteCircuitPeeringConfig();
        microsoftPeeingConfig
                .withAdvertisedPublicPrefixes(new ArrayList<String>())
                .advertisedPublicPrefixes().add("3FFE:FFFF:0:CD31::/120");
        microsoftPeeingConfig.withCustomerASN(23);
        microsoftPeeingConfig.withRoutingRegistryName("ARIN");
        ipv6PeeringConfig.withMicrosoftPeeringConfig(ipv6MicrosoftPeeingConfig);
        //
        // Create Peering
        //
        ExpressRouteCrossConnectionPeering crossConnectionPeering = networkManager
                .expressRouteCrossConnectionPeerings()
                .define("MicrosoftPeering")
                .withExistingExpressRouteCrossConnection(crossCon.resourceGroupName(), crossCon.name())
                .withMicrosoftPeeringConfig(microsoftPeeingConfig)
                .withIpv6PeeringConfig(ipv6PeeringConfig)
                .create();
        //
        return crossConnectionPeering;
    }

}