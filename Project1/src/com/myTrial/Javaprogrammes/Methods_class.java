package com.myTrial.Javaprogrammes;

class Persons {
    int age;
    String name;

    void line1(){

        System.out.println("My name is "+name+" and I am "+age+" years old.");
    }
}


public class Methods_class {
    public static void main(String[] args){
    Persons person1=new Persons();
    person1.age=15;
    person1.name="Mathew";
    person1.line1();
    }
}
