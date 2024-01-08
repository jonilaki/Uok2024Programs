package com.Entities;

public class Triangle {
public int length;
public int width;
public int hy;
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


public int getHy() {
	return hy;
}


public void setHy(int hy) {
	this.hy = hy;
}


public int calcArea()
{
	return (length*width)/2;
}
public int calcPerimeter() 
{
	return (length+width+hy);
}
}



