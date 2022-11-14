package com.example.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookStorage implements Iterable<Book>{

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new Iterator<>() {
            private int count = 0;

            @Override
            public boolean hasNext() {
                return count < books.size();
            }

            @Override
            public Book next() {
                return books.get(count++);
            }
        };
    }
}
