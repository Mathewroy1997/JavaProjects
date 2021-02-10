package com.myTrial.Javaprogrammes;

import java.util.Scanner;

public class Car_brands {
    public static void main(String[] args){
        Scanner brand = new Scanner(System.in);
        String[] car = new String[10];
        String temp;
        int i,j;
        for(i=0;i<10;i++){
            System.out.println("Enter brand ");
            car[i]=brand.nextLine();
        }
        System.out.println("Your input is : ");
        for(String brands : car){
            System.out.println(brands);
        }
        System.out.println("Checking for bmw brand..");
        for(j=0;j<10;j++){
            switch (car[j]){
                case  "bmw":
                    temp=car[0];
                    car[0]=car[j];
                    car[j]=temp;
                    break;
                case  "bMw":
                    temp=car[0];
                    car[0]=car[j];
                    car[j]=temp;
                    break;
                case  "bmW":
                    temp=car[0];
                    car[0]=car[j];
                    car[j]=temp;
                    break;
                case  "bMW":
                    temp=car[0];
                    car[0]=car[j];
                    car[j]=temp;
                    break;
                case  "Bmw":
                    temp=car[0];
                    car[0]=car[j];
                    car[j]=temp;
                    break;
                case  "BMw":
                    temp=car[0];
                    car[0]=car[j];
                    car[j]=temp;
                    break;
                case  "BmW":
                    temp=car[0];
                    car[0]=car[j];
                    car[j]=temp;
                    break;
                case  "BMW":
                    temp=car[0];
                    car[0]=car[j];
                    car[j]=temp;
                    break;


            }
        }

        System.out.println("Updated list : ");
        for(String brands : car){
            System.out.println(brands);
        }
    }
}
