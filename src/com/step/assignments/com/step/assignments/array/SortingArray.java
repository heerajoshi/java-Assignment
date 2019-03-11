package com.step.assignments.com.step.assignments.array;

public class SortingArray {

  public static void main(String[] args) {
    shortArray();

  }
  public static void shortArray(){
    int numbers[] = {1,23,9,45,67,};
    int temp;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        if(numbers[i] < numbers[j]){
          temp = numbers[i];
          numbers[i]=numbers[j];
          numbers[j] = temp;
        }
      }
    }
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}
