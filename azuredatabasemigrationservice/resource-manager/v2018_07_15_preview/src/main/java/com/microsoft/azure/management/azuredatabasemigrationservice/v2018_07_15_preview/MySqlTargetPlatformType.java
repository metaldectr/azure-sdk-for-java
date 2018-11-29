/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MySqlTargetPlatformType.
 */
public final class MySqlTargetPlatformType extends ExpandableStringEnum<MySqlTargetPlatformType> {
    /** Static value SqlServer for MySqlTargetPlatformType. */
    public static final MySqlTargetPlatformType SQL_SERVER = fromString("SqlServer");

    /** Static value AzureDbForMySQL for MySqlTargetPlatformType. */
    public static final MySqlTargetPlatformType AZURE_DB_FOR_MY_SQL = fromString("AzureDbForMySQL");

    /**
     * Creates or finds a MySqlTargetPlatformType from its string representation.
     * @param name a name to look for
     * @return the corresponding MySqlTargetPlatformType
     */
    @JsonCreator
    public static MySqlTargetPlatformType fromString(String name) {
        return fromString(name, MySqlTargetPlatformType.class);
    }

    /**
     * @return known MySqlTargetPlatformType values
     */
    public static Collection<MySqlTargetPlatformType> values() {
        return values(MySqlTargetPlatformType.class);
    }
}
