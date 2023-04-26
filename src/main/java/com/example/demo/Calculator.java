package com.example.demo;

import java.util.*;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner v = new Scanner(System.in);
        String a = v.next();
        String b = v.next();
        String c = v.next();
        try {
            if (Integer.parseInt(a) > 10 || Integer.parseInt(a) <= 0 || Integer.parseInt(c) > 10 || Integer.parseInt(c) <= 0) {
                throw new ArithmeticException("The numbers must be between 1 and 10.");
            }else if(!b.equals("+") && !b.equals("-") && !b.equals("*") && !b.equals("/")){
                throw new ArithmeticException("Wrong operation.");
            }else
                System.out.println(calculate(a, b, c));
        }catch (Exception e){
            System.out.println(calculate(a, b, c));
        }
    }
    static String calculate(String s1, String s2, String s3) throws Exception {
        List<String> rim = Arrays.asList("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX","X");
        if(rim.contains(s1) && rim.contains(s3)) {
            int n1 = 0, n2 = 0, result = 0;
            for (int i = 0; i < rim.size(); i++) {
                if(rim.get(i).equals(s1)){n1 = i;}
                if(rim.get(i).equals(s3)){n2 = i;}
            }
            result = calc(n1, n2, s2);
            if(result == 0){
                return String.valueOf(0);
            }else if(result < 0){
                throw new ArithmeticException("In roman there is no negative numbers.");
            }else
                return toRoman(result);
        }
        int a;
        try {
            int n1 = Integer.parseInt(s1), n2 = Integer.parseInt(s3);
            a = calc(n1, n2, s2);
        }catch (Exception e){
            throw new Exception("Wrong input. Example: 2 "+s2+" 5 or II "+s2+" V");
        }
        return String.valueOf(a);
    }
    static int calc(int n1, int n2, String s){
        int a = 0;
        switch (s) {
            case "+" -> a = n1 + n2;
            case "-" -> a = n1 - n2;
            case "*" -> a = n1 * n2;
            case "/" -> a = n1 / n2;
        }
        return a;
    }
    static String toRoman(int n){
        List<Integer> arr = Arrays.asList(100,90,50,40,10,9,5,4,1);
        List<String> rimLetters = Arrays.asList("C","XC","L","XL","X","IX","V","IV","I");
        StringBuilder roman = new StringBuilder();
        for(int i = 0; i < arr.size(); i++) {
            while(n >= arr.get(i)) {
                n = n - arr.get(i);
                roman.append(rimLetters.get(i));
            }
        }
        return roman.toString();
    }
}