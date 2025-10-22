package com.codegnan.controlstatements;

import java.util.Scanner;

public class CalculateLibraryFine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of days:");
		int day=sc.nextInt();
		System.out.println("enter code: ");
		int fine=0;
		int code;
		//do {
			System.out.println("||==================================||");
			System.out.println("||==========code 1==========||");
			System.out.println("||=============code 2===========||");
			System.out.println("||===========code 3========||");
			System.out.println("enter your code: ");
			code=sc.nextInt();
			switch(code) {
			case 1:
				if(day>=1&&day<=5) {
					fine=day*1;
					System.out.println("overdue "+fine);
				}else {
					System.out.println("days are out of range");
				}
				break;
			case 2:
				if(day>=6&&day<=10) {
					fine=day*2;
					System.out.println("overdue "+fine);
				}else {
					System.out.println("days are out of range");
				}
				break;
			case 3:
				if(day>10) {
					fine=day*5;
					System.out.println("overdue "+fine);
				}else {
					System.out.println("days are out of range");
				}
				break;
			default:
				System.out.println("Invalid code");
				break;
			}
	
		//}while(code!=3);
		sc.close();

	}

}
