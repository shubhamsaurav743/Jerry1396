package com.bridgelabz.practiceproblems.oops;

class B{
    int x=150;
    static int y=250;
    public static void methodB1(){
        System.out.println("This is a static method of class B !!!");
    }
    public void methodA2(){
        System.out.println("This is a non-static method of class B !!!!");
    }
}
class A extends B{
    int a=15;
    static int b=25;
    public static void methodA1(){
        System.out.println("This is a static method of class A !!!");
    }
    public void methodA2(){
        System.out.println("This is a non-static method of class A !!!");
        super.methodA2();
    }
}
public class InheritanceDemo extends A {
    public void methodC(){
        System.out.println("This is a non-static method of class InheritanceDemo !!!!");
    }
    public static void main(String[] args) {
        InheritanceDemo id=new InheritanceDemo();
        System.out.println(id.a);
        id.methodA2();
        System.out.println(A.b);
        A.methodA1();
        id.methodC();
        System.out.println("-------------------------------------------");
        System.out.println(id.x);
        A.methodA1();
        A.methodB1();
        System.out.println(A.y);
        System.out.println("----------------------------------------------");
        B.methodB1();
        System.out.println(B.y);

    }
}