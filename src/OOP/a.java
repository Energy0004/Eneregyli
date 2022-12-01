package OOP;

public class a {
    public static void main(String[] args) {
        Animal a1 = new Animal("Mark");
        System.out.println(a1);
        Mammal m1 = new Mammal("Cezar");
        System.out.println(m1);
        Cat c1 = new Cat("Yrys");
        System.out.println(c1);
        c1.greets();
        Dog d1 = new Dog("Bar");
        Dog d2 = new Dog("Pow");
        System.out.println(d1);
        d1.greets();
        d1.greets(d2);
    }
}
class Animal {
    private String name;
    public Animal(String name_){
        name = name_;
    }
    public String toString(){
        return "Package1.Animal[name="+name+"]";
    }
}
class Mammal extends Animal{
    public Mammal(String name_){
        super(name_);
    }
    @Override
    public String toString(){
        return "Package1.Mammal["+super.toString()+"]";
    }
}
class Cat extends Mammal{
    public Cat(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }
    @Override
    public String toString(){
        return "Package1.Cat["+super.toString()+"]";
    }
}
class Dog extends Mammal{
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Woooof");
    }
    @Override
    public String toString(){
        return "Package1.Dog["+super.toString()+"]";
    }
}
