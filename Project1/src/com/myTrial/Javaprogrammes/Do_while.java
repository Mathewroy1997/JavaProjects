package com.myTrial.Javaprogrammes;

import java.util.Scanner;

public class Do_while {
    public static void main(String[] args){

        int num=0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter a number :");
            num = input.nextInt();
        }while( num != 5);

        System.out.println("Great, it's finally 5.");
    }
}
