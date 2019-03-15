package com.step.assignments.com.step.assignments.array.library;

import java.util.*;

public class Library {
  private ArrayList<Book> books;
  private List<Book> removedBooks;
  private Set<Reader> readers;
  private Map<Book, String> records;
  private Map<String, Set<Book>> booksOwnedByReaders;

  public Library() {
    this.books = new ArrayList<>();
    this.removedBooks = new ArrayList<>();
    this.readers = new HashSet<>();
    this.records = new HashMap<>();
    this.booksOwnedByReaders = new HashMap<>();
  }

  public Set getBooksOfReader(Reader reader) {
    Set AllBook = new HashSet();
    for (Book book : this.booksOwnedByReaders.get(reader.getName())) {
      AllBook.add(book.getBook());
    }
    return AllBook;
  }

  public boolean addUser(Reader reader) {
    if (this.readers.contains(reader)) return false;
    Set<Book> books = new HashSet<>();
    this.booksOwnedByReaders.put(reader.getName(), books);
    return this.readers.add(reader);
  }

  public boolean addBook(Book book) {
    if (this.books.contains(book)) return false;
    return this.books.add(book);
  }

  public boolean removeBook(Book book) {
    if (!this.books.contains(book)) return false;
    this.removedBooks.add(book);
    return this.books.remove(book);
  }

  public boolean isRemoved(Book book) {
    return this.removedBooks.contains(book);
  }

  public boolean lendBook(Book book, Reader reader) {
    if (!this.books.contains(book) && !reader.hasBorrowed(book)) return false;
    this.booksOwnedByReaders.get(reader.getName()).add(book);
    records.put(book, reader.getName());
    return books.remove(book);
  }

  public boolean takeBook(Reader reader, Book book) {
    reader.returnBook(book);
    this.booksOwnedByReaders.get(reader.getName()).remove(book);
    return this.books.add(book);
  }

  public boolean doesBookExists(Book book) {
    return this.books.contains(book);
  }

  public String whoBorrowed(Book book) {
    return this.records.get(book);
  }


}
