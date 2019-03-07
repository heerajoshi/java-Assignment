package com.step.assignments;

public class Cylinder extends Circle{
  double height;

  public Cylinder(double radius, double height) {
    super(radius);
    this.height = height;
    this.radius = radius;
    if(height<0){
      this.height = 0;
    }
  }

  public double getHeight() {
    return height;
  }

  public double getVolume(){
    return getArea()*height;
  }
}
