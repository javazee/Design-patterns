package com.example.patterns.behavioral.iterator;

import java.util.Iterator;

public class BooksStorageRunner {
    public static void main(String[] args) {
        BookStorage bookStorage = new BookStorage();
        bookStorage.addBook(new Book("Charlz Bukovski", "The women"));
        bookStorage.addBook(new Book("Sergey Dovlatov", "The chemodan"));
        bookStorage.addBook(new Book("Lev Tolstoy", "War and peace"));
        bookStorage.addBook(new Book("Varlam Shalamov", "Kolyma stories"));
        bookStorage.addBook(new Book("George Orwell", "1984"));

        Iterator<Book> iterator = bookStorage.iterator();
        System.out.println("Books[author: title]: ");
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getAuthor() + ": " + book.getTitle());
        }
    }
}
