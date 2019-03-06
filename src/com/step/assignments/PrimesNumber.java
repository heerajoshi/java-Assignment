package com.step.assignments;

public class PrimesNumber {
  public static void main(String[] args) {
    System.out.println(isPrimes(4));
    printThousandPrimeNo();

  }

  public static Boolean isPrimes(int number) {
    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) return false;
    }
    return true;
  }

  public static void printThousandPrimeNo() {
    int count = 1;
    int countPrime = 0;
    while (countPrime < 1000) {
      count++;
      if (isPrimes(count)) {
        System.out.println(count);
        countPrime++;
      }
    }
  }

}

