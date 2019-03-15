package com.step.assignments.com.step.assignments.array.library;

import java.util.HashSet;
import java.util.Set;

public class Reader {

  private String name;
  Set borrowedBook;

  public Reader(String name) {
    this.name = name;
    borrowedBook = new HashSet<>();
  }

  public String getName() {
    return this.name;
  }

  public boolean borrowBook(Book book) {
    if (!this.borrowedBook.contains(book)) return false;
    return this.borrowedBook.add(book);
  }

  public boolean hasBorrowed(Book book) {
    return this.borrowedBook.contains(book);
  }

  public boolean returnBook(Book book) {
    if (!this.borrowedBook.contains(book)) return false;
    return this.borrowedBook.remove(book);
  }


}


