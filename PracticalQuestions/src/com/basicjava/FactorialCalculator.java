package com.basicjava;

import java.util.Scanner;

public class FactorialCalculator {
	
	public static int factorial(int n)
	{    
		if (n == 0) {   
			return 1;
			}    
		else  {  
			return(n * factorial(n-1));  
		}
	}
	
	public static void main(String args[]){  
		int number;
		Scanner sc=new Scanner(System.in);
	
		number=sc.nextInt(); 
		
		System.out.println("Factorial of "+number+" is: "+factorial(number));    
	}  


}
