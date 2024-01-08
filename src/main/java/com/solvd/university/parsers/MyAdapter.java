package com.solvd.university.parsers;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyAdapter extends XmlAdapter<String, LocalDate> {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public LocalDate unmarshal(String s) throws Exception {
        if (s == null || s.isEmpty()) {
            return null;
        }
        return LocalDate.parse(s, formatter);
    }

    @Override
    public String marshal(LocalDate localDate) throws Exception {
        if (localDate == null) {
            return null;
        }
        return localDate.format(formatter);
    }
}

