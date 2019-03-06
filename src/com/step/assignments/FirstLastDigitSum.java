package com.step.assignments;

public class FirstLastDigitSum {
  public static void main(String[] args) {
    System.out.println(sumFirstAndLastDigit(257));
    System.out.println(sumFirstAndLastDigit(0));

  }

  public static int sumFirstAndLastDigit(int number) {
    if (number < 0) return -1;
    int firstDigit = number;
    while (firstDigit >= 10) {
      firstDigit = firstDigit / 10;
    }
    int lastDigit = number % 10;
    int sum = firstDigit + lastDigit;
    return sum;
  }

}
