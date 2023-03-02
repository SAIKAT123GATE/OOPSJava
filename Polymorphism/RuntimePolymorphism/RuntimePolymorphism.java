package Polymorphism.RuntimePolymorphism;

class Shape{
    public void area(){
        System.out.println("Area of parent class");
    }
}
//This is method overRiding. You can put @Override or by defualt java will add it.
class Square extends Shape{

    public void area(){
        System.out.println("Area From child class");
    }
}

//Runtime polymorphism is basically calling same method from child class with different signature
class Circle extends Shape{

    public void area(int r){
        System.out.println("Area From Circle class"+(3.14*r*r));
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        Shape shape=new Shape();
        Square sq=new Square();
        Circle circle=new Circle();
        shape.area();
        sq.area();
        circle.area(5);
    }
}
