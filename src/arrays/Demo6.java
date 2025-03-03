/*
 * Scenario 3 
 * 
 * Write a java program to store the first names of employees by taking the input from the keyboard
 * into an array according to the below given scenario and print the contents of array onto the monitor.
 * 
 * 
 * Employee
 *    0
 *    1
 *    2
 *    3
 *    4
 *    5
 *    6
 *    7
 * */
package arrays;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String arr[] = new String[8];
		int i=0;
		while(i<=arr.length-1)
		{
			System.out.println("Enter Name of Employees"+" "+i);
			arr[i] = scan.next();
			i++;
		}
		System.out.println("Array contents are :");
		System.out.print("arr-->  ");
		i=0;
		while(i<=arr.length-1)
		{
			System.out.print(arr[i]+" ");
			i++;
		}
		
		System.out.println();
	}

}
