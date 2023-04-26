package com.example.demo;

import java.math.BigInteger;
import java.util.*;

public class Quiz3Problem11 {
    public static boolean isPrime(String s){
        BigInteger b = new BigInteger(s);
        return b.isProbablePrime(1);
    }
    public static ArrayList<Integer> removePrimeDuplicates(ArrayList<Integer> list) {
        Set<Integer> set = new HashSet<>();
        int c;
        for(int i = 0; i < list.size(); i++){
            c = 0;
            for(int j = 0; j < list.size(); j++){
                if(list.get(i) == list.get(j)){
                    c++;
                }
            }
            for (int j = 0; j < list.size(); j++) {
                if(isPrime(String.valueOf(c)) && list.get(i) == list.get(j)){
                    set.add(list.get(j));
                    list.remove(j);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(set.contains(list.get(i))){
                list.remove(i);
            }
        }
        System.out.println(set);
        return list;
//        fib.add(1);fib.add(2);fib.add(3);fib.add(5);fib.add(8);fib.add(13);
//        Set<Integer> res = new HashSet<>();
//        int c = 0;
//        int temp = list.get(2);
//        for (int i = 0; i < list.size();i++ ) {
//            if(list.get(i) ==  temp)c++;
//            else {
//                if(fib.contains(c)){
//                    for (int index = 0; index < list.size(); index++) {
//                        if(temp == list.get(index)) list.remove(index);
//                    }
//                }
//                c = 1;
//            }
//            temp = list.get(i);
//        }
//        return list ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while(t-->0) {
            list.add(sc.nextInt());
        }
//        removePrimeDuplicates(list);
        ArrayList<Integer> removedNewList = removePrimeDuplicates(list);
        System.out.println(removedNewList);
    }
}