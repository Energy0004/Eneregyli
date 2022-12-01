package OOP;

public class Person {
    public int height = 180;
    public String name = "Default";
    public void say(String n){
        System.out.println("Hello, "+ n);
    }
    public Person(){}
    public Person(int h, String n){
        height = h;
        name = n;
    }
    public Person(String n){
        name = n;
    }
}