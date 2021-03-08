package com.myTrial.Javaprogrammes;

import java.util.Scanner;

public class Manager extends Directortask2{

    public void managerData(){

        name="Kevin";
        age=31;

        Address="Trivandrum";
        salary=10000;
        Scanner mobNo1=new Scanner(System.in);
        System.out.println("\nEnter manager mobile number: ");
        phoneNo=mobNo1.nextLong();

        System.out.printf("\nManager Details : \nname:%s\tAge:%d\tPhone No:%d\tAddress:%s\tSalary:%d",
        name, age, phoneNo, Address, salary);
    }
}
