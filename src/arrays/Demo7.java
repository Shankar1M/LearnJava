/*
 * Write a Java prgrm to take salaries as input from the keyboard
 * and store it in an array. Note that while storing add 1000 to the
 * input and store it in an array. Finally display the contents of an
 * array according to the below given scenarios.
 * 
 * Employee
 *   0
 *   1
 *   2
 *   3
 *   4
 *   
 * */


package arrays;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]= new int[5];
		System.out.println("enter the employee's salary");
		int i=0;
		
		//using while loop
		while(i<=arr.length-1)
		{
			int defaultValue = 1000;
			System.out.println("Enter"+" "+i+"th"+" "+"Employee salary");
			arr[i]= defaultValue + scan.nextInt();
			i++;
		}
		i=0;
		while(i<=arr.length-1)
		{
			System.out.println(arr[i]);
			i++;	
		}
	}

}
