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
 * ChangeDetection
 */
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-02T20:53:38.158166061+01:00[Europe/Bratislava]",
    comments = "Generator version: 7.10.0")
public class ChangeDetection {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nonnull
    private Integer id;

    public static final String SERIALIZED_NAME_MODEL = "model";
    @SerializedName(SERIALIZED_NAME_MODEL)
    @javax.annotation.Nonnull
    private String model;

    public static final String SERIALIZED_NAME_CONFIG = "config";
    @SerializedName(SERIALIZED_NAME_CONFIG)
    @javax.annotation.Nonnull
    private ChangeDetectionConfig config;

    public ChangeDetection() {
    }

    public ChangeDetection id(@javax.annotation.Nonnull Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    public Integer getId() {
        return id;
    }

    public void setId(@javax.annotation.Nonnull Integer id) {
        this.id = id;
    }

    public ChangeDetection model(@javax.annotation.Nonnull String model) {
        this.model = model;
        return this;
    }

    /**
     * Get model
     *
     * @return model
     */
    @javax.annotation.Nonnull
    public String getModel() {
        return model;
    }

    public void setModel(@javax.annotation.Nonnull String model) {
        this.model = model;
    }

    public ChangeDetection config(@javax.annotation.Nonnull ChangeDetectionConfig config) {
        this.config = config;
        return this;
    }

    /**
     * Get config
     *
     * @return config
     */
    @javax.annotation.Nonnull
    public ChangeDetectionConfig getConfig() {
        return config;
    }

    public void setConfig(@javax.annotation.Nonnull ChangeDetectionConfig config) {
        this.config = config;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeDetection changeDetection = (ChangeDetection) o;
        return Objects.equals(this.id, changeDetection.id) &&
            Objects.equals(this.model, changeDetection.model) &&
            Objects.equals(this.config, changeDetection.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeDetection {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
        openapiFields.add("id");
        openapiFields.add("model");
        openapiFields.add("config");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("model");
        openapiRequiredFields.add("config");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ChangeDetection
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ChangeDetection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeDetection is not found in the empty JSON string",
                    ChangeDetection.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ChangeDetection.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                    String.format("The field `%s` in the JSON string is not defined in the `ChangeDetection` properties. JSON: %s", entry.getKey(),
                        jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ChangeDetection.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                    String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("model").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
        }
        // validate the required field `config`
        ChangeDetectionConfig.validateJsonElement(jsonObj.get("config"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ChangeDetection.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ChangeDetection' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ChangeDetection> thisAdapter
                = gson.getDelegateAdapter(this, TypeToken.get(ChangeDetection.class));

            return (TypeAdapter<T>) new TypeAdapter<ChangeDetection>() {
                @Override
                public void write(JsonWriter out, ChangeDetection value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public ChangeDetection read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }
            }.nullSafe();
        }
    }

    /**
     * Create an instance of ChangeDetection given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ChangeDetection
     * @throws IOException if the JSON string is invalid with respect to ChangeDetection
     */
    public static ChangeDetection fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ChangeDetection.class);
    }

    /**
     * Convert an instance of ChangeDetection to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

