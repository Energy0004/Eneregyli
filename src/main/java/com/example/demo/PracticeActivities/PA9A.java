package com.example.demo.PracticeActivities;

import java.util.ArrayList;

public class PA9A {
    public static void main(String[] args){
        ArrayList<Number> arr = new ArrayList<>();
        arr.add(1);arr.add(2L);arr.add(3.00);arr.add(4.56f);
        System.out.println(sum(arr));
    }
    public static double sum(ArrayList<Number> array){
        double s = 0;
        for(int i = 0; i < array.size(); i++){
            s += array.get(i).doubleValue();
        }
        return s;
    }
}