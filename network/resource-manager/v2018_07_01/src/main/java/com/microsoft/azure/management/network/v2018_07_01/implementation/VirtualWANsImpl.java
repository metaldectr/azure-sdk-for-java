/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2018_07_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2018_07_01.VirtualWANs;
import com.microsoft.azure.management.network.v2018_07_01.VirtualWAN;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class VirtualWANsImpl extends GroupableResourcesCoreImpl<VirtualWAN, VirtualWANImpl, VirtualWANInner, VirtualWANsInner, NetworkManager>  implements VirtualWANs {
    protected VirtualWANsImpl(NetworkManager manager) {
        super(manager.inner().virtualWANs(), manager);
    }

    @Override
    protected Observable<VirtualWANInner> getInnerAsync(String resourceGroupName, String name) {
        VirtualWANsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        VirtualWANsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<VirtualWAN> listByResourceGroup(String resourceGroupName) {
        VirtualWANsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<VirtualWAN> listByResourceGroupAsync(String resourceGroupName) {
        VirtualWANsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<VirtualWANInner>, Iterable<VirtualWANInner>>() {
            @Override
            public Iterable<VirtualWANInner> call(Page<VirtualWANInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualWANInner, VirtualWAN>() {
            @Override
            public VirtualWAN call(VirtualWANInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<VirtualWAN> list() {
        VirtualWANsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<VirtualWAN> listAsync() {
        VirtualWANsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<VirtualWANInner>, Iterable<VirtualWANInner>>() {
            @Override
            public Iterable<VirtualWANInner> call(Page<VirtualWANInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualWANInner, VirtualWAN>() {
            @Override
            public VirtualWAN call(VirtualWANInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public VirtualWANImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected VirtualWANImpl wrapModel(VirtualWANInner inner) {
        return  new VirtualWANImpl(inner.name(), inner, manager());
    }

    @Override
    protected VirtualWANImpl wrapModel(String name) {
        return new VirtualWANImpl(name, new VirtualWANInner(), this.manager());
    }

}
