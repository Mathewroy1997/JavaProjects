package com.myTrial.Javaprogrammes;

import java.util.Scanner;

class People{
    String name;
    int age;
    void line1(){
        System.out.println("My name is "+name+" and I am "+age+" years old.");
    }
    int yearsToRetire(){
       int yearsLeft=65-age;
       return yearsLeft;
    }


        }
public class Getters {
    public static void main(String[] args) {
        Scanner inputName=new Scanner(System.in);
        Scanner inputAge=new Scanner(System.in);
        People person1=new People();
        System.out.println("Enter your name: ");
        person1.name=inputName.nextLine();
        System.out.println("Enter your age: ");
        person1.age=inputName.nextInt();
        int years= person1.yearsToRetire();
        System.out.println(person1.name+ " will work for another "+years+" years.");
       
    }
}
