/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodynumber.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceClient;
import com.microsoft.rest.v2.http.HttpPipeline;
import fixtures.bodynumber.AutoRestNumberTestService;
import fixtures.bodynumber.Numbers;

/**
 * Initializes a new instance of the AutoRestNumberTestService class.
 */
public class AutoRestNumberTestServiceImpl extends ServiceClient implements AutoRestNumberTestService {
    /**
     * The Numbers object to access its operations.
     */
    private Numbers numbers;

    /**
     * Gets the Numbers object to access its operations.
     *
     * @return the Numbers object.
     */
    public Numbers numbers() {
        return this.numbers;
    }

    /**
     * Initializes an instance of AutoRestNumberTestService client.
     */
    public AutoRestNumberTestServiceImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of AutoRestNumberTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AutoRestNumberTestServiceImpl(HttpPipeline httpPipeline) {
        super(httpPipeline);

        this.numbers = new NumbersImpl(this);
    }
}
