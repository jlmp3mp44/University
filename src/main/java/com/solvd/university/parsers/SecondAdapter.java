package com.solvd.university.parsers;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SecondAdapter extends JsonDeserializer<LocalDate> {
    @Override
    public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        String localDateString = jsonParser.readValueAs(String.class);

        if (localDateString != null && !localDateString.isEmpty()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
            return LocalDate.parse(localDateString, formatter);
        } else
            return null;
    }
}
