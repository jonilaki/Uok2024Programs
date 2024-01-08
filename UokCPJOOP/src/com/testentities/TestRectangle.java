package com.testentities;

import com.entities.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle res=new Rectangle(30,40);
		System.out.println("The perimeter is:"+res.calcPerimeter(40,50));
		System.out.println("The are is:"+res.calcArea(40,50));

	}

}
