package com.step.assignments;

public class GreatestCommonDivisor {
  public static void main(String[] args) {
    System.out.println(getGreatestCommonDivisor(81,153));
    System.out.println(getGreatestCommonDivisor(12,30));

  }

  public static int getGreatestCommonDivisor(int first,int second){
    if(first<10||second<10)return -1;
    int lowestNum = Math.min(first,second);
    int highestNum = Math.max(first,second);
    int hcf = 1;
    for(int i =1;i<=lowestNum;i++){
      if(highestNum%i==0&&lowestNum%i==0){
        hcf = i;
      }
    }
    return hcf;
  }
}
