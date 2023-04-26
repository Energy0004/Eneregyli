package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        Integer[] integers = {8, 4, 3, 325, 23, 15, 65, 1, 0};
        List<Double> doubles = Arrays.asList(80.564, 56.45, 80.565, 80.563);
        String[] strings = {"Yrysdaulet", "Jangir", "Zhandos"};
        List<Character> characters = Arrays.asList('g', 'G', 'f', 'w', 'y');
        Long[] longs = {23145635368566432L, 12314124345315311L, 13455334231245313L, 11141424142412421L};
        sort(integers);sort(doubles);sort(strings);sort(characters);sort(longs);
        System.out.println(Arrays.toString(integers));
        System.out.println(doubles);
        System.out.println(Arrays.toString(strings));
        System.out.println(characters);
        System.out.println(Arrays.toString(longs));
//        Set<Integer> set1 = new HashSet<>();
////        for (int i = 100; i >= 1; i--) {
////            set1.add(i);
////        }
//        set1.add(2);set1.add(33);set1.add(64);set1.add(23);set1.add(5);set1.add(46);set1.add(33);
//        TreeSet<Integer> set = new TreeSet<>(set1);
//        System.out.println(set);
//        Set<Integer> set2 = new LinkedHashSet<>();
////        for (int i = 100; i >= 1; i--) {
////            set2.add(i);
////        }
//        set2.add(2);set2.add(33);set2.add(64);set2.add(23);set2.add(5);set2.add(46);set2.add(33);
//        System.out.println(set2);
    }
    public static <E extends Comparable<E>> void sort(List<E> list){
        list.sort(new Comparator<E>() {
            public int compare(E o1, E o2) {
                return o1.compareTo(o2);
            }
        });
    }
    public static <E extends Comparable<E>> void sort(E[] list){
        List<E> asList = Arrays.asList(list);
        asList.sort(new Comparator<E>() {
            public int compare(E o1, E o2) {
                return o1.compareTo(o2);
            }
        });
    }
}