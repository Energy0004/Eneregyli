package com.example.demo;

import java.util.*;

public class Queuee {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
//        Queue<Integer> queue1 = new LinkedList<>();
//        queue1.offer(20);
//        queue1.offer(25);
//        queue1.offer(26);
//        queue1.offer(22);
//        while (queue1.size() > 0){
//            System.out.print(queue1.remove() + " ");
//        }
//        System.out.println();
//
//        PriorityQueue<Integer> queue2 = new PriorityQueue<>();
//        queue2.offer(20);
//        queue2.offer(25);
//        queue2.offer(26);
//        queue2.offer(22);
//        while (queue2.size() > 0){
//            System.out.print(queue2.remove() + " ");
//        }
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("New York");
        LinkedHashSet<String> set2 = set1;
        LinkedHashSet<String> set3 = (LinkedHashSet<String>)(set1.clone());
        set1.add("Atlanta");
        System.out.println("set1 is " + set1);
        System.out.println("set2 is " + set2);
        System.out.println("set3 is " + set3);
    }
}