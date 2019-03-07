package com.step.assignments;

public class FactorPrinter {
  public static void main(String[] args) {
  printFactor(32);
  }

  public static void printFactor(int number){
    if(number<1){
      System.out.println("Invalid Value");
      return;
    }

    for(int i=1;i<=number;i++){
      if(number%i==0){
        System.out.println(i);
      }
    }

  }
}
