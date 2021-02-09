package com.myTrial.Javaprogrammes;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the action : ");
        String text = input.nextLine();
        switch (text) {
            case "start":
                System.out.println("Machine Started.");
                break;
            case "stop":
                System.out.println("Machine stopped.");
                break;

        }
    }
}
