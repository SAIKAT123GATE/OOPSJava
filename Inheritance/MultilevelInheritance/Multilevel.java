package Inheritance.MultilevelInheritance;
class Shape3 {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape3 {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }
}
class EquilateralTriangle extends Triangle {
    int side;
}


public class Multilevel {
    public static void main(String[] args) {
        EquilateralTriangle equilateralTriangle=new EquilateralTriangle();
        equilateralTriangle.area();
    }
}
