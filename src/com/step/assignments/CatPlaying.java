package com.step.assignments;

public class CatPlaying {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 35));

    }
    public static Boolean isCatPlaying(boolean summer,int temperature){
        if(summer&& temperature >= 25&& temperature<=35) return true;
        if(temperature >= 25&& temperature<=45)return true;
        return false;
    }
}
