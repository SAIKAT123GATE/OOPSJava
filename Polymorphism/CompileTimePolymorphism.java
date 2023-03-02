package Polymorphism;

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Student st1=new Student();
        st1.getInfo();
        st1.getInfo("Saikat");
        st1.getInfo("Saikat",18);
        st1.getInfo("Saikat","18");
    }
}

class Student{
    private String name;
    private int age;
    public void getInfo(){
        System.out.println("Default info method called");
    }
    public void getInfo(String name){
        this.name=name;
        System.out.println("Only name "+name);
    }
    public void getInfo(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Name and age "+name+" "+age);
    }
    public void getInfo(String name,String age){
        System.out.println("Name and age(String) "+name+" "+age);
    }

}
