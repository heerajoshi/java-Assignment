package com.step.assignments.com.step.assignments.array;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {
  private List<Integer> list;
  private int currentIndex;

  public ListIterator(List<Integer> list) {
    this.list = list;
    this.currentIndex = -1;

  }

  public Boolean hasNext() {
    return this.list.size() > (this.currentIndex+1);
  }


  public Object next() {
    if (this.hasNext()) {
      return this.list.get(++this.currentIndex);
    }
    return new NoSuchElementException();
  }

}
