package com.myTrial.Javaprogrammes;
class Data{
    //this class doesn't return string value from object.
    private int n;
    private String name;

    public Data(int n, String name){
        this.n=n;
        this.name=name;
    }
}
class Student{
    //this class returns String value from object. Because toString() mehod used.
    private int n;
    private String name;

    public Student(int n,String name){
        this.n=n;
        this.name=name;
    }

    @Override
    public String toString() {
        return n+":"+name;
    }
}
public class ToStringMethod2 {
    public static void main(String[] args){

        Data data1=new Data(1,"mathew");
        System.out.println(data1);
        //output will return class name with hash code. No string value.

        Student student1=new Student(1,"mathew");
        System.out.println(student1);
        //Output will be object data. String value will be displayed.

    }
}
