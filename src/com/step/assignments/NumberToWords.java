package com.step.assignments;

public class NumberToWords extends NumberInWord {
  public static void main(String[] args) {
    System.out.println(reverse(-1234));
    System.out.println(reverse(100));
    System.out.println(getDigitCount(1234));
    numberToWords(1234);
    System.out.println("==================================================");
    numberToWords(1000);

  }

  public static int reverse(int number) {
    String reverseNum = "";

    if (number < 0) {
      number = Math.abs(number);
      reverseNum = "-";
    }
    while (number > 0) {
      int lastDigit = number % 10;
      number = number / 10;
      reverseNum = reverseNum + lastDigit;
    }
    return Integer.parseInt(reverseNum);
  }


  public static int getDigitCount(int number) {
    if (number < 0) return -1;
    int digitCount = 0;
    while (number > 0) {
      number = number / 10;
      digitCount++;
    }
    return digitCount;
  }

  public static void numberToWords(int number) {
    if (number < 0) {
      System.out.println("Invalid Value");
      return;
    }

    int digitCount = getDigitCount(number);
    int reverseNumber = reverse(number);
    int reverseNumberDigitCount = getDigitCount(reverseNumber);
    String reverseNumberWithZero = "";
    while (reverseNumber > 0) {
      int lastDigit = reverseNumber % 10;
      reverseNumber = reverseNumber / 10;
      printNumberInWord(lastDigit);

    }
    int difference = digitCount - reverseNumberDigitCount;
    for (int i = 0; i < difference; i++) {
      reverseNumberWithZero = reverseNumberWithZero + "0";
      System.out.println("Zero");
    }

  }
}
