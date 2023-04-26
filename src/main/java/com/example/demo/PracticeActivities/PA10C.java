package com.example.demo.PracticeActivities;

import java.util.*;

public class PA10C {
    public static void main(String[] argh) {
        Scanner v = new Scanner(System.in);
        while (v.hasNext()) {
            String input = v.next();
            System.out.println(check(input));
        }
    }
    public static boolean check(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(a == '(' || a == '{' || a == '['){
                stack.push(a);
            }else if(a == ')' || a == '}' || a == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char t = stack.pop();
            }
        }
        return stack.isEmpty();
    }
}