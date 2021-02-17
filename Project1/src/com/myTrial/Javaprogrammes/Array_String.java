package com.myTrial.Javaprogrammes;

import java.util.Scanner;

public class Array_String {
    public static void main(String[] args){
        String[] words = new String[3];

        Scanner line=new Scanner(System.in);
        System.out.println("Enter any three Strings :");
        for(int i=0;i<3;i++){
            words[i]=line.nextLine();
        }
        System.out.println("The matrix is :");
        for(String result:words){
        System.out.println(result);
        }
    }
}
