package com.myTrial.Javaprogrammes;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args ){
        Scanner check = new Scanner(System.in);
        Scanner loop = new Scanner(System.in);
        int year;
        char c;
        do {
            System.out.println("Enter year :");
            year = check.nextInt();
            if (year % 4 == 0) {
                System.out.printf("%d is a leap year.", year);
            } else {
                System.out.printf("%d is not a leap year.", year);
                System.out.println();
            }
            System.out.println("Do you want to check again? Then press y.");

          c = loop.next().charAt(0);

        }while(c=='y');

    }

}
