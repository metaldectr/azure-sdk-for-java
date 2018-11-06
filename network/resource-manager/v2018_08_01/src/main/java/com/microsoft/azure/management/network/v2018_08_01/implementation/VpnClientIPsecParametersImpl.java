/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01.implementation;

import com.microsoft.azure.management.network.v2018_08_01.VpnClientIPsecParameters;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2018_08_01.DhGroup;
import com.microsoft.azure.management.network.v2018_08_01.IkeEncryption;
import com.microsoft.azure.management.network.v2018_08_01.IkeIntegrity;
import com.microsoft.azure.management.network.v2018_08_01.IpsecEncryption;
import com.microsoft.azure.management.network.v2018_08_01.IpsecIntegrity;
import com.microsoft.azure.management.network.v2018_08_01.PfsGroup;

class VpnClientIPsecParametersImpl extends WrapperImpl<VpnClientIPsecParametersInner> implements VpnClientIPsecParameters {
    private final NetworkManager manager;
    VpnClientIPsecParametersImpl(VpnClientIPsecParametersInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public DhGroup dhGroup() {
        return this.inner().dhGroup();
    }

    @Override
    public IkeEncryption ikeEncryption() {
        return this.inner().ikeEncryption();
    }

    @Override
    public IkeIntegrity ikeIntegrity() {
        return this.inner().ikeIntegrity();
    }

    @Override
    public IpsecEncryption ipsecEncryption() {
        return this.inner().ipsecEncryption();
    }

    @Override
    public IpsecIntegrity ipsecIntegrity() {
        return this.inner().ipsecIntegrity();
    }

    @Override
    public PfsGroup pfsGroup() {
        return this.inner().pfsGroup();
    }

    @Override
    public int saDataSizeKilobytes() {
        return this.inner().saDataSizeKilobytes();
    }

    @Override
    public int saLifeTimeSeconds() {
        return this.inner().saLifeTimeSeconds();
    }

}
