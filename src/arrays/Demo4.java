//Scenario 1

/*Write a Java program to take salaries of an employee as input from the
 * keyboard and store it in an array. After storing display the contents
 * of an array on to the monitor using both while loop and do while loop*/


package arrays;

import java.util.Scanner;

public class Demo4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]= new int[5];
		System.out.println("enter the employee's salary");
		int i=0;
		//using while loop
		while(i<=arr.length-1)
		{
			System.out.println("Enter"+" "+i+"th"+" "+"Employee salary");
			arr[i]=scan.nextInt();
			i++;
		}
		i=0;
		while(i<=arr.length-1)
		{
			System.out.println(arr[i]);
			i++;	
		}
		// using do while loop
		int arr2[]= new int[5];
		i=0;
		
		do
		{
			System.out.println("Enter"+" "+i+"th"+" "+"Employee salary");
			arr2[i]=scan.nextInt();
			i++;
		}while(i<=arr2.length-1);
		
		i=0;
		do
		{
			System.out.println(arr2[i]);
			i++;
		}while(i<=arr2.length-1);
	}

}
