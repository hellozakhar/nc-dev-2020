package com.mycompany;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return gender == author.gender && Objects.equals(getName(), author.getName()) && Objects.equals(email, author.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), email, gender);
    }
}
