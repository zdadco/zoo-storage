package org.irbis.entity;

public class Animal {
    private String country;
    private String name;
    private String type;
    private int age;
    private String[] foods;
    // write your fields here if needed


    public Animal(String country, String name, String type, int age, String[] foods) {
        this.country = country;
        this.name = name;
        this.type = type;
        this.age = age;
        this.foods = foods;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String[] getFoods() {
        return foods;
    }
}
