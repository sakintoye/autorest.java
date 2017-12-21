/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DoubleWrapper model.
 */
public class DoubleWrapper {
    /**
     * The field1 property.
     */
    @JsonProperty(value = "field1")
    private Double field1;

    /**
     * The
     * field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose
     * property.
     */
    @JsonProperty(value = "field_56_zeros_after_the_dot_and_negative_zero_before_dot_and_this_is_a_long_field_name_on_purpose")
    private Double field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose;

    /**
     * Get the field1 value.
     *
     * @return the field1 value
     */
    public Double field1() {
        return this.field1;
    }

    /**
     * Set the field1 value.
     *
     * @param field1 the field1 value to set
     * @return the DoubleWrapper object itself.
     */
    public DoubleWrapper withField1(Double field1) {
        this.field1 = field1;
        return this;
    }

    /**
     * Get the
     * field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose
     * value.
     *
     * @return the
     * field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose
     * value
     */
    public Double field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose() {
        return this.field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose;
    }

    /**
     * Set the
     * field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose
     * value.
     *
     * @param
     * field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose
     * the
     * field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose
     * value to set
     * @return the DoubleWrapper object itself.
     */
    public DoubleWrapper withField56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose(Double field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose) {
        this.field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose = field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose;
        return this;
    }
}
