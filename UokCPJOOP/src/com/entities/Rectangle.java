package com.entities;
public class Rectangle {
	public int length;
	public int width;

	public Rectangle(int length, int width) {
		
		this.length = length;
		this.width = width;
	}



	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}



	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}
public int calcArea(int length, int width)
{
 return length*width;
}
public int calcPerimeter(int length, int width)
{
	return(length+width)*2;
	}

	public static void main(String[] args) {
		Rectangle rect=new Rectangle(10,20);
		System.out.println("The perimeter is:"+rect.calcPerimeter(10,20));
		System.out.println("The area is:"+rect.calcArea(10,20));
		
	}

}
