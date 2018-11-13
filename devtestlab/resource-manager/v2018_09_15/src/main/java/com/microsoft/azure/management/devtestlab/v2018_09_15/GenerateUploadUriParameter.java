/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties for generating an upload URI.
 */
public class GenerateUploadUriParameter {
    /**
     * The blob name of the upload URI.
     */
    @JsonProperty(value = "blobName")
    private String blobName;

    /**
     * Get the blob name of the upload URI.
     *
     * @return the blobName value
     */
    public String blobName() {
        return this.blobName;
    }

    /**
     * Set the blob name of the upload URI.
     *
     * @param blobName the blobName value to set
     * @return the GenerateUploadUriParameter object itself.
     */
    public GenerateUploadUriParameter withBlobName(String blobName) {
        this.blobName = blobName;
        return this;
    }

}
