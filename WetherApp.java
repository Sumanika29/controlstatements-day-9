package com.codegnan.controlstatements;

import java.util.Scanner;

public class WetherApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temperature[-20 to 50]:");
		int temperature=sc.nextInt();
		System.out.println("||=============1.sunny=====================||");
		System.out.println("||==========2.rainy==========||");
		System.out.println("||=============3.stormy===========||");
		System.out.println("enter your code");
		int code=sc.nextInt();
		switch(code) {
		case 1:
			if(code==1&&temperature>=20&&temperature<40) {
				System.out.println("sunny");
			}else {
				System.out.println("invalid condition");
			}
			break;
		case 2:
			if(code==2&&temperature>=10&&temperature<20) {
				System.out.println("rainy");
			}else {
				System.out.println("invalid condition");
			}
			break;
		case 3:
			if(code==3&&temperature>=40&&temperature<=50) {
				System.out.println("stormy");
			}else {
				System.out.println("severe warning");
			}
			break;
		default:
			System.out.println("invalid condition");
			break;
		}
		sc.close();

	}

}
