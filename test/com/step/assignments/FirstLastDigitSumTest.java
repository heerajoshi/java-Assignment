package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLastDigitSumTest {
  @Test
  void ShoudReturnSumOfFirstOrLastDigit() {
    int sum = FirstLastDigitSum.sumFirstAndLastDigit(349);
    assertEquals(12,sum);
  }
}