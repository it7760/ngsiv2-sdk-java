/*
 * FIWARE-NGSI v2 Specification
 * TODO: Add a description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Options23
 */
@JsonAdapter(Options23.Adapter.class)
public enum Options23 {
  
  COUNT("count");

  private String value;

  Options23(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Options23 fromValue(String value) {
    for (Options23 b : Options23.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Options23> {
    @Override
    public void write(final JsonWriter jsonWriter, final Options23 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Options23 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Options23.fromValue(value);
    }
  }
}

