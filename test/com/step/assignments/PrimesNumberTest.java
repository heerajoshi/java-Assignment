package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimesNumberTest {

  @Test
  void shouldReturnTrueForInputFive() {
  boolean output = PrimesNumber.isPrimes(5);
  assertEquals(true,output);
  }
}