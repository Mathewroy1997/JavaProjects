package com.myTrial.Javaprogrammes;
class Robot{
    public void person(String name){
        System.out.println("I'm "+name);
    }
    public void yearsold(int age){
        System.out.println(age+" years old");
    }
    public void together(String name,int age){
        System.out.println("Hi, I'm "+name+". I'm "+age+" years old.");
    }
}
public class MethodParameters {
    public static void main(String[] args){
        Robot mathew=new Robot();
        mathew.person("Mathew");
        mathew.yearsold(24);
        mathew.together("Mathew",24);

    }
}
