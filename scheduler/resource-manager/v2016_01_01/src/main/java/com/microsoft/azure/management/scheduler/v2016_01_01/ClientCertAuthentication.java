/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2016_01_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ClientCertAuthentication model.
 */
public class ClientCertAuthentication extends HttpAuthentication {
    /**
     * Gets or sets the password.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Gets or sets the pfx.
     */
    @JsonProperty(value = "pfx")
    private String pfx;

    /**
     * Gets or sets the certificate thumbprint.
     */
    @JsonProperty(value = "certificateThumbprint")
    private String certificateThumbprint;

    /**
     * Gets or sets the certificate expiration date.
     */
    @JsonProperty(value = "certificateExpirationDate")
    private DateTime certificateExpirationDate;

    /**
     * Gets or sets the certificate subject name.
     */
    @JsonProperty(value = "certificateSubjectName")
    private String certificateSubjectName;

    /**
     * Get gets or sets the password.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set gets or sets the password.
     *
     * @param password the password value to set
     * @return the ClientCertAuthentication object itself.
     */
    public ClientCertAuthentication withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get gets or sets the pfx.
     *
     * @return the pfx value
     */
    public String pfx() {
        return this.pfx;
    }

    /**
     * Set gets or sets the pfx.
     *
     * @param pfx the pfx value to set
     * @return the ClientCertAuthentication object itself.
     */
    public ClientCertAuthentication withPfx(String pfx) {
        this.pfx = pfx;
        return this;
    }

    /**
     * Get gets or sets the certificate thumbprint.
     *
     * @return the certificateThumbprint value
     */
    public String certificateThumbprint() {
        return this.certificateThumbprint;
    }

    /**
     * Set gets or sets the certificate thumbprint.
     *
     * @param certificateThumbprint the certificateThumbprint value to set
     * @return the ClientCertAuthentication object itself.
     */
    public ClientCertAuthentication withCertificateThumbprint(String certificateThumbprint) {
        this.certificateThumbprint = certificateThumbprint;
        return this;
    }

    /**
     * Get gets or sets the certificate expiration date.
     *
     * @return the certificateExpirationDate value
     */
    public DateTime certificateExpirationDate() {
        return this.certificateExpirationDate;
    }

    /**
     * Set gets or sets the certificate expiration date.
     *
     * @param certificateExpirationDate the certificateExpirationDate value to set
     * @return the ClientCertAuthentication object itself.
     */
    public ClientCertAuthentication withCertificateExpirationDate(DateTime certificateExpirationDate) {
        this.certificateExpirationDate = certificateExpirationDate;
        return this;
    }

    /**
     * Get gets or sets the certificate subject name.
     *
     * @return the certificateSubjectName value
     */
    public String certificateSubjectName() {
        return this.certificateSubjectName;
    }

    /**
     * Set gets or sets the certificate subject name.
     *
     * @param certificateSubjectName the certificateSubjectName value to set
     * @return the ClientCertAuthentication object itself.
     */
    public ClientCertAuthentication withCertificateSubjectName(String certificateSubjectName) {
        this.certificateSubjectName = certificateSubjectName;
        return this;
    }

}