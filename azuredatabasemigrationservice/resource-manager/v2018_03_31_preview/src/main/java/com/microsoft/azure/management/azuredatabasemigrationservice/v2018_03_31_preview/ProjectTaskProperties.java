/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for all types of DMS task properties. If task is not supported by
 * current client, this object is returned.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("Unknown")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SqlConnectionInfo", value = SqlConnectionInfo.class),
    @JsonSubTypes.Type(name = "ValidateMigrationInput.SqlServer.AzureSqlDbMI", value = ValidateMigrationInputSqlServerSqlMITaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.SqlServer.SqlDb", value = MigrateSqlServerSqlDbTaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.SqlServer.AzureSqlDbMI", value = MigrateSqlServerSqlMITaskProperties.class),
    @JsonSubTypes.Type(name = "GetUserTables.Sql", value = GetUserTablesSqlTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.SqlDb", value = ConnectToTargetSqlDbTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.AzureSqlDbMI", value = ConnectToTargetSqlMITaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToSource.SqlServer", value = ConnectToSourceSqlServerTaskProperties.class)
})
public class ProjectTaskProperties {
    /**
     * Array of errors. This is ignored if submitted.
     */
    @JsonProperty(value = "errors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ODataError> errors;

    /**
     * The state of the task. This is ignored if submitted. Possible values
     * include: 'Unknown', 'Queued', 'Running', 'Canceled', 'Succeeded',
     * 'Failed', 'FailedInputValidation', 'Faulted'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private TaskState state;

    /**
     * Get array of errors. This is ignored if submitted.
     *
     * @return the errors value
     */
    public List<ODataError> errors() {
        return this.errors;
    }

    /**
     * Get the state of the task. This is ignored if submitted. Possible values include: 'Unknown', 'Queued', 'Running', 'Canceled', 'Succeeded', 'Failed', 'FailedInputValidation', 'Faulted'.
     *
     * @return the state value
     */
    public TaskState state() {
        return this.state;
    }

}
