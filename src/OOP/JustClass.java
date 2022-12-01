package OOP;

public class JustClass {
    public static void main(String[] args){
        Circle c1 = new Circle(5.0);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        c1.setRadius(25.0);
        System.out.println(c1.getArea()+"\n"+ c1.getCircumference());
        System.out.println(c1);
    }
}
class Circle{
    private double radius = 1.0;

    public Circle(){}
    public Circle(double radius_){
        radius = radius_;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "Package1.Circle["+"radius="+radius+ ']';
    }
}