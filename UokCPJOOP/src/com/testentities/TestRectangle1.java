package com.testentities;

import java.util.Scanner;

import com.entities.Rectangle;

public class TestRectangle1 {
	
	public static int x;
	public static int y;
	public static void main(String[] args) {
		Rectangle rect1=new Rectangle(x,y);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the width:");
		x=sc.nextInt();
		System.out.println("Enter the length:");
		y=sc.nextInt();
		System.out.println("The perimeter is:"+rect1.calcPerimeter(x,y));
		System.out.println("The perimeter is:"+rect1.calcArea(x,y));
		
		

	} 

}
