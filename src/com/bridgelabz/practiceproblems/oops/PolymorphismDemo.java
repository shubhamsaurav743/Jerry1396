package com.bridgelabz.practiceproblems.oops;

class Test{
    static int add(int a, int b){

        return a+b;
    }
    static int add(int a, int b,int c){

        return a+b+c;
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        int result=Test.add(10,20);
        System.out.println(result);
        System.out.println(Test.add(10,20,30));
    }
}