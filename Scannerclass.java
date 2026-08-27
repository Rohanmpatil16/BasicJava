package org.example;

import java.util.Scanner;

public class Scannerclass {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name");
        String name=sc.nextLine();

        System.out.println("Enter the age");
        int a=sc.nextInt();

        System.out.println("Enter the college name");
        String cn=sc.nextLine();
        sc.nextLine();

        System.out.println("Enter the roll no");
        int r=sc.nextInt();

        System.out.println("hello "+name+" your age is "+a+ "College name is "+cn+" roll no is" +r);
    }
}
