/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.scheduler.v2014_08_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.scheduler.v2014_08_01_preview.JobCollections;
import com.microsoft.azure.management.scheduler.v2014_08_01_preview.JobCollectionDefinition;
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

class JobCollectionsImpl extends GroupableResourcesCoreImpl<JobCollectionDefinition, JobCollectionDefinitionImpl, JobCollectionDefinitionInner, JobCollectionsInner, SchedulerManager>  implements JobCollections {
    protected JobCollectionsImpl(SchedulerManager manager) {
        super(manager.inner().jobCollections(), manager);
    }

    @Override
    protected Observable<JobCollectionDefinitionInner> getInnerAsync(String resourceGroupName, String name) {
        JobCollectionsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        JobCollectionsInner client = this.inner();
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
    public PagedList<JobCollectionDefinition> listByResourceGroup(String resourceGroupName) {
        JobCollectionsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<JobCollectionDefinition> listByResourceGroupAsync(String resourceGroupName) {
        JobCollectionsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<JobCollectionDefinitionInner>, Iterable<JobCollectionDefinitionInner>>() {
            @Override
            public Iterable<JobCollectionDefinitionInner> call(Page<JobCollectionDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobCollectionDefinitionInner, JobCollectionDefinition>() {
            @Override
            public JobCollectionDefinition call(JobCollectionDefinitionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<JobCollectionDefinition> list() {
        JobCollectionsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<JobCollectionDefinition> listAsync() {
        JobCollectionsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<JobCollectionDefinitionInner>, Iterable<JobCollectionDefinitionInner>>() {
            @Override
            public Iterable<JobCollectionDefinitionInner> call(Page<JobCollectionDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobCollectionDefinitionInner, JobCollectionDefinition>() {
            @Override
            public JobCollectionDefinition call(JobCollectionDefinitionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public JobCollectionDefinitionImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable enableAsync(String resourceGroupName, String jobCollectionName) {
        JobCollectionsInner client = this.inner();
        return client.enableAsync(resourceGroupName, jobCollectionName).toCompletable();
    }

    @Override
    public Completable disableAsync(String resourceGroupName, String jobCollectionName) {
        JobCollectionsInner client = this.inner();
        return client.disableAsync(resourceGroupName, jobCollectionName).toCompletable();
    }

    @Override
    protected JobCollectionDefinitionImpl wrapModel(JobCollectionDefinitionInner inner) {
        return  new JobCollectionDefinitionImpl(inner.name(), inner, manager());
    }

    @Override
    protected JobCollectionDefinitionImpl wrapModel(String name) {
        return new JobCollectionDefinitionImpl(name, new JobCollectionDefinitionInner(), this.manager());
    }

}