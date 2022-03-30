package com.bridgelabz.practiceproblems.oops;

class A1<T,U>{
    private T number;
    private U name;

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public U getName() {
        return name;
    }

    public void setName(U name) {
        this.name = name;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        A1<Integer,String> a=new A1<Integer,String>();
        a.setNumber(30);
        a.setName("Jerry");
        System.out.println(a.getNumber());
        System.out.println(a.getName());

    }
}