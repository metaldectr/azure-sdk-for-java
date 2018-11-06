/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2018_08_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2018_08_01.RouteFilters;
import com.microsoft.azure.management.network.v2018_08_01.RouteFilter;
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

class RouteFiltersImpl extends GroupableResourcesCoreImpl<RouteFilter, RouteFilterImpl, RouteFilterInner, RouteFiltersInner, NetworkManager>  implements RouteFilters {
    protected RouteFiltersImpl(NetworkManager manager) {
        super(manager.inner().routeFilters(), manager);
    }

    @Override
    protected Observable<RouteFilterInner> getInnerAsync(String resourceGroupName, String name) {
        RouteFiltersInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        RouteFiltersInner client = this.inner();
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
    public PagedList<RouteFilter> listByResourceGroup(String resourceGroupName) {
        RouteFiltersInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<RouteFilter> listByResourceGroupAsync(String resourceGroupName) {
        RouteFiltersInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<RouteFilterInner>, Iterable<RouteFilterInner>>() {
            @Override
            public Iterable<RouteFilterInner> call(Page<RouteFilterInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RouteFilterInner, RouteFilter>() {
            @Override
            public RouteFilter call(RouteFilterInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<RouteFilter> list() {
        RouteFiltersInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<RouteFilter> listAsync() {
        RouteFiltersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<RouteFilterInner>, Iterable<RouteFilterInner>>() {
            @Override
            public Iterable<RouteFilterInner> call(Page<RouteFilterInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RouteFilterInner, RouteFilter>() {
            @Override
            public RouteFilter call(RouteFilterInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public RouteFilterImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected RouteFilterImpl wrapModel(RouteFilterInner inner) {
        return  new RouteFilterImpl(inner.name(), inner, manager());
    }

    @Override
    protected RouteFilterImpl wrapModel(String name) {
        return new RouteFilterImpl(name, new RouteFilterInner(), this.manager());
    }

}
