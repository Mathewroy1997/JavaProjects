package com.myTrial.Javaprogrammes;

import java.util.Scanner;

public class WordCount {


    public void countWords() {

        int l, count = 1;
        Scanner sc = new Scanner(System.in);
        String paragraph = sc.nextLine();

        for (int i = 0; i < paragraph.length(); i++) {
            if (paragraph.charAt(i) == ' ') {
                count++;

                if (paragraph.charAt(i) == paragraph.charAt(i - 1) || paragraph.charAt(i) == paragraph.charAt(i + 1)) {
                    System.out.println("Error in input paragraph.");
                    count = 0;

                    break;
                }
            }
            else if (Character.isDigit(paragraph.charAt(i))) {

                if (paragraph.charAt(i - 1) == ' ') {

                    count--;


                }

            }



        }
        if (count == 0) {
            System.out.println("Start again.");
        } else {
            System.out.println("words=" + count);
        }

    }

    public static void main(String[] args) {

        WordCount line1 = new WordCount();

        System.out.println("Enter the paragraph: ");

        line1.countWords();


    }

}
