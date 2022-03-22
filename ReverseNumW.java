package com.bridge.D2_assignments;

import java.util.Scanner;

public class ReverseNumW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number to reverse ");
        Scanner sc = new Scanner(System.in);
        //variables
        int number = sc.nextInt();
        int reversenumber = 0;
        while (number > 0) {
            //reversenumber store the remainder
            reversenumber = reversenumber * 10 + number % 10;
            // number here store the quotient
            number = number / 10;
        }
        System.out.println("Reverse of no. is " + reversenumber);
        sc.close();

	}

}
