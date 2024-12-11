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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import jakarta.annotation.Generated;

/**
 * ErrorDetails
 */
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-02T20:53:38.158166061+01:00[Europe/Bratislava]",
    comments = "Generator version: 7.10.0")
public class ErrorDetails {
    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    @javax.annotation.Nonnull
    private String type;

    public static final String SERIALIZED_NAME_CODE = "code";
    @SerializedName(SERIALIZED_NAME_CODE)
    @javax.annotation.Nullable
    private String code;

    public static final String SERIALIZED_NAME_PATH = "path";
    @SerializedName(SERIALIZED_NAME_PATH)
    @javax.annotation.Nullable
    private String path;

    public static final String SERIALIZED_NAME_EVALUATION_PATH = "evaluationPath";
    @SerializedName(SERIALIZED_NAME_EVALUATION_PATH)
    @javax.annotation.Nullable
    private String evaluationPath;

    public static final String SERIALIZED_NAME_SCHEMA_PATH = "schemaPath";
    @Deprecated
    @SerializedName(SERIALIZED_NAME_SCHEMA_PATH)
    @javax.annotation.Nullable
    private String schemaPath;

    public static final String SERIALIZED_NAME_SCHEMA_LOCATION = "schemaLocation";
    @SerializedName(SERIALIZED_NAME_SCHEMA_LOCATION)
    @javax.annotation.Nullable
    private String schemaLocation;

    public static final String SERIALIZED_NAME_INSTANCE_LOCATION = "instanceLocation";
    @SerializedName(SERIALIZED_NAME_INSTANCE_LOCATION)
    @javax.annotation.Nullable
    private String instanceLocation;

    public static final String SERIALIZED_NAME_PROPERTY = "property";
    @SerializedName(SERIALIZED_NAME_PROPERTY)
    @javax.annotation.Nullable
    private String property;

    public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
    @SerializedName(SERIALIZED_NAME_ARGUMENTS)
    @javax.annotation.Nullable
    private List<String> arguments = new ArrayList<>();

    public static final String SERIALIZED_NAME_DETAILS = "details";
    @SerializedName(SERIALIZED_NAME_DETAILS)
    @javax.annotation.Nullable
    private String details;

    public static final String SERIALIZED_NAME_MESSAGE_KEY = "messageKey";
    @SerializedName(SERIALIZED_NAME_MESSAGE_KEY)
    @javax.annotation.Nullable
    private String messageKey;

    public static final String SERIALIZED_NAME_VALID = "valid";
    @SerializedName(SERIALIZED_NAME_VALID)
    @javax.annotation.Nullable
    private Boolean valid;

    public static final String SERIALIZED_NAME_MESSAGE = "message";
    @SerializedName(SERIALIZED_NAME_MESSAGE)
    @javax.annotation.Nonnull
    private String message;

    public ErrorDetails() {
    }

    public ErrorDetails type(@javax.annotation.Nonnull String type) {
        this.type = type;
        return this;
    }

    /**
     * Validation Error type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    public String getType() {
        return type;
    }

    public void setType(@javax.annotation.Nonnull String type) {
        this.type = type;
    }

    public ErrorDetails code(@javax.annotation.Nullable String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     */
    @javax.annotation.Nullable
    public String getCode() {
        return code;
    }

    public void setCode(@javax.annotation.Nullable String code) {
        this.code = code;
    }

    public ErrorDetails path(@javax.annotation.Nullable String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     */
    @javax.annotation.Nullable
    public String getPath() {
        return path;
    }

    public void setPath(@javax.annotation.Nullable String path) {
        this.path = path;
    }

    public ErrorDetails evaluationPath(@javax.annotation.Nullable String evaluationPath) {
        this.evaluationPath = evaluationPath;
        return this;
    }

    /**
     * Get evaluationPath
     *
     * @return evaluationPath
     */
    @javax.annotation.Nullable
    public String getEvaluationPath() {
        return evaluationPath;
    }

    public void setEvaluationPath(@javax.annotation.Nullable String evaluationPath) {
        this.evaluationPath = evaluationPath;
    }

    @Deprecated
    public ErrorDetails schemaPath(@javax.annotation.Nullable String schemaPath) {
        this.schemaPath = schemaPath;
        return this;
    }

    /**
     * Get schemaPath
     *
     * @return schemaPath
     * @deprecated
     */
    @Deprecated
    @javax.annotation.Nullable
    public String getSchemaPath() {
        return schemaPath;
    }

    @Deprecated
    public void setSchemaPath(@javax.annotation.Nullable String schemaPath) {
        this.schemaPath = schemaPath;
    }

    public ErrorDetails schemaLocation(@javax.annotation.Nullable String schemaLocation) {
        this.schemaLocation = schemaLocation;
        return this;
    }

    /**
     * Get schemaLocation
     *
     * @return schemaLocation
     */
    @javax.annotation.Nullable
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(@javax.annotation.Nullable String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public ErrorDetails instanceLocation(@javax.annotation.Nullable String instanceLocation) {
        this.instanceLocation = instanceLocation;
        return this;
    }

    /**
     * Get instanceLocation
     *
     * @return instanceLocation
     */
    @javax.annotation.Nullable
    public String getInstanceLocation() {
        return instanceLocation;
    }

    public void setInstanceLocation(@javax.annotation.Nullable String instanceLocation) {
        this.instanceLocation = instanceLocation;
    }

    public ErrorDetails property(@javax.annotation.Nullable String property) {
        this.property = property;
        return this;
    }

    /**
     * Get property
     *
     * @return property
     */
    @javax.annotation.Nullable
    public String getProperty() {
        return property;
    }

    public void setProperty(@javax.annotation.Nullable String property) {
        this.property = property;
    }

    public ErrorDetails arguments(@javax.annotation.Nullable List<String> arguments) {
        this.arguments = arguments;
        return this;
    }

    public ErrorDetails addArgumentsItem(String argumentsItem) {
        if (this.arguments == null) {
            this.arguments = new ArrayList<>();
        }
        this.arguments.add(argumentsItem);
        return this;
    }

    /**
     * Get arguments
     *
     * @return arguments
     */
    @javax.annotation.Nullable
    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(@javax.annotation.Nullable List<String> arguments) {
        this.arguments = arguments;
    }

    public ErrorDetails details(@javax.annotation.Nullable String details) {
        this.details = details;
        return this;
    }

    /**
     * Get details
     *
     * @return details
     */
    @javax.annotation.Nullable
    public String getDetails() {
        return details;
    }

    public void setDetails(@javax.annotation.Nullable String details) {
        this.details = details;
    }

    public ErrorDetails messageKey(@javax.annotation.Nullable String messageKey) {
        this.messageKey = messageKey;
        return this;
    }

    /**
     * Get messageKey
     *
     * @return messageKey
     */
    @javax.annotation.Nullable
    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(@javax.annotation.Nullable String messageKey) {
        this.messageKey = messageKey;
    }

    public ErrorDetails valid(@javax.annotation.Nullable Boolean valid) {
        this.valid = valid;
        return this;
    }

    /**
     * Get valid
     *
     * @return valid
     */
    @javax.annotation.Nullable
    public Boolean getValid() {
        return valid;
    }

    public void setValid(@javax.annotation.Nullable Boolean valid) {
        this.valid = valid;
    }

    public ErrorDetails message(@javax.annotation.Nonnull String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     */
    @javax.annotation.Nonnull
    public String getMessage() {
        return message;
    }

    public void setMessage(@javax.annotation.Nonnull String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorDetails errorDetails = (ErrorDetails) o;
        return Objects.equals(this.type, errorDetails.type) &&
            Objects.equals(this.code, errorDetails.code) &&
            Objects.equals(this.path, errorDetails.path) &&
            Objects.equals(this.evaluationPath, errorDetails.evaluationPath) &&
            Objects.equals(this.schemaPath, errorDetails.schemaPath) &&
            Objects.equals(this.schemaLocation, errorDetails.schemaLocation) &&
            Objects.equals(this.instanceLocation, errorDetails.instanceLocation) &&
            Objects.equals(this.property, errorDetails.property) &&
            Objects.equals(this.arguments, errorDetails.arguments) &&
            Objects.equals(this.details, errorDetails.details) &&
            Objects.equals(this.messageKey, errorDetails.messageKey) &&
            Objects.equals(this.valid, errorDetails.valid) &&
            Objects.equals(this.message, errorDetails.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, code, path, evaluationPath, schemaPath, schemaLocation, instanceLocation, property, arguments, details, messageKey,
            valid, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorDetails {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    evaluationPath: ").append(toIndentedString(evaluationPath)).append("\n");
        sb.append("    schemaPath: ").append(toIndentedString(schemaPath)).append("\n");
        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    instanceLocation: ").append(toIndentedString(instanceLocation)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    messageKey: ").append(toIndentedString(messageKey)).append("\n");
        sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
        openapiFields.add("code");
        openapiFields.add("path");
        openapiFields.add("evaluationPath");
        openapiFields.add("schemaPath");
        openapiFields.add("schemaLocation");
        openapiFields.add("instanceLocation");
        openapiFields.add("property");
        openapiFields.add("arguments");
        openapiFields.add("details");
        openapiFields.add("messageKey");
        openapiFields.add("valid");
        openapiFields.add("message");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("type");
        openapiRequiredFields.add("message");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ErrorDetails
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ErrorDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format("The required field(s) %s in ErrorDetails is not found in the empty JSON string",
                    ErrorDetails.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ErrorDetails.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                    String.format("The field `%s` in the JSON string is not defined in the `ErrorDetails` properties. JSON: %s", entry.getKey(),
                        jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ErrorDetails.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                    String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
        }
        if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
        }
        if ((jsonObj.get("evaluationPath") != null && !jsonObj.get("evaluationPath").isJsonNull()) && !jsonObj.get("evaluationPath")
            .isJsonPrimitive()) {
            throw new IllegalArgumentException(
                String.format("Expected the field `evaluationPath` to be a primitive type in the JSON string but got `%s`",
                    jsonObj.get("evaluationPath").toString()));
        }
        if ((jsonObj.get("schemaPath") != null && !jsonObj.get("schemaPath").isJsonNull()) && !jsonObj.get("schemaPath").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `schemaPath` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("schemaPath").toString()));
        }
        if ((jsonObj.get("schemaLocation") != null && !jsonObj.get("schemaLocation").isJsonNull()) && !jsonObj.get("schemaLocation")
            .isJsonPrimitive()) {
            throw new IllegalArgumentException(
                String.format("Expected the field `schemaLocation` to be a primitive type in the JSON string but got `%s`",
                    jsonObj.get("schemaLocation").toString()));
        }
        if ((jsonObj.get("instanceLocation") != null && !jsonObj.get("instanceLocation").isJsonNull()) && !jsonObj.get("instanceLocation")
            .isJsonPrimitive()) {
            throw new IllegalArgumentException(
                String.format("Expected the field `instanceLocation` to be a primitive type in the JSON string but got `%s`",
                    jsonObj.get("instanceLocation").toString()));
        }
        if ((jsonObj.get("property") != null && !jsonObj.get("property").isJsonNull()) && !jsonObj.get("property").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `property` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("property").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("arguments") != null && !jsonObj.get("arguments").isJsonNull() && !jsonObj.get("arguments").isJsonArray()) {
            throw new IllegalArgumentException(
                String.format("Expected the field `arguments` to be an array in the JSON string but got `%s`", jsonObj.get("arguments").toString()));
        }
        if ((jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) && !jsonObj.get("details").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("details").toString()));
        }
        if ((jsonObj.get("messageKey") != null && !jsonObj.get("messageKey").isJsonNull()) && !jsonObj.get("messageKey").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `messageKey` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("messageKey").toString()));
        }
        if (!jsonObj.get("message").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("message").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ErrorDetails.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ErrorDetails' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ErrorDetails> thisAdapter
                = gson.getDelegateAdapter(this, TypeToken.get(ErrorDetails.class));

            return (TypeAdapter<T>) new TypeAdapter<ErrorDetails>() {
                @Override
                public void write(JsonWriter out, ErrorDetails value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public ErrorDetails read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }
            }.nullSafe();
        }
    }

    /**
     * Create an instance of ErrorDetails given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ErrorDetails
     * @throws IOException if the JSON string is invalid with respect to ErrorDetails
     */
    public static ErrorDetails fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ErrorDetails.class);
    }

    /**
     * Convert an instance of ErrorDetails to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

