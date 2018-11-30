/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_05_01.implementation;

import com.microsoft.azure.management.batch.v2017_05_01.ProvisioningState;
import com.microsoft.azure.management.batch.v2017_05_01.PoolAllocationMode;
import com.microsoft.azure.management.batch.v2017_05_01.KeyVaultReference;
import com.microsoft.azure.management.batch.v2017_05_01.AutoStorageProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Contains information about an Azure Batch account.
 */
@JsonFlatten
@SkipParentValidation
public class BatchAccountInner extends Resource {
    /**
     * The account endpoint used to interact with the Batch service.
     */
    @JsonProperty(value = "properties.accountEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String accountEndpoint;

    /**
     * The provisioned state of the resource. Possible values include:
     * 'Invalid', 'Creating', 'Deleting', 'Succeeded', 'Failed', 'Cancelled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The allocation mode to use for creating pools in the Batch account.
     * Possible values include: 'BatchService', 'UserSubscription'.
     */
    @JsonProperty(value = "properties.poolAllocationMode", access = JsonProperty.Access.WRITE_ONLY)
    private PoolAllocationMode poolAllocationMode;

    /**
     * A reference to the Azure key vault associated with the Batch account.
     */
    @JsonProperty(value = "properties.keyVaultReference", access = JsonProperty.Access.WRITE_ONLY)
    private KeyVaultReference keyVaultReference;

    /**
     * The properties and status of any auto-storage account associated with
     * the Batch account.
     */
    @JsonProperty(value = "properties.autoStorage", access = JsonProperty.Access.WRITE_ONLY)
    private AutoStorageProperties autoStorage;

    /**
     * The dedicated core quota for this Batch account.
     */
    @JsonProperty(value = "properties.dedicatedCoreQuota", access = JsonProperty.Access.WRITE_ONLY)
    private int dedicatedCoreQuota;

    /**
     * The low-priority core quota for this Batch account.
     */
    @JsonProperty(value = "properties.lowPriorityCoreQuota", access = JsonProperty.Access.WRITE_ONLY)
    private int lowPriorityCoreQuota;

    /**
     * The pool quota for this Batch account.
     */
    @JsonProperty(value = "properties.poolQuota", access = JsonProperty.Access.WRITE_ONLY)
    private int poolQuota;

    /**
     * The active job and job schedule quota for this Batch account.
     */
    @JsonProperty(value = "properties.activeJobAndJobScheduleQuota", access = JsonProperty.Access.WRITE_ONLY)
    private int activeJobAndJobScheduleQuota;

    /**
     * Get the account endpoint used to interact with the Batch service.
     *
     * @return the accountEndpoint value
     */
    public String accountEndpoint() {
        return this.accountEndpoint;
    }

    /**
     * Get the provisioned state of the resource. Possible values include: 'Invalid', 'Creating', 'Deleting', 'Succeeded', 'Failed', 'Cancelled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get possible values include: 'BatchService', 'UserSubscription'.
     *
     * @return the poolAllocationMode value
     */
    public PoolAllocationMode poolAllocationMode() {
        return this.poolAllocationMode;
    }

    /**
     * Get the keyVaultReference value.
     *
     * @return the keyVaultReference value
     */
    public KeyVaultReference keyVaultReference() {
        return this.keyVaultReference;
    }

    /**
     * Get the autoStorage value.
     *
     * @return the autoStorage value
     */
    public AutoStorageProperties autoStorage() {
        return this.autoStorage;
    }

    /**
     * Get the dedicatedCoreQuota value.
     *
     * @return the dedicatedCoreQuota value
     */
    public int dedicatedCoreQuota() {
        return this.dedicatedCoreQuota;
    }

    /**
     * Get the lowPriorityCoreQuota value.
     *
     * @return the lowPriorityCoreQuota value
     */
    public int lowPriorityCoreQuota() {
        return this.lowPriorityCoreQuota;
    }

    /**
     * Get the poolQuota value.
     *
     * @return the poolQuota value
     */
    public int poolQuota() {
        return this.poolQuota;
    }

    /**
     * Get the activeJobAndJobScheduleQuota value.
     *
     * @return the activeJobAndJobScheduleQuota value
     */
    public int activeJobAndJobScheduleQuota() {
        return this.activeJobAndJobScheduleQuota;
    }

}
