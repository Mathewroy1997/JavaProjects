package com.myTrial.Javaprogrammes;

import jdk.jfr.Description;
//declaring new class Thing.
class Thing{
    //Constant number declaring using "final static".
    public final static int Lucky_Num=7;
    public String name;
    //static string declaring:
    public static String Description;
    public static int count=0;
    public int id;
//To add numbers to objects creating:
    public Thing(){
        id=count;
        count++;
    }

    public void showName(){
        System.out.println("id : " +id+"---" + Description+ ", "+name);
        System.out.println(Thing.count);
        //shows static variables can be defines inside instance methods. Vice-versa not possible.
    }

    public static void showInfo(){
        System.out.println(Description);

    }

}
public class StaticAndFinal {

    public static void main(String[] args){

        Thing.Description="It is a thing.";
        Thing.showInfo();

        System.out.println("Before count : "+Thing.count);
        Thing thing1=new Thing();
        Thing thing2=new Thing();
        System.out.println("After count : "+Thing.count);

        thing1.name="Mathew";
        thing2.name="Roy";

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);
        System.out.println(Thing.Lucky_Num);

        System.out.println(thing2.id);
        System.out.println(thing1.id);






    }

}