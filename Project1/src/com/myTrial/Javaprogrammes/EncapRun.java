package com.myTrial.Javaprogrammes;

public class EncapRun {
public static void main(String[] args){

    Encapsulation person1=new Encapsulation();

    person1.setName("John");
    person1.setAge(19);

    System.out.println("Name="+ person1.getName() +"\t Age="+person1.getAge() );
}


}
