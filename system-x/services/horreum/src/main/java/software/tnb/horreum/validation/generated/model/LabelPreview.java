/*
 * Horreum API
 * Horreum data repository API
 *
 * The version of the OpenAPI document: 0.1-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package software.tnb.horreum.validation.generated.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * LabelPreview
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-12T10:19:43.430893315+02:00[Europe/Rome]")
public class LabelPreview {
    public static final String SERIALIZED_NAME_VALUE = "value";
    public static final String SERIALIZED_NAME_OUTPUT = "output";
    @SerializedName(SERIALIZED_NAME_VALUE)
    private List value = null;
    @SerializedName(SERIALIZED_NAME_OUTPUT)
    private String output;

    public LabelPreview() {
    }

    public LabelPreview value(List value) {

        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List getValue() {
        return value;
    }

    public void setValue(List value) {
        this.value = value;
    }

    public LabelPreview output(String output) {

        this.output = output;
        return this;
    }

    /**
     * Get output
     *
     * @return output
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelPreview labelPreview = (LabelPreview) o;
        return Objects.equals(this.value, labelPreview.value) &&
            Objects.equals(this.output, labelPreview.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, output);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelPreview {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
