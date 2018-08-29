/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.automation.v2015_10_31.JobStreams;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.automation.v2015_10_31.JobAutomationAccountJobStream;

class JobStreamsImpl extends WrapperImpl<JobStreamsInner> implements JobStreams {
    private final AutomationManager manager;

    JobStreamsImpl(AutomationManager manager) {
        super(manager.inner().jobStreams());
        this.manager = manager;
    }

    public AutomationManager manager() {
        return this.manager;
    }

    private JobAutomationAccountJobStreamImpl wrapModel(JobStreamInner inner) {
        return  new JobAutomationAccountJobStreamImpl(inner, manager());
    }

    @Override
    public Observable<JobAutomationAccountJobStream> listByJobAsync(final String resourceGroupName, final String automationAccountName, final String jobId) {
        JobStreamsInner client = this.inner();
        return client.listByJobAsync(resourceGroupName, automationAccountName, jobId)
        .flatMapIterable(new Func1<Page<JobStreamInner>, Iterable<JobStreamInner>>() {
            @Override
            public Iterable<JobStreamInner> call(Page<JobStreamInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobStreamInner, JobAutomationAccountJobStream>() {
            @Override
            public JobAutomationAccountJobStream call(JobStreamInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<JobAutomationAccountJobStream> getAsync(String resourceGroupName, String automationAccountName, String jobId, String jobStreamId) {
        JobStreamsInner client = this.inner();
        return client.getAsync(resourceGroupName, automationAccountName, jobId, jobStreamId)
        .map(new Func1<JobStreamInner, JobAutomationAccountJobStream>() {
            @Override
            public JobAutomationAccountJobStream call(JobStreamInner inner) {
                return wrapModel(inner);
            }
       });
    }

}