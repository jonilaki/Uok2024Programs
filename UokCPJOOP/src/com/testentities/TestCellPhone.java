package com.testentities;

import java.util.Scanner;

import com.entities.CellPhone;

public class TestCellPhone {

	public static void main(String[] args) {
		CellPhone cp=new CellPhone(); 
		//String manufact,model;
		//double retailPrice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the CellPhone manufacturer:");
		cp.manufact=sc.next();
		System.out.println("Enter the CellPhone model:");
		cp.model=sc.next();
		System.out.println("Enter the CellPhone Retail Price:");
		cp.retailPrice=sc.nextDouble();
		
		System.out.println("----------------------------------------");
		System.out.println("The CellPhone manufacturer is:"+cp.manufact);
		System.out.println("The CellPhone model is:"+cp.model);
		System.out.println("The CellPhone RetailPrice is:"+cp.retailPrice);
		

	}

}
