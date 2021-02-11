package com.myTrial.Javaprogrammes;

import java.util.Scanner;

public class Factorial_number {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        Scanner loop = new Scanner(System.in);
        char c;
        int factorial, i,l;
        do {
            System.out.println("Enter an integer : ");
            l = num.nextInt();
            factorial = l;
            for (i = l - 1; i > 0; i--) {

                factorial = factorial * i;

            }
            System.out.printf("Factorial is = %d", factorial);
            System.out.println("\nDo you want to check another integer? press y");
            c=loop.next().charAt(0);
        }while(c=='y');

    }
}
