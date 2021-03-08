package com.myTrial.Javaprogrammes;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Directortask2 {
    String name;
    int age;
    long phoneNo;
    String Address;
    int salary;


    public void printSalary() {

        int dirSalary=20000;
        System.out.printf("Salary of director :%d",dirSalary);

    }
    public static void main(String[] args){

        Directortask2 director=new Directortask2();

        Manager manager=new Manager();
        Employee employee1=new Employee();

        director.printSalary();
        manager.managerData();
        employee1.employee1Data();
    }

}
