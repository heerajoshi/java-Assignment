package com.step.assignments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {
  @Test
  @DisplayName("should Return 6 for 12 or 30")

  void ShouldReturnSixFor() {

    int greatestCommonDivisor = GreatestCommonDivisor.getGreatestCommonDivisor(12, 30);
    assertEquals(6,greatestCommonDivisor);
  }
}