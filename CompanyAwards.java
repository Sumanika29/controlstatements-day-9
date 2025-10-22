package com.codegnan.controlstatements;

import java.util.Scanner;

public class CompanyAwards {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your salary:");
		double salary=sc.nextDouble();
		int code;
		System.out.println("||==================================||");
		System.out.println("||==========code 1(manager)==========||");
		System.out.println("||=============code 2(Developer)===========||");
		System.out.println("||===========code 3(intern)========||");
		System.out.println("enter your role code: ");
		code=sc.nextInt();
		switch(code) {
		case 1:
			if(code==1) {
				salary=salary*0.10;
				System.out.println("bonus: "+salary);
				
			}else {
				//no change
			}
			break;
		case 2:
			if(code==2) {
				salary=salary*0.05;
				System.out.println("bonus: "+salary);
				
			}else {
				//no change
			}
			break;
		case 3:
			if(code==3) {
				salary=salary+500;
				System.out.println("bonus: "+salary);
				
			}else {
				//no change
			}
			break;
		default:
			System.out.println("invalid role type");
			break;
		}
		sc.close();
		

	}

}
