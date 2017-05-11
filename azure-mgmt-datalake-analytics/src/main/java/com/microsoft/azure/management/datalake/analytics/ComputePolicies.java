/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.datalake.analytics.models.ComputePolicy;
import com.microsoft.azure.management.datalake.analytics.models.ComputePolicyCreateOrUpdateParameters;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ComputePolicies.
 */
public interface ComputePolicies {
    /**
     * Creates or updates the specified compute policy. During update, the compute policy with the specified name will be replaced with this new compute policy. An account supports, at most, 50 policies.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to add or replace the compute policy.
     * @param computePolicyName The name of the compute policy to create or update.
     * @param parameters Parameters supplied to create or update the compute policy. The max degree of parallelism per job property, min priority per job property, or both must be present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ComputePolicy object if successful.
     */
    ComputePolicy createOrUpdate(String resourceGroupName, String accountName, String computePolicyName, ComputePolicyCreateOrUpdateParameters parameters);

    /**
     * Creates or updates the specified compute policy. During update, the compute policy with the specified name will be replaced with this new compute policy. An account supports, at most, 50 policies.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to add or replace the compute policy.
     * @param computePolicyName The name of the compute policy to create or update.
     * @param parameters Parameters supplied to create or update the compute policy. The max degree of parallelism per job property, min priority per job property, or both must be present.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ComputePolicy> createOrUpdateAsync(String resourceGroupName, String accountName, String computePolicyName, ComputePolicyCreateOrUpdateParameters parameters, final ServiceCallback<ComputePolicy> serviceCallback);

    /**
     * Creates or updates the specified compute policy. During update, the compute policy with the specified name will be replaced with this new compute policy. An account supports, at most, 50 policies.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to add or replace the compute policy.
     * @param computePolicyName The name of the compute policy to create or update.
     * @param parameters Parameters supplied to create or update the compute policy. The max degree of parallelism per job property, min priority per job property, or both must be present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ComputePolicy object
     */
    Observable<ComputePolicy> createOrUpdateAsync(String resourceGroupName, String accountName, String computePolicyName, ComputePolicyCreateOrUpdateParameters parameters);

    /**
     * Creates or updates the specified compute policy. During update, the compute policy with the specified name will be replaced with this new compute policy. An account supports, at most, 50 policies.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to add or replace the compute policy.
     * @param computePolicyName The name of the compute policy to create or update.
     * @param parameters Parameters supplied to create or update the compute policy. The max degree of parallelism per job property, min priority per job property, or both must be present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ComputePolicy object
     */
    Observable<ServiceResponse<ComputePolicy>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String accountName, String computePolicyName, ComputePolicyCreateOrUpdateParameters parameters);

    /**
     * Updates the specified compute policy.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to update the compute policy.
     * @param computePolicyName The name of the compute policy to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ComputePolicy object if successful.
     */
    ComputePolicy update(String resourceGroupName, String accountName, String computePolicyName);

    /**
     * Updates the specified compute policy.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to update the compute policy.
     * @param computePolicyName The name of the compute policy to update.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ComputePolicy> updateAsync(String resourceGroupName, String accountName, String computePolicyName, final ServiceCallback<ComputePolicy> serviceCallback);

    /**
     * Updates the specified compute policy.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to update the compute policy.
     * @param computePolicyName The name of the compute policy to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ComputePolicy object
     */
    Observable<ComputePolicy> updateAsync(String resourceGroupName, String accountName, String computePolicyName);

    /**
     * Updates the specified compute policy.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to update the compute policy.
     * @param computePolicyName The name of the compute policy to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ComputePolicy object
     */
    Observable<ServiceResponse<ComputePolicy>> updateWithServiceResponseAsync(String resourceGroupName, String accountName, String computePolicyName);
    /**
     * Updates the specified compute policy.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to update the compute policy.
     * @param computePolicyName The name of the compute policy to update.
     * @param parameters Parameters supplied to update the compute policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ComputePolicy object if successful.
     */
    ComputePolicy update(String resourceGroupName, String accountName, String computePolicyName, ComputePolicy parameters);

    /**
     * Updates the specified compute policy.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to update the compute policy.
     * @param computePolicyName The name of the compute policy to update.
     * @param parameters Parameters supplied to update the compute policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ComputePolicy> updateAsync(String resourceGroupName, String accountName, String computePolicyName, ComputePolicy parameters, final ServiceCallback<ComputePolicy> serviceCallback);

    /**
     * Updates the specified compute policy.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to update the compute policy.
     * @param computePolicyName The name of the compute policy to update.
     * @param parameters Parameters supplied to update the compute policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ComputePolicy object
     */
    Observable<ComputePolicy> updateAsync(String resourceGroupName, String accountName, String computePolicyName, ComputePolicy parameters);

    /**
     * Updates the specified compute policy.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to update the compute policy.
     * @param computePolicyName The name of the compute policy to update.
     * @param parameters Parameters supplied to update the compute policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ComputePolicy object
     */
    Observable<ServiceResponse<ComputePolicy>> updateWithServiceResponseAsync(String resourceGroupName, String accountName, String computePolicyName, ComputePolicy parameters);

    /**
     * Deletes the specified compute policy from the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to delete the compute policy.
     * @param computePolicyName The name of the compute policy to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String resourceGroupName, String accountName, String computePolicyName);

    /**
     * Deletes the specified compute policy from the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to delete the compute policy.
     * @param computePolicyName The name of the compute policy to delete.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String resourceGroupName, String accountName, String computePolicyName, final ServiceCallback<Void> serviceCallback);

    /**
     * Deletes the specified compute policy from the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to delete the compute policy.
     * @param computePolicyName The name of the compute policy to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String resourceGroupName, String accountName, String computePolicyName);

    /**
     * Deletes the specified compute policy from the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to delete the compute policy.
     * @param computePolicyName The name of the compute policy to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String accountName, String computePolicyName);

    /**
     * Gets the specified Data Lake Analytics compute policy.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to get the compute policy.
     * @param computePolicyName The name of the compute policy to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ComputePolicy object if successful.
     */
    ComputePolicy get(String resourceGroupName, String accountName, String computePolicyName);

    /**
     * Gets the specified Data Lake Analytics compute policy.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to get the compute policy.
     * @param computePolicyName The name of the compute policy to retrieve.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ComputePolicy> getAsync(String resourceGroupName, String accountName, String computePolicyName, final ServiceCallback<ComputePolicy> serviceCallback);

    /**
     * Gets the specified Data Lake Analytics compute policy.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to get the compute policy.
     * @param computePolicyName The name of the compute policy to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ComputePolicy object
     */
    Observable<ComputePolicy> getAsync(String resourceGroupName, String accountName, String computePolicyName);

    /**
     * Gets the specified Data Lake Analytics compute policy.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to get the compute policy.
     * @param computePolicyName The name of the compute policy to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ComputePolicy object
     */
    Observable<ServiceResponse<ComputePolicy>> getWithServiceResponseAsync(String resourceGroupName, String accountName, String computePolicyName);

    /**
     * Lists the Data Lake Analytics compute policies within the specified Data Lake Analytics account. An account supports, at most, 50 policies.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to get the compute policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ComputePolicy&gt; object if successful.
     */
    PagedList<ComputePolicy> listByAccount(final String resourceGroupName, final String accountName);

    /**
     * Lists the Data Lake Analytics compute policies within the specified Data Lake Analytics account. An account supports, at most, 50 policies.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to get the compute policies.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ComputePolicy>> listByAccountAsync(final String resourceGroupName, final String accountName, final ListOperationCallback<ComputePolicy> serviceCallback);

    /**
     * Lists the Data Lake Analytics compute policies within the specified Data Lake Analytics account. An account supports, at most, 50 policies.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to get the compute policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ComputePolicy&gt; object
     */
    Observable<Page<ComputePolicy>> listByAccountAsync(final String resourceGroupName, final String accountName);

    /**
     * Lists the Data Lake Analytics compute policies within the specified Data Lake Analytics account. An account supports, at most, 50 policies.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to get the compute policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ComputePolicy&gt; object
     */
    Observable<ServiceResponse<Page<ComputePolicy>>> listByAccountWithServiceResponseAsync(final String resourceGroupName, final String accountName);

    /**
     * Lists the Data Lake Analytics compute policies within the specified Data Lake Analytics account. An account supports, at most, 50 policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ComputePolicy&gt; object if successful.
     */
    PagedList<ComputePolicy> listByAccountNext(final String nextPageLink);

    /**
     * Lists the Data Lake Analytics compute policies within the specified Data Lake Analytics account. An account supports, at most, 50 policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ComputePolicy>> listByAccountNextAsync(final String nextPageLink, final ServiceFuture<List<ComputePolicy>> serviceFuture, final ListOperationCallback<ComputePolicy> serviceCallback);

    /**
     * Lists the Data Lake Analytics compute policies within the specified Data Lake Analytics account. An account supports, at most, 50 policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ComputePolicy&gt; object
     */
    Observable<Page<ComputePolicy>> listByAccountNextAsync(final String nextPageLink);

    /**
     * Lists the Data Lake Analytics compute policies within the specified Data Lake Analytics account. An account supports, at most, 50 policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ComputePolicy&gt; object
     */
    Observable<ServiceResponse<Page<ComputePolicy>>> listByAccountNextWithServiceResponseAsync(final String nextPageLink);

}
