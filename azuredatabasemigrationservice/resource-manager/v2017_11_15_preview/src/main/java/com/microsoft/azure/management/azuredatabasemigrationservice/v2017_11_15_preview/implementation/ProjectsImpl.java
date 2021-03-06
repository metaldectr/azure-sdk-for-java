/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview.Projects;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview.Project;

class ProjectsImpl extends WrapperImpl<ProjectsInner> implements Projects {
    private final DataMigrationManager manager;

    ProjectsImpl(DataMigrationManager manager) {
        super(manager.inner().projects());
        this.manager = manager;
    }

    public DataMigrationManager manager() {
        return this.manager;
    }

    @Override
    public ProjectImpl define(String name) {
        return wrapModel(name);
    }

    private ProjectImpl wrapModel(ProjectInner inner) {
        return  new ProjectImpl(inner, manager());
    }

    private ProjectImpl wrapModel(String name) {
        return new ProjectImpl(name, this.manager());
    }

    @Override
    public Observable<Project> listAsync(final String groupName, final String serviceName) {
        ProjectsInner client = this.inner();
        return client.listAsync(groupName, serviceName)
        .flatMapIterable(new Func1<Page<ProjectInner>, Iterable<ProjectInner>>() {
            @Override
            public Iterable<ProjectInner> call(Page<ProjectInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProjectInner, Project>() {
            @Override
            public Project call(ProjectInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Project> getAsync(String groupName, String serviceName, String projectName) {
        ProjectsInner client = this.inner();
        return client.getAsync(groupName, serviceName, projectName)
        .map(new Func1<ProjectInner, Project>() {
            @Override
            public Project call(ProjectInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String groupName, String serviceName, String projectName) {
        ProjectsInner client = this.inner();
        return client.deleteAsync(groupName, serviceName, projectName).toCompletable();
    }

}
