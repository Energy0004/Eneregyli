package com.example.demo.PracticeActivities;

import java.util.*;

public class PA9B {
    public static void main(String[] args) {
        GeometricObject[] arr = {new Circle(5), new Circle(8), new Rectangle(3, 4), new Rectangle(4, 2)};
        Arrays.sort(arr);
        System.out.println("Sorted Geometric objects:");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i].getClass().getSimpleName()+": "+arr[i].getArea());
        }
    }
}
class GeometricObject implements Comparable<GeometricObject>{
    public int getArea() {
        return 0;
    }
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
class Circle extends GeometricObject{
    private int radius;
    public Circle(int radius_){
        radius = radius_;
    }
    public int getArea(){
        double f = Math.PI * radius * radius;
        return (int)f;
    }
}
class Rectangle extends GeometricObject{
    private int width;
    private int height;
    public Rectangle(int width_, int height_){
        width = width_;
        height = height_;
    }
    public int getArea(){
        return width * height;
    }
}