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
 * Label Value derived from Label definition and Dataset Data
 */
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-02T20:53:38.158166061+01:00[Europe/Bratislava]",
    comments = "Generator version: 7.10.0")
public class LabelValue {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nonnull
    private Integer id;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_SCHEMA = "schema";
    @SerializedName(SERIALIZED_NAME_SCHEMA)
    @javax.annotation.Nonnull
    private SchemaDescriptor schema;

    public static final String SERIALIZED_NAME_VALUE = "value";
    @SerializedName(SERIALIZED_NAME_VALUE)
    @javax.annotation.Nullable
    private String value;

    public LabelValue() {
    }

    public LabelValue id(@javax.annotation.Nonnull Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Unique ID for Label Value
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

    public LabelValue name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Label name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nonnull String name) {
        this.name = name;
    }

    public LabelValue schema(@javax.annotation.Nonnull SchemaDescriptor schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Summary description of Schema
     *
     * @return schema
     */
    @javax.annotation.Nonnull
    public SchemaDescriptor getSchema() {
        return schema;
    }

    public void setSchema(@javax.annotation.Nonnull SchemaDescriptor schema) {
        this.schema = schema;
    }

    public LabelValue value(@javax.annotation.Nullable String value) {
        this.value = value;
        return this;
    }

    /**
     * Value value extracted from Dataset. This can be a scalar, array or JSON object
     *
     * @return value
     */
    @javax.annotation.Nullable
    public String getValue() {
        return value;
    }

    public void setValue(@javax.annotation.Nullable String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelValue labelValue = (LabelValue) o;
        return Objects.equals(this.id, labelValue.id) &&
            Objects.equals(this.name, labelValue.name) &&
            Objects.equals(this.schema, labelValue.schema) &&
            Objects.equals(this.value, labelValue.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, schema, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelValue {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
        openapiFields.add("name");
        openapiFields.add("schema");
        openapiFields.add("value");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("schema");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to LabelValue
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!LabelValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format("The required field(s) %s in LabelValue is not found in the empty JSON string",
                    LabelValue.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!LabelValue.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                    String.format("The field `%s` in the JSON string is not defined in the `LabelValue` properties. JSON: %s", entry.getKey(),
                        jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : LabelValue.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                    String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
        }
        // validate the required field `schema`
        SchemaDescriptor.validateJsonElement(jsonObj.get("schema"));
        if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!LabelValue.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LabelValue' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LabelValue> thisAdapter
                = gson.getDelegateAdapter(this, TypeToken.get(LabelValue.class));

            return (TypeAdapter<T>) new TypeAdapter<LabelValue>() {
                @Override
                public void write(JsonWriter out, LabelValue value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public LabelValue read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }
            }.nullSafe();
        }
    }

    /**
     * Create an instance of LabelValue given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LabelValue
     * @throws IOException if the JSON string is invalid with respect to LabelValue
     */
    public static LabelValue fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, LabelValue.class);
    }

    /**
     * Convert an instance of LabelValue to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

