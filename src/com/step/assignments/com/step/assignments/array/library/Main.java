package com.step.assignments.com.step.assignments.array.library;
//
//public class Main {
//
//  public static void main(String[] args) {
//    Reader reader = new Reader("Gaurav");
//    Library library = new Library();
//    Book  book1 = new Book("GITA");
//    Book  book2 = new Book("Chanda Mama");
//    Book  book3 = new Book("INDIA");
//    Book  book4 = new Book("God Is One");
//    Book  book5 = new Book("Ramayana");
//    Book  book6 = new Book("Our Nation");
//    library.addBook(book1);
//    library.addBook(book2);
//    library.addBook(book3);
//    library.addBook(book4);
//    library.addBook(book5);
//
//    library.removeBook(book6);
//
//
//
//    library.addUser(reader);
//    library.lendBook(book1, reader);
//    library.lendBook(book4, reader);
//    library.lendBook(book2, reader);
//
//    System.out.println(reader.hasBorrowed(book1));
//    System.out.println(reader.hasBorrowed(book6));
//    System.out.println(library.whoBorrowed(book1));
//
//    library.takeBook(reader, book2);
//
//    System.out.println(library.doesBookExists(new Book("New book")));
//    System.out.println(library.doesBookExists(book1));
//    System.out.println(library.doesBookExists(book5));
//
//    System.out.println(library.isRemoved(book1));
//    System.out.println(library.isRemoved(book6));
//
//    System.out.println(library.getBooksOfReader(reader));
//  }
//
//}


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Library library = new Library();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to library.");
    while (true) {
      System.out.println("Enter Choice.");
      int choice = Integer.parseInt(scanner.nextLine());
      switch (choice) {
        case 1:
          System.out.println("Reader Name to insert");
          String readerName = scanner.nextLine();
          boolean wasSuccessful = library.addUser(new Reader(readerName));
          System.out.println(wasSuccessful ? "Added Successfully" : "Already Exist");
          break;

        case 2:
          System.out.println("Book Name to insert");
          String bookname = scanner.nextLine();
          wasSuccessful = library.addBook(new Book(bookname));
          System.out.println(wasSuccessful ? "Added Successfully" : "Already Exist");
          break;

        case 3:
          System.out.println("Showing Library details");
          System.out.println(library);
          break;

        default:
          System.out.println("Quitting Library");
          System.exit(0);
      }
    }
  }
}