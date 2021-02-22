package com.myTrial.Javaprogrammes;
class Frog{
    private String name;
    private int num;
    public void setName(String newName){
        name=newName;

    }
    public void setAge(int newAge){
        num=newAge;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return num;
    }


}

public class Setters {
    public static void main(String[] args){
        Frog person=new Frog();
        person.setName("Mathew");
        person.setAge(24);
        System.out.println(person.getName()+"   "+person.getAge());

    }
}
