/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for customNamedRequestIdParamGrouping operation.
 */
public class HeaderCustomNamedRequestIdParamGroupingParametersInner {
    /**
     * The fooRequestId.
     */
    @JsonProperty(value = "", required = true)
    private String fooClientRequestId;

    /**
     * Get the fooClientRequestId value.
     *
     * @return the fooClientRequestId value
     */
    public String fooClientRequestId() {
        return this.fooClientRequestId;
    }

    /**
     * Set the fooClientRequestId value.
     *
     * @param fooClientRequestId the fooClientRequestId value to set
     * @return the HeaderCustomNamedRequestIdParamGroupingParametersInner
     * object itself.
     */
    public HeaderCustomNamedRequestIdParamGroupingParametersInner withFooClientRequestId(String fooClientRequestId) {
        this.fooClientRequestId = fooClientRequestId;
        return this;
    }
}
