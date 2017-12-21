/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for put301 operation.
 */
public class HttpRedirectsPut301Headers {
    /**
     * The redirect location for this request. Possible values include:
     * '/http/failure/500'.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the HttpRedirectsPut301Headers object itself.
     */
    public HttpRedirectsPut301Headers withLocation(String location) {
        this.location = location;
        return this;
    }
}
