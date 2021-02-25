package com.myTrial.Javaprogrammes;

public class StringBuilderAndFormatting {
    public static void main(String[] args){

        String name="Hi";
        name+="..";
        name+="I'm Mathew.";
        System.out.println(name);

        StringBuilder newline=new StringBuilder();
        newline.append("This is");
        newline.append(" more efficient ");
        newline.append("method to create and add lines.");
        System.out.println(newline.toString());

        StringBuilder newline2=new StringBuilder();
        newline2.append("We can also ")
        .append("use this")
        .append(" method to build string.");
        System.out.println(newline2.toString());

        //Formatting...

        System.out.println("see:\tThis is a tab.\nThis is a new line.");
        System.out.println("new line");


        System.out.printf("If you use printf function, next printed data will also allign this line.");
        System.out.println("THIS LINE IS THE EXAMPLE.");

        System.out.printf("\n%d:this integer value is printed using special formatting character. ",5);
        System.out.printf("\n%5d:Created 5 character space before number. ",5);
        System.out.printf("\n%-5d:Created 5 character spaces after number. ",5);

        //use of above format character:

        for (int i=1;i<20;i++) {
            System.out.printf("\n%2d: line %d",i,i);
        }

        //floating point
        System.out.printf("\n%.2f: floating point adjusted to 2 decimal places. Exact number is 5.6234.",5.6234);
        System.out.printf("\n%4.2f:floating point adjusted to total 4 characters with 2 decimal places.");
    }


}
