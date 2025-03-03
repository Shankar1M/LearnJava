
//Scenario 1
/*Write a Java program to take salaries of an employee as input from the
 * keyboard and store it in an array. After storing display the contents
 * of an array on to the monitor */

package arrays;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]= new int[5];
		System.out.println("enter the employee's salary");
		for(int i=0; i<=4; i++)
		{
			System.out.println("Enter"+" "+i+"th"+" "+"Employee salary");
			arr[i]=scan.nextInt();
		}
		for(int i=0; i<=4; i++)
		{
			System.out.println(arr[i]);
			
		}
		
	}

}
