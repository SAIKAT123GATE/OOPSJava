package Inheritance.HierarchicalInheritance;


class Shape2{
    public void area(){
        System.out.println("Parent Class Shape");
    }
}

class Square2 extends Shape2 {
    public void area(int a){
        System.out.println("Square class calls "+(a*a));
    }
}
class Circle extends Shape2{
    public void area(int r){
        System.out.println("Square class calls "+(3.14*r*r));
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Square2 square2=new Square2();
        square2.area(5);
        Circle circle=new Circle();
        circle.area(5);
    }
}
