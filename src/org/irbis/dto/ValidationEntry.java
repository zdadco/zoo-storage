package org.irbis.dto;

public class ValidationEntry {
    private String country;
    private int requiredCount;

    public ValidationEntry(String country, int requiredCount) {
        this.country = country;
        this.requiredCount = requiredCount;
    }

    public String getCountry() {
        return country;
    }

    public int getRequiredCount() {
        return requiredCount;
    }
}
