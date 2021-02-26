package com.myTrial.Javaprogrammes;
class Set{

    private int id;
    private String st;

    public Set(int id,String st){
        this.id=id;
        this.st=st;
    }

    public String toString(){
        return String.format("%2d: %s",id,st);
    }
}

public class ToStringMethod {

    public static void main(String[] args){

        Set set1=new Set(1,"name1");
        Set set2=new Set(2,"name2");

        System.out.println(set1);
        System.out.println(set2);

    }
}
