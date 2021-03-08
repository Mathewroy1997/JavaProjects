package com.myTrial.Javaprogrammes;

import java.util.Scanner;

public class Employee extends Directortask2 {

    public void employee1Data() {

        name = "John";
        age = 23;
        Address = "Trivandrum";
        salary = 50000;
        Scanner mobNo=new Scanner(System.in);
        System.out.println("\nEnter employee mobile number: ");
        phoneNo=mobNo.nextLong();

        System.out.printf("\nEmployee 1 Details : \nname:%s\tAge:%d\tPhone No:%d\tAddress:%s\tSalary:%d",
                name, age, phoneNo, Address, salary);
    }

}
