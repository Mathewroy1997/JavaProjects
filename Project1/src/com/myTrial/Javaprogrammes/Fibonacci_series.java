package com.myTrial.Javaprogrammes;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        int i, j=0,k=1,l,temp;
        Scanner elements = new Scanner(System.in);
        System.out.println("Enter no. of elements (can't be zero):");
        i=elements.nextInt();
        if(i==1)
        {
            System.out.printf("Fibonacci Series =%d ",j);


        }
        else if(i==2)
        {
            System.out.printf("Fibonacci Series =%d ",j);
            System.out.printf("%d ",k);
        }
        else{
            System.out.printf("Fibonacci Series =%d ",j);
            System.out.printf("%d ",k);

            for(l=0;l<i-2;l++){
                temp=k;
                k=j+k;
                j=temp;
                System.out.printf("%d ",k);

            }
        }
    }
}
