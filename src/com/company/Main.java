package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	final int vat = 20;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter an amount");
    float number = sc.nextFloat();
    float percentage = (number/100) * vat;
    System.out.println("your price + VAT is £" + (percentage+number));
    }
}
