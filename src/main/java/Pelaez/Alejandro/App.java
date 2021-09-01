/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");

        int p = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        float r = input.nextFloat();
        System.out.print("Enter the number of years: ");
        int t = input.nextInt();

        float a = (float) Math.ceil((p + ((t * (r/100)) * p)) * 100) / 100;
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f", t, r, a);
        System.out.print("\n");
    }
}
