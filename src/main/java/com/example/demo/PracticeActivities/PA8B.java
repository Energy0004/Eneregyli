package com.example.demo.PracticeActivities;

import java.io.*;

public class PA8B{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employ em = new Employ(220105665, "Ashat", "Tabyldy", 18, "pro");
        FileOutputStream output = new FileOutputStream("src/ID.ser");
        ObjectOutputStream objectOut = new ObjectOutputStream(output);
        objectOut.writeObject(em);
//        objectOut.close();
//        output.close();

        FileInputStream input = new FileInputStream("src/ID.ser");
        ObjectInputStream objectInput = new ObjectInputStream(input);
        System.out.println(objectInput.readObject().toString());
//        objectInput.close();
//        input.close();
    }
}

class Employ implements Serializable {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String deppro;
    public Employ(int id_, String name_, String surname_, int age_, String deppro_){
        id = id_;
        name = name_;
        surname = surname_;
        age = age_;
        deppro = deppro_;
    }
    public String toString() {
        return "Employ{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", deppro='" + deppro + '\'' +
                '}';
    }
}