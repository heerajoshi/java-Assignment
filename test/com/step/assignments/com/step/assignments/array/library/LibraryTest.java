package com.step.assignments.com.step.assignments.array.library;

//import org.junit.jupiter.api.BeforeEach;
//        import org.junit.jupiter.api.Test;
//
//        import java.util.HashSet;
//        import java.util.Set;
//
//        import static org.junit.jupiter.api.Assertions.*;
//
//class LibraryTest {
//  Library library;
//
//  @BeforeEach
//  void setUp() {
//    library = new Library();
//  }
//
//  @Test
//  void addReader() {
//    Reader reader = new Reader("Gaurav");
//    assertTrue(library.addUser(reader));
//  }
//
//  @Test
//  void addBook() {
//    assertTrue(library.addBook(new Book("A")));
//  }
//
//  @Test
//  void removeBook() {
//    library.addBook(new Book("A"));
//    library.addBook(new Book("B"));
//    assertTrue(library.removeBook(new Book("A")));
//    assertFalse(library.removeBook(new Book("C")));
//  }
//
//  @Test
//  void isRemoved() {
//    library.addBook(new Book("A"));
//    library.addBook(new Book("B"));
//
//    library.removeBook(new Book("A"));
//
//    assertFalse(library.isRemoved(new Book("B")));
//    assertTrue(library.isRemoved(new Book("A"));
//  }
//
//  @Test
//  void lendBook() {
//    Reader reader = new Reader("Gaurav");
//    library.addUser(reader);
//    library.addBook(new Book("A"));
//    assertTrue(library.lendBook(new Book("A"), reader));
//  }
//
//  @Test
//  void takeBook() {
//    Reader reader = new Reader("Gaurav");
//    library.addUser(reader);
//
//    library.addBook(new Book("A"));
//    library.addBook(new Book("B"));
//
//    library.lendBook(new Book("A"), reader);
//    assertTrue(library.takeBook(reader, new Book("A")));
//  }
//
//  @Test
//  void doesBookExists() {
//    library.addBook(new Book("A"));
//    library.addBook(new Book("B"));
//
//    assertTrue(library.doesBookExists(new Book("A")));
//    assertFalse(library.doesBookExists(new Book("A")));
//  }
//
//  @Test
//  void whoHasBorrowed() {
//    Reader reader = new Reader("Gaurav");
//    library.addUser(reader);
//
//    library.addBook(new Book("A"));
//    library.addBook(new Book("B"));
//
//    library.lendBook(new Book("A"), reader);
//    assertEquals("Gaurav", library.whoBorrowed(new Book("A")));
//  }
//
//  @Test
//  void getBooksOfReader() {
//    Reader reader = new Reader("Gaurav");
//    library.addUser(reader);
//
//    library.addBook(new Book("A"));
//    library.addBook(new Book("B"));
//
//    library.lendBook(new Book("A"), reader);
//    library.lendBook(new Book("B"), reader);
//    Set<String> userBooks = new HashSet<>();
//    userBooks.add("A");
//    userBooks.add("B");
//    assertEquals(userBooks, library.getBooksOfReader(reader));
//  }
//}