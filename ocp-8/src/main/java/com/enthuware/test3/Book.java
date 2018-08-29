/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 25/08/18
 */

public class Book {
    private int id;
    private String title;
    private String genre;
    private String author;

    public Book(String title, String genre, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static class BookFilter {
        public static boolean isFiction(Book b) {
            return b.getGenre().equals("fiction");
        }

    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("30 Days", "fiction", "K Larsen"),
                new Book("Fast Food Nation", "non-fiction", "Eric Schlosser"),
                new Book("Wired", "fiction", "D Richards"));
        books.stream()
                //.filter(new Book.BookFilter())
                .filter((Book b)->Book.BookFilter.isFiction(b))
                .forEach((Book b) -> System.out.print(b.getTitle() + ", "));
    }
}