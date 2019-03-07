package com.step.assignments;

public class Circle {
  double radius;

  public Circle(double radius) {
    this.radius = radius;
    if (radius < 0) {
      this.radius = 0;
    }
  }

  public double getRadius() {
    return radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }


}

