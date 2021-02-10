package com.myTrial.Javaprogrammes;

import java.util.Scanner;

public class Car_brands_if {
    public static void main(String[] args){
        Scanner brands = new Scanner(System.in);
        int i,j;
        String temp;
        String[] car = new String[10];
        String[] brand_name = {"bmw","bMw","bmW","bMW","Bmw","BMw","BmW","BMW"};
        for(i=0;i<10;i++){
            System.out.println("Enter Car brand "+ (i++));
            car[i]=brands.nextLine();
        }
        System.out.println("Your list is :");
        for(String cars:car){
            System.out.println(cars);
        }
        for(i=0;i<10;i++){
            for(j=0;j<8;j++){
                if(car[i].equals(brand_name[j])){
                    temp=car[0];
                    car[0]=car[i];
                    car[i]=temp;
                    break;
                }
            }
        }
        System.out.println("Updated list is : ");
        for(String cars:car){
            System.out.println(cars);
        }
    }
}
