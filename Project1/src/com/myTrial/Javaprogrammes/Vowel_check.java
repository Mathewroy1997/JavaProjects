package com.myTrial.Javaprogrammes;

import java.util.Scanner;

public class Vowel_check {
    public static void main(String[] args){
        char c;
        char check;
        Scanner loop=new Scanner(System.in);
        Scanner alphabet = new Scanner(System.in);
        do {
            System.out.println("Enter an alphabet : ");
            c = alphabet.next().charAt(0);
            switch (c) {
                case 'a':
                    System.out.printf(" %s is a vowel.", c);
                    break;
                case 'e':
                    System.out.printf("%s is a vowel.", c);
                    break;
                case 'i':
                    System.out.printf("%s is a vowel.", c);
                    break;
                case 'o':
                    System.out.printf("%s is a vowel.", c);
                    break;
                case 'u':
                    System.out.printf("%s is a vowel.", c);
                    break;
                default:
                    System.out.printf("%s is a consonant.", c);
            }System.out.println("\nWant to try again? press y.");
                    check = loop.next().charAt(0);
        }while(check=='y');
        }
}
