package com.example.hellociclone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {

  @Test
  public void testAdd() {
    Sample sample = new Sample();
    assertEquals(4, sample.add(1, 3));
  }

  @Test
  public void testSubtract() {
    Sample sample = new Sample();
    assertEquals(-2, sample.subtract(1, 3));
  }
}
