package com.myTrial.Javaprogrammes;
class Room{
    private String line;
    private int num;
    //constructor 1:
    public Room(){
        System.out.println("First constructor running.");
    }
    public Room(String line){
        this.line=line;
        System.out.println("Second constructor running.");
    }
    public Room(int num){
        this.num=num;
        System.out.println("Third constructor running.");
    }
    public Room(String line, int num){
        this.line=line;
        this.num=num;
        System.out.println("Fourth constructor running.");
    }
}

public class Constructors {
    public static void main(String[] args){
        Room room1=new Room();
        Room room2=new Room("mathew");
        Room room3=new Room("mathew",23);
        Room room4=new Room(23);
    }
}
