/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for deleteNoHeaderInRetry operation.
 */
public class LROsDeleteNoHeaderInRetryHeadersInner {
    /**
     * Location to poll for result status: will be set to
     * /lro/put/noheader/202/204/operationresults.
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
     * @return the LROsDeleteNoHeaderInRetryHeadersInner object itself.
     */
    public LROsDeleteNoHeaderInRetryHeadersInner withLocation(String location) {
        this.location = location;
        return this;
    }
}
