/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.paging.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for getMultiplePagesWithOffsetNext operation.
 */
public class PagingGetMultiplePagesWithOffsetNextOptions {
    /**
     * Sets the maximum number of items to return in the response.
     */
    @JsonProperty(value = "")
    private Integer maxresults;

    /**
     * Sets the maximum time that the server can spend processing the request,
     * in seconds. The default is 30 seconds.
     */
    @JsonProperty(value = "")
    private Integer timeout;

    /**
     * Get the maxresults value.
     *
     * @return the maxresults value
     */
    public Integer maxresults() {
        return this.maxresults;
    }

    /**
     * Set the maxresults value.
     *
     * @param maxresults the maxresults value to set
     * @return the PagingGetMultiplePagesWithOffsetNextOptions object itself.
     */
    public PagingGetMultiplePagesWithOffsetNextOptions withMaxresults(Integer maxresults) {
        this.maxresults = maxresults;
        return this;
    }

    /**
     * Get the timeout value.
     *
     * @return the timeout value
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout value.
     *
     * @param timeout the timeout value to set
     * @return the PagingGetMultiplePagesWithOffsetNextOptions object itself.
     */
    public PagingGetMultiplePagesWithOffsetNextOptions withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
}
