package com.ourtest;
import java.util.Scanner;
import com.Entities.Triangle;
public class TestTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Triangle tr=new Triangle();
		
		do {
            System.out.print("Enter a length: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid integer.");
                sc.next(); 
            }
            tr.length = sc.nextInt();
        } while ( tr.length <= 0);
		
		do {
            System.out.print("Enter a width: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid integer.");
                sc.next();
            }
            tr.width = sc.nextInt();
        } while ( tr.width >=0);
		
         System.out.println("Enter third side:");
		tr.hy=sc.nextInt();
System.out.println("The area of triangle is:"+tr.calcArea());
System.out.println("The perimeter of triangle is:"+tr.calcPerimeter());
sc.close();
	}

}
