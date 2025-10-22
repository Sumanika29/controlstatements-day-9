package com.codegnan.controlstatements;

import java.util.Scanner;

public class HotelRoomPrices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("||=============Room Type=====================||");
		System.out.println("||===============1.standard===========||");
		System.out.println("||==========2.deluxe===============||");
		System.out.println("enter your room type");
		int roomType=sc.nextInt();
		System.out.println("||===========1.peak========||");
		System.out.println("||==============2.off-peak==============||");
		System.out.println("enter season");
		int season=sc.nextInt();
		int price=0;
		switch (roomType) {
		case 1:
			if(roomType==1&&season==1) {
				price=100;
				System.out.println("hotel room price "+price);
			}else {
				price=80;
				System.out.println("hotel room price "+price);
			}
			break;
		case 2:
			if(roomType==2&&season==1) {
				price=200;
				System.out.println("hotel room price "+price);
			}else {
				price=150;
				System.out.println("hotel room price "+price);
			}
			break;
		default:
			System.out.println("invalid input");
			break;
	}
	 sc.close();
    }

}
