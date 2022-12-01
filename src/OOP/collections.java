package OOP;

import java.util.*;
public class collections{
    public static void main(String[] args){
        Scanner v = new Scanner(System.in);
        Person vitya = new Person(120, "Vitya");
        vitya.say(v.next());
        System.out.println(vitya.name + "\'s height is " + vitya.height);

        Person vlad = new Person(180, "Vlad");
        System.out.println(vlad.name + "\'s height is " + vlad.height);

        Person dima = new Person("Dima");
        System.out.println(dima.name);
        System.out.println("");

        Student freshman = new Student(76, "Viktor", 2);
        freshman.tell();
        Student fresh = new Student(280, "Virin", 4);
        fresh.tell();
    }
}
