/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation.CommandPropertiesInner;

/**
 * Properties for the command that finishes a migration in whole or in part.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "commandType")
@JsonTypeName("finish")
public class MongoDbFinishCommand extends CommandPropertiesInner {
    /**
     * Command input.
     */
    @JsonProperty(value = "input")
    private MongoDbFinishCommandInput input;

    /**
     * Get command input.
     *
     * @return the input value
     */
    public MongoDbFinishCommandInput input() {
        return this.input;
    }

    /**
     * Set command input.
     *
     * @param input the input value to set
     * @return the MongoDbFinishCommand object itself.
     */
    public MongoDbFinishCommand withInput(MongoDbFinishCommandInput input) {
        this.input = input;
        return this;
    }

}
