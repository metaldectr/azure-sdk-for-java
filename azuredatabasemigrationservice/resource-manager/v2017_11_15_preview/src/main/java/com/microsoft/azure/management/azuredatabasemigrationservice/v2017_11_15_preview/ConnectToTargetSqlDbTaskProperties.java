/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Properties for the task that validates connection to SQL DB and target
 * server requirements.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("ConnectToTarget.SqlDb")
public class ConnectToTargetSqlDbTaskProperties extends ProjectTaskProperties {
    /**
     * Task input.
     */
    @JsonProperty(value = "input")
    private ConnectToTargetSqlDbTaskInput input;

    /**
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectToTargetSqlDbTaskOutput> output;

    /**
     * Get task input.
     *
     * @return the input value
     */
    public ConnectToTargetSqlDbTaskInput input() {
        return this.input;
    }

    /**
     * Set task input.
     *
     * @param input the input value to set
     * @return the ConnectToTargetSqlDbTaskProperties object itself.
     */
    public ConnectToTargetSqlDbTaskProperties withInput(ConnectToTargetSqlDbTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get task output. This is ignored if submitted.
     *
     * @return the output value
     */
    public List<ConnectToTargetSqlDbTaskOutput> output() {
        return this.output;
    }

}
