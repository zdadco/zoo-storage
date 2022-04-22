package org.irbis.service;

import org.irbis.dto.ValidationEntry;
import org.irbis.entity.Animal;

public class LineParser {

    public Animal parseAnimal(String line) {
        // write your code here
        return null; // TODO delete
    }

    public ValidationEntry parseValidationEntry(String line) {
        String[] lineParts = line.split(":");
        return new ValidationEntry(lineParts[0], Integer.parseInt(lineParts[1]));
    }
}
