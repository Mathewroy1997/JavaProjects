package com.myTrial.Javaprogrammes;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {

        int count = 1;

        System.out.println("Enter the paragraph: ");

        Scanner line = new Scanner(System.in);

        String paragraph = line.nextLine();


       // char ch[] = new char[paragraph.length()];

        for (int i = 0; i < paragraph.length(); i++) {

            //ch[i] = paragraph.charAt(i);

           // if (ch[i] == ' ')
            if(paragraph.charAt(i)==' '){
                count++;

            }

        }
        System.out.println("No. of words = "+count);

    }
}
