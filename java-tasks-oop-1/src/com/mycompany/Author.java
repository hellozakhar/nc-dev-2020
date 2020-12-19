package com.mycompany;

public class Author {
    private String name;
    private String email;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name='" + name + '\'' +
                ",email='" + email + '\'' +
                ",gender=" + gender +
                ']';
    }
}
