package com.myTrial.Javaprogrammes;
class Fruits{
    private String fruit;
    private int size;
    public void fruitName(String fruit){
        this.fruit=fruit;
    }
    public void fruitSize(int size){
        this.size=size;
    }
    public String getFruitName(){
        return fruit;
    }
    public int getFruitSize(){
        return size;
    }
}
public class UseOfThis {
    public static void main(String[] args){
        Fruits Fruit1=new Fruits();
        Fruit1.fruitName("Apple");
        Fruit1.fruitSize(10);
        System.out.println(Fruit1.getFruitName()+"  "+ Fruit1.getFruitSize());

    }
}
