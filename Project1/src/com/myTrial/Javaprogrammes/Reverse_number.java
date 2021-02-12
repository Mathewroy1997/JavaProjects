package com.myTrial.Javaprogrammes;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args ){
        int number,temp1,temp2;
        int reverse=0;
        Scanner integer=new Scanner(System.in);
        System.out.println("Enter the integer :");
        number=integer.nextInt();
        temp1=number;
        do{
            temp2=temp1%10;
            reverse=(reverse*10)+temp2;
            temp1=temp1/10;
            if(temp1<10){
                reverse=(reverse*10)+temp1;
            }

        }while(temp1>10);
        System.out.printf("Reverse of the number is : %d",reverse);
    }
}
