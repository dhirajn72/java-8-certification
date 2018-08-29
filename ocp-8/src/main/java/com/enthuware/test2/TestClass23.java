/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Dhiraj
 * @date 26/08/18
 */
public class TestClass23 {
    public static void main(String[] args) {
        List<Book> books = getBooksByAuthor("Ludlum");
        books.stream().sorted().forEach(b->System.out.println(b.getIsbn())); //1
    }

    private static List<Book> getBooksByAuthor(String ludlum) {
        List<Book> books= Arrays.asList(new Book("1","Title1"),
                new Book("2","Title2"),
                new Book("3","Title3"),
                new Book("4","Title4"),
                new Book("5","Title5")
                );
        return books;
    }


}



 class Book implements Comparable{
    String isbn;
    String title;
    public Book(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }

     public String getIsbn() {
         return isbn;
     }

     public void setIsbn(String isbn) {
         this.isbn = isbn;
     }

     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     @Override
     public int compareTo(Object o) {
        if (o instanceof Book){
            Book b=(Book)o;
            return b.isbn.compareTo(this.isbn)  ;
            //Comparator.comparing(Book::getIsbn).thenComparing(Book::getTitle);
        }
         return -1;
     }
 }


