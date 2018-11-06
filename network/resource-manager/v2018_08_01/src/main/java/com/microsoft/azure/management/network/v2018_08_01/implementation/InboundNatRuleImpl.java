/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01.implementation;

import com.microsoft.azure.management.network.v2018_08_01.InboundNatRule;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_08_01.TransportProtocol;
import com.microsoft.azure.management.network.v2018_08_01.VirtualMachineScaleSetNetworkInterfaceIPConfiguration;

class InboundNatRuleImpl extends CreatableUpdatableImpl<InboundNatRule, InboundNatRuleInner, InboundNatRuleImpl> implements InboundNatRule, InboundNatRule.Definition, InboundNatRule.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String loadBalancerName;
    private String inboundNatRuleName;

    InboundNatRuleImpl(String name, NetworkManager manager) {
        super(name, new InboundNatRuleInner());
        this.manager = manager;
        // Set resource name
        this.inboundNatRuleName = name;
        //
    }

    InboundNatRuleImpl(InboundNatRuleInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.inboundNatRuleName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.loadBalancerName = IdParsingUtils.getValueFromIdByName(inner.id(), "loadBalancers");
        this.inboundNatRuleName = IdParsingUtils.getValueFromIdByName(inner.id(), "inboundNatRules");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<InboundNatRule> createResourceAsync() {
        InboundNatRulesInner client = this.manager().inner().inboundNatRules();
        return client.createOrUpdateAsync(this.resourceGroupName, this.loadBalancerName, this.inboundNatRuleName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<InboundNatRule> updateResourceAsync() {
        InboundNatRulesInner client = this.manager().inner().inboundNatRules();
        return client.createOrUpdateAsync(this.resourceGroupName, this.loadBalancerName, this.inboundNatRuleName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<InboundNatRuleInner> getInnerAsync() {
        InboundNatRulesInner client = this.manager().inner().inboundNatRules();
        return client.getAsync(this.resourceGroupName, this.loadBalancerName, this.inboundNatRuleName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public VirtualMachineScaleSetNetworkInterfaceIPConfiguration backendIPConfiguration() {
        NetworkInterfaceIPConfigurationInner inner = this.inner().backendIPConfiguration();
        if (inner != null) {
            return  new VirtualMachineScaleSetNetworkInterfaceIPConfigurationImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public Integer backendPort() {
        return this.inner().backendPort();
    }

    @Override
    public Boolean enableFloatingIP() {
        return this.inner().enableFloatingIP();
    }

    @Override
    public Boolean enableTcpReset() {
        return this.inner().enableTcpReset();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public SubResource frontendIPConfiguration() {
        return this.inner().frontendIPConfiguration();
    }

    @Override
    public Integer frontendPort() {
        return this.inner().frontendPort();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Integer idleTimeoutInMinutes() {
        return this.inner().idleTimeoutInMinutes();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public TransportProtocol protocol() {
        return this.inner().protocol();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public InboundNatRuleImpl withExistingLoadBalancer(String resourceGroupName, String loadBalancerName) {
        this.resourceGroupName = resourceGroupName;
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    @Override
    public InboundNatRuleImpl withBackendPort(Integer backendPort) {
        this.inner().withBackendPort(backendPort);
        return this;
    }

    @Override
    public InboundNatRuleImpl withEnableFloatingIP(Boolean enableFloatingIP) {
        this.inner().withEnableFloatingIP(enableFloatingIP);
        return this;
    }

    @Override
    public InboundNatRuleImpl withEnableTcpReset(Boolean enableTcpReset) {
        this.inner().withEnableTcpReset(enableTcpReset);
        return this;
    }

    @Override
    public InboundNatRuleImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public InboundNatRuleImpl withFrontendIPConfiguration(SubResource frontendIPConfiguration) {
        this.inner().withFrontendIPConfiguration(frontendIPConfiguration);
        return this;
    }

    @Override
    public InboundNatRuleImpl withFrontendPort(Integer frontendPort) {
        this.inner().withFrontendPort(frontendPort);
        return this;
    }

    @Override
    public InboundNatRuleImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public InboundNatRuleImpl withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.inner().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
        return this;
    }

    @Override
    public InboundNatRuleImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public InboundNatRuleImpl withProtocol(TransportProtocol protocol) {
        this.inner().withProtocol(protocol);
        return this;
    }

    @Override
    public InboundNatRuleImpl withProvisioningState(String provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

}
