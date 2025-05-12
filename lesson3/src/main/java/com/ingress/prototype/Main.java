package com.ingress.prototype;

public class Main {
    public static void main(String[] args) {
        Book originalBook = new Book("Design Patterns", "GoF");
        Book clonedBook = (Book) originalBook.clone();

        clonedBook.setTitle("Prototype Pattern");

        System.out.println("Original: " + originalBook);
        System.out.println("Cloned: " + clonedBook);    }
}