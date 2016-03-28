/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataLakeAnalytics DataLakeAnalyticsAccount information.
 */
public class DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters {
    /**
     * Gets or sets the password for the secret to pass in.
     */
    @JsonProperty(required = true)
    private String password;

    /**
     * Gets or sets the URI identifier for the secret in the format
     * &lt;hostname&gt;:&lt;port&gt;.
     */
    private String uri;

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the uri value.
     *
     * @return the uri value
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * Set the uri value.
     *
     * @param uri the uri value to set
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

}