package com.bridge.D2_assignments;

import java.util.Scanner;

public class ArithmaticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter three nums: ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int opr1=(( a + ((b * c))));
		int opr2=(( ((a % b)) + c ));
		int opr3=(( c + ((a / b))));
		int opr4=(( ((a * b)) + c ));
		
		System.out.println("Among these three nums: ");
		
		System.out.println("Max value is ");
		if((a >= b)&&(a >= c)){
			System.out.println("a "+ a);
		}
		else if ((b >= a)&&(b >= c)) {
			System.out.println("b "+ b);
		}
		else if ((c >= a)&&(c >= b)) {
			System.out.println("c "+c);
		}
		
		System.out.println("Min value is ");
		if((a <= b)&&(a <= c)){
			System.out.println("a "+ a);
		}
		else if ((b <= a)&&(b <= c)) {
			System.out.println("b "+ b);
		}
		else if ((c <= a)&&(c <= b)) {
			System.out.println("c "+c);
		}
		
		sc.close();
		
		System.out.println("operation1 a+b*c= "+ opr1);
		System.out.println("operation2 a%b+c= "+ opr2);
		System.out.println("operation3 c+a/b= "+ opr3);
		System.out.println("operation4 a*b+c= "+ opr4);

}
}
