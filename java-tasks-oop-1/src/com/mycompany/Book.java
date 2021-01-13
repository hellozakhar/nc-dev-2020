package com.mycompany;

import java.util.LinkedList;
import java.util.Objects;

public class Book {
    private String name;
    private LinkedList<Author> authors;
    private double price;
    private int qty = 0;

    public Book(String name, LinkedList<Author> authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, LinkedList<Author> authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public LinkedList<Author> getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuffer authorNames = new StringBuffer();
        authorNames.append(authors.toString());
        authorNames.setCharAt(0, '{');
        authorNames.setCharAt(authorNames.length() - 1, '}');

        return "Book[" +
                "name='" + name + '\'' +
                ",authors=" + authorNames.toString() +
                ",price=" + price +
                ",qty=" + qty +
                ']';
    }

    public java.lang.String getAuthorNames() {

        if (authors.size() != 0) {
            StringBuffer authorNames = new StringBuffer();

            for (Author author : authors) {
                authorNames.append(author.getName());
                authorNames.append(',');
            }

            // deleting ',' in the end
            authorNames.deleteCharAt(authorNames.length()-1);

            return authorNames.toString();
        }

        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Double.compare(book.getPrice(), getPrice()) == 0 && getQty() == book.getQty() && Objects.equals(getName(), book.getName()) && Objects.equals(getAuthors(), book.getAuthors());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthors(), getPrice(), getQty());
    }
}
