
package com.codegnan.controlstatements;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your income:");
		int income=sc.nextInt();
		System.out.println("||=============1.north=====================||");
		System.out.println("||==========2.south==========||");
		System.out.println("||=============3.east===========||");
		System.out.println("||===========4.west========||");
		System.out.println("enter region code:");
		int regionCode=sc.nextInt();
		double tax=0.0;
		switch(regionCode) {
		case 1:
			if(regionCode==1) {
				tax=income*0.05;
				System.out.println("tax "+tax);
			}else {
				//no output
			}
			break;
		case 2:
			if(regionCode==2) {
				tax=income*0.06;
				System.out.println("tax "+tax);
			}else {
				//no output
			}
			break;
		case 3:
			if(regionCode==3) {
				tax=income*0.07;
				System.out.println("tax "+tax);
			}else {
				//no output
			}
			break;
		case 4:
			if(regionCode==4) {
				tax=income*0.08;
				System.out.println("tax "+tax);
			}else {
				//no output
			}
			break;
		 default:
			 System.out.println("invalid region");
			 break;
			}
		    sc.close();
		
		}



}