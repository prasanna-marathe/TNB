/*
 * Horreum REST API
 * Horreum automated change anomaly detection. For more information, please see [https://horreum.hyperfoil.io/](https://horreum.hyperfoil.io/)
 *
 * The version of the OpenAPI document: 0.17
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package software.tnb.horreum.validation.generated.model;

import software.tnb.horreum.validation.generated.JSON;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import jakarta.annotation.Generated;

/**
 * LabelInFingerprint
 */
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-02T20:53:38.158166061+01:00[Europe/Bratislava]",
    comments = "Generator version: 7.10.0")
public class LabelInFingerprint {
    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    @javax.annotation.Nullable
    private String type;

    public static final String SERIALIZED_NAME_TEST_ID = "testId";
    @SerializedName(SERIALIZED_NAME_TEST_ID)
    @javax.annotation.Nullable
    private Integer testId;

    public static final String SERIALIZED_NAME_TEST_NAME = "testName";
    @SerializedName(SERIALIZED_NAME_TEST_NAME)
    @javax.annotation.Nullable
    private String testName;

    public LabelInFingerprint() {
    }

    public LabelInFingerprint type(@javax.annotation.Nullable String type) {
        this.type = type;
        return this;
    }

    /**
     * Location of Label usage
     *
     * @return type
     */
    @javax.annotation.Nullable
    public String getType() {
        return type;
    }

    public void setType(@javax.annotation.Nullable String type) {
        this.type = type;
    }

    public LabelInFingerprint testId(@javax.annotation.Nullable Integer testId) {
        this.testId = testId;
        return this;
    }

    /**
     * Unique ID for location that references Schema
     *
     * @return testId
     */
    @javax.annotation.Nullable
    public Integer getTestId() {
        return testId;
    }

    public void setTestId(@javax.annotation.Nullable Integer testId) {
        this.testId = testId;
    }

    public LabelInFingerprint testName(@javax.annotation.Nullable String testName) {
        this.testName = testName;
        return this;
    }

    /**
     * Test name that references Schema
     *
     * @return testName
     */
    @javax.annotation.Nullable
    public String getTestName() {
        return testName;
    }

    public void setTestName(@javax.annotation.Nullable String testName) {
        this.testName = testName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelInFingerprint labelInFingerprint = (LabelInFingerprint) o;
        return Objects.equals(this.type, labelInFingerprint.type) &&
            Objects.equals(this.testId, labelInFingerprint.testId) &&
            Objects.equals(this.testName, labelInFingerprint.testName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, testId, testName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelInFingerprint {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
        sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
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

    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("type");
        openapiFields.add("testId");
        openapiFields.add("testName");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to LabelInFingerprint
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!LabelInFingerprint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                    String.format("The required field(s) %s in LabelInFingerprint is not found in the empty JSON string",
                        LabelInFingerprint.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!LabelInFingerprint.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                    String.format("The field `%s` in the JSON string is not defined in the `LabelInFingerprint` properties. JSON: %s", entry.getKey(),
                        jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        if ((jsonObj.get("testName") != null && !jsonObj.get("testName").isJsonNull()) && !jsonObj.get("testName").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `testName` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("testName").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!LabelInFingerprint.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LabelInFingerprint' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LabelInFingerprint> thisAdapter
                = gson.getDelegateAdapter(this, TypeToken.get(LabelInFingerprint.class));

            return (TypeAdapter<T>) new TypeAdapter<LabelInFingerprint>() {
                @Override
                public void write(JsonWriter out, LabelInFingerprint value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public LabelInFingerprint read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }
            }.nullSafe();
        }
    }

    /**
     * Create an instance of LabelInFingerprint given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LabelInFingerprint
     * @throws IOException if the JSON string is invalid with respect to LabelInFingerprint
     */
    public static LabelInFingerprint fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, LabelInFingerprint.class);
    }

    /**
     * Convert an instance of LabelInFingerprint to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

