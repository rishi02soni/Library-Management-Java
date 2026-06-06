package com.example.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book(1, "Clean Code", "Robert C. Martin"));
        library.addBook(new Book(2, "Effective Java", "Joshua Bloch"));
        library.addBook(new Book(3, "Design Patterns", "GoF"));

        System.out.println("=== Library Management System ===");
        library.displayBooks();
    }
}
