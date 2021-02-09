package com.myTrial.Javaprogrammes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Userinput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String line = input.nextLine();
        System.out.println("You entered : "+line);
        System.out.println("Enter a number");

        int num = input.nextInt();
        System.out.println("You entered : "+num);
    }
}