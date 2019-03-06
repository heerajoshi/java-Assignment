package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOddRangeTest {

  @Test
  void shouldReturnTrueForGivenOddNo() {
    boolean odd = SumOddRange.isOdd(5);
    assertEquals(true,odd);

  }

  @Test
  void ShouldReturnSumOfFirst10Number() {
    int sumOdd = SumOddRange.sumOdd(1, 10);
    assertEquals(25,sumOdd);

  }
}