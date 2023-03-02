package Inheritance.Singlnheritance;
class Shape{
    public void area(){
        System.out.println("Parent Class Shape");
    }
}

class Square extends Shape{
    public void area(int a){
        System.out.println("Square class calls "+(a*a));
    }
}
public class Single {
    public static void main(String[] args) {
        Square square=new Square();
        square.area(5);
    }
}
