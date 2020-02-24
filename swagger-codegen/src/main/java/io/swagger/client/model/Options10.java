/*
 * FIWARE-NGSI v2 Specification
 * TODO: Add a description
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Options10
 */
@JsonAdapter(Options10.Adapter.class)
public enum Options10 {
  
  APPEND("append"),
  
  KEYVALUES("keyValues");

  private String value;

  Options10(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Options10 fromValue(String text) {
    for (Options10 b : Options10.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Options10> {
    @Override
    public void write(final JsonWriter jsonWriter, final Options10 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Options10 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Options10.fromValue(String.valueOf(value));
    }
  }
}

