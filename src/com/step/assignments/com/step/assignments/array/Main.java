package com.step.assignments.com.step.assignments.array;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List <Integer> list = new ArrayList<Integer>();
    list.add(6);
    list.add(7);
    list.add(9);
    list.add(10);
    list.add(11);
    list.add(12);


    ListIterator listIterator = new ListIterator(list);
        while(listIterator.hasNext()){
          System.out.println(listIterator.next());

        }

  }
}
