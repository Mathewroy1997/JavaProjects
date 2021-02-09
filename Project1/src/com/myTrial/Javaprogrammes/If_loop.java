package com.myTrial.Javaprogrammes;

import javax.print.attribute.standard.PrinterInfo;

public class If_loop {
    public static void main(String[] args ) {
        int i = 5;

        while (i < 10) {
            System.out.printf("Number is : %d",i);
            System.out.println();
            i++;
            if(i==9){
                System.out.println("Finished.");
                break;
            }
            System.out.println("Continue...");
        }
    }
}
