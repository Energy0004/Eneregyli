package OOP;

public class TestShape {
    public static void main(String[] args) {
        Shape sh = new Shape();
        System.out.println("Package1.Shape's color = " + sh.getColor());
        sh.setColor("green");
        System.out.println("Package1.Shape's new color = " + sh.getColor());
        System.out.println(sh);
        Circlee c = new Circlee(5.0, "yellow", true);
        System.out.println("Package1.Circlee's radius = " + c.getRadius());
        System.out.printf("Package1.Circlee's Area and Perimeter = %.2f; %.2f \n",c.getArea(),c.getPerimeter());
        System.out.println(c);
        Rectangle r = new Rectangle(10, 12, "blue", true);
        System.out.println("Package1.Rectangle's width and length = " + r.getWidth() + ", " + r.getLength());
        r.setWidth(15);
        r.setLength(20);
        System.out.println("Package1.Rectangle's new width and length = " + r.getWidth() + ", " + r.getLength());
        System.out.println("Package1.Rectangle's Area and Perimeter = " + r.getArea() + ", " + r.getPerimeter());
        System.out.println(r);
        Square sq = new Square(6, "red", true);
        System.out.println("Package1.Square's sides = " + sq.getSide());
        sq.setSide(7);
        System.out.println("Package1.Square's new sides = " + sq.getSide());
        System.out.println("Package1.Square's Area and Perimeter = " + sq.getArea() + ", " + sq.getPerimeter());
        System.out.println(sq);
    }
}
class Shape{
    private String color = "red";
    private boolean filled = true;

    public Shape(){}
    public Shape(String color_, boolean filled_){
        color = color_;
        filled = filled_;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return "Package1.Shape[color="+color+",filled="+filled+"]";
    }
}
class Circlee extends Shape{
    private double radius = 1.0;

    public Circlee(){}
    public Circlee(double radius_) {
        radius = radius_;
    }
    public Circlee(double radius_, String color, boolean filled) {
        super(color, filled);
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
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public String toString(){
        return "Package1.Circlee["+super.toString()+"],radius="+radius+"]";
    }
}
class Rectangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle(){}
    public Rectangle(double width_, double length_){
        width = width_;
        length = length_;
    }
    public Rectangle(double width_, double length_, String color_, boolean filled_){
        super(color_,filled_);
        width = width_;
        length = length_;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return (width * 2) + (length * 2);
    }
    public String toString(){
        return "Package1.Rectangle["+super.toString()+",width="+width+",length="+length+"]";
    }
}
class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return super.length;
    }
    public void setSide(double side){
        super.width = side;
        super.length = side;
    }
    public void setWidth(double side){
        super.width = side;
        super.length = super.width;
    }
    public void setLength(double side){
        super.length = side;
        super.width = super.length;
    }
    public String toString(){
        return "Package1.Square["+super.toString()+"]";
    }
}

