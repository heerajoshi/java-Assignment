package com.step.assignments;

public class SumOddRange {
  public static void main(String[] args) {

    System.out.println(isOdd(5));
    System.out.println(sumOdd(100,1000));
    System.out.println(sumOdd(1,10));
  }

  public static boolean isOdd(int number){
    if(number%2==0)return false;
    return true;
  }
  public static int sumOdd(int start,int end){
    if(start<0)return -1;
    if(start>end)return -1;
    int sum =0;
    int candidate;
    for(candidate = start;candidate<=end;candidate++){

      if(isOdd(candidate)){
        sum += candidate;
      }
    }
    return sum;

  }

}
