package org.irbis.service;

import org.irbis.dto.ValidationEntry;

import java.util.List;

public class ZooStorageValidator {
    private ValidationEntry[] entries;

    public ZooStorageValidator(ValidationEntry[] entries) {
        this.entries = entries;
    }

    public static ZooStorageValidator buildValidator(LineParser lineParser, String path) {
        List<String> lines = FileReader.readAllLines(path);
        ValidationEntry[] entries = new ValidationEntry[lines.size()];
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            entries[i] = lineParser.parseValidationEntry(line);
        }
        return new ZooStorageValidator(entries);
    }

    public void validateAnimalsCountFromCountry(String country, int count) {
        for (ValidationEntry entry : entries) {
            if (entry.getCountry().equals(country)) {
                if (entry.getRequiredCount() == count) {
                    System.out.printf("Actual animals count (%d) from %s in normal.%n", count, country);
                } else {
                    System.out.printf(
                            "Actual animal count (%d) from %s not equals required count in document (%d).%n",
                            count, count, entry.getRequiredCount()
                    );
                    throw new RuntimeException("Animals count not like required");
                }
            }
        }

    }

}
