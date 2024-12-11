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

import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Gets or Sets SortDirection
 */
@JsonAdapter(SortDirection.Adapter.class)
public enum SortDirection {

    ASCENDING("Ascending"),

    DESCENDING("Descending");

    private String value;

    SortDirection(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SortDirection fromValue(String value) {
        for (SortDirection b : SortDirection.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SortDirection> {
        @Override
        public void write(final JsonWriter jsonWriter, final SortDirection enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SortDirection read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SortDirection.fromValue(value);
        }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        String value = jsonElement.getAsString();
        SortDirection.fromValue(value);
    }
}

