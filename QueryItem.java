package dev.lpa.util;

import dev.lpa.model.Student;

public interface QueryItem {
    public boolean matchFieldValue(String fieldName, String value);
}
