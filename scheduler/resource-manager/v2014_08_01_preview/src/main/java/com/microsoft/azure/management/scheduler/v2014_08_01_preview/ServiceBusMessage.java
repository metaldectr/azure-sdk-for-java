/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2014_08_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ServiceBusMessage model.
 */
public class ServiceBusMessage {
    /**
     * Gets or sets the authentication.
     */
    @JsonProperty(value = "authentication")
    private ServiceBusAuthentication authentication;

    /**
     * Gets or sets the brokered message properties.
     */
    @JsonProperty(value = "brokeredMessageProperties")
    private ServiceBusBrokeredMessageProperties brokeredMessageProperties;

    /**
     * Gets or sets the custom message properties.
     */
    @JsonProperty(value = "customMessageProperties")
    private Map<String, String> customMessageProperties;

    /**
     * Gets or sets the message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Gets or sets the namespace.
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /**
     * Gets or sets the transport type. Possible values include:
     * 'NotSpecified', 'NetMessaging', 'AMQP'.
     */
    @JsonProperty(value = "transportType")
    private ServiceBusTransportType transportType;

    /**
     * Get gets or sets the authentication.
     *
     * @return the authentication value
     */
    public ServiceBusAuthentication authentication() {
        return this.authentication;
    }

    /**
     * Set gets or sets the authentication.
     *
     * @param authentication the authentication value to set
     * @return the ServiceBusMessage object itself.
     */
    public ServiceBusMessage withAuthentication(ServiceBusAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Get gets or sets the brokered message properties.
     *
     * @return the brokeredMessageProperties value
     */
    public ServiceBusBrokeredMessageProperties brokeredMessageProperties() {
        return this.brokeredMessageProperties;
    }

    /**
     * Set gets or sets the brokered message properties.
     *
     * @param brokeredMessageProperties the brokeredMessageProperties value to set
     * @return the ServiceBusMessage object itself.
     */
    public ServiceBusMessage withBrokeredMessageProperties(ServiceBusBrokeredMessageProperties brokeredMessageProperties) {
        this.brokeredMessageProperties = brokeredMessageProperties;
        return this;
    }

    /**
     * Get gets or sets the custom message properties.
     *
     * @return the customMessageProperties value
     */
    public Map<String, String> customMessageProperties() {
        return this.customMessageProperties;
    }

    /**
     * Set gets or sets the custom message properties.
     *
     * @param customMessageProperties the customMessageProperties value to set
     * @return the ServiceBusMessage object itself.
     */
    public ServiceBusMessage withCustomMessageProperties(Map<String, String> customMessageProperties) {
        this.customMessageProperties = customMessageProperties;
        return this;
    }

    /**
     * Get gets or sets the message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set gets or sets the message.
     *
     * @param message the message value to set
     * @return the ServiceBusMessage object itself.
     */
    public ServiceBusMessage withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get gets or sets the namespace.
     *
     * @return the namespace value
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set gets or sets the namespace.
     *
     * @param namespace the namespace value to set
     * @return the ServiceBusMessage object itself.
     */
    public ServiceBusMessage withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get gets or sets the transport type. Possible values include: 'NotSpecified', 'NetMessaging', 'AMQP'.
     *
     * @return the transportType value
     */
    public ServiceBusTransportType transportType() {
        return this.transportType;
    }

    /**
     * Set gets or sets the transport type. Possible values include: 'NotSpecified', 'NetMessaging', 'AMQP'.
     *
     * @param transportType the transportType value to set
     * @return the ServiceBusMessage object itself.
     */
    public ServiceBusMessage withTransportType(ServiceBusTransportType transportType) {
        this.transportType = transportType;
        return this;
    }

}