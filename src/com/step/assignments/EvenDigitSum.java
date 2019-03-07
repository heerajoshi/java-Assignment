package com.step.assignments;

public class EvenDigitSum {
  public static void main(String[] args) {
    System.out.println(getEvenDigitSum(123456789));

  }


  public static int getEvenDigitSum(int number) {
    if (number < 0) return -1;
    int sum = 0;
    int lastDigit = 0;
    while (number > 0) {
      lastDigit = number % 10;
      if (isEven(lastDigit)) {
        sum = sum + lastDigit;
      }
      number = number / 10;
    }
    return sum;
  }

  public static boolean isEven(int number) {
    if (number % 2 == 0) return true;
    return false;
  }

}


