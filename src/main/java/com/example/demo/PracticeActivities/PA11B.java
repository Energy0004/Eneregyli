package com.example.demo.PracticeActivities;

import java.util.*;

public class PA11B {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        String s = v.next().toUpperCase();
        char[] a = s.toCharArray();
        System.out.print("char[] {");
        for (int i = 0; i < a.length-1; i++) {
            System.out.print("'"+a[i]+"',");
        }
        System.out.println("'"+a[a.length-1]+"'}");
        countCharacter(a);
    }
    public static void countCharacter(char[] arr){
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else
                map.put(arr[i], 1);
        }
        String s = "HashMap {";
        for (Map.Entry<Character, Integer> c : map.entrySet()) {
            s += "'"+c.getKey()+"':"+c.getValue()+',';
        }
        System.out.println(s.substring(0,s.length()-1)+"}");
    }
}