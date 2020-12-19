package com.mycompany;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, java-tasks-oop-1!");

        System.out.println("\nCircle Class Test");
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());
        System.out.println("circle1.getArea(): " + circle1.getArea());

        System.out.println("\nRectangle Class Test");
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.toString());
        System.out.println("rectangle1.getArea(): " + rectangle1.getArea());
        System.out.println("rectangle1.getPerimeter(): " + rectangle1.getPerimeter());

        System.out.println("\nEmployee Class Test");
        Employee employee1 = new Employee(100, "Joe", "Average", 5000);
        System.out.println(employee1.toString());
        System.out.println("employee1.raiseSalary(10): " + employee1.raiseSalary(10));
        System.out.println(employee1.toString());
        System.out.println("employee1.getAnnualSalary(): " + employee1.getAnnualSalary());

        System.out.println("\nAuthor Class Test");
        LinkedList<Author> authorbook1 = new LinkedList<>();
        Author author1 = new Author();
        author1.setName("Нил Гейман");
        Author author2 = new Author();
        author2.setName("Терри Пратчетт");
        authorbook1.add(author1);
        authorbook1.add(author2);
        Book book1 = new Book("Добрые предзнаменования", authorbook1, 1.0, 2);
        System.out.println(book1.getAuthorNames());
        System.out.println(book1.toString());

        System.out.println("\nMyPoint Class Test");
        MyPoint p1 = new MyPoint();
        p1.setX(6);
        p1.setY(4);
        System.out.println("p1.toString(): " + p1.toString());
        System.out.println("p1.distance(): " + p1.distance());
        System.out.println("p1.distance(1,1): " + p1.distance(1, 1));

        System.out.println("\nMyTriangle Class Test");
        MyTriangle t1 = new MyTriangle(1, 1, 3, 2, -4, -1);
        MyPoint p2 = new MyPoint(4, 2);
        MyPoint p3 = new MyPoint(4, 6);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        MyTriangle t3 = new MyTriangle(0, 0, 5, 0, 0, 5);
        System.out.println("t1.toString(): " + t1.toString());
        System.out.println("t2.toString(): " + t2.toString());
        System.out.println("t3.toString(): " + t3.toString());
        System.out.println("t1.getPerimeter(): " + t1.getPerimeter());
        System.out.println("t1.getType(): " + t1.getType());
        System.out.println("t2.getType(): " + t2.getType());
        System.out.println("t3.getType(): " + t3.getType());
        System.out.println("p1.toString(): " + p1.toString());
        System.out.println("p2.toString(): " + p2.toString());
        System.out.println("p3.toString(): " + p3.toString());
        System.out.println("p1.distance(p2)" + p1.distance(p2));
        System.out.println("p2.distance(p3)" + p2.distance(p3));
        System.out.println("p3.distance(p1)" + p3.distance(p1));
    }
}
