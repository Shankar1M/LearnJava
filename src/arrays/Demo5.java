//Scenario 2
/*Write a Java program to take heights as input from the user and store
 * it in an array according to the below given scenario. Print the contents
 * of an array onto the monitor*/

/* Student
 *    0
 *    1
 *    2
 *    3
 *    4
 *    5
 *    6
 * 
 * */
package arrays;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Float arr[] = new Float[7];
		int i=0;
		while(i<=arr.length-1)
		{
			System.out.println("Enter height of Student"+i);
			arr[i] = scan.nextFloat();
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
		//we can use different loops to achieve same
		/*
		Float []arr2 = new Float[7];
		for(i=0;i<=arr2.length-1;i++)
		{
			System.out.println("Enter height of Student one more time"+i);
			arr2[i] = scan.nextFloat();	
		}
		for(i=0;i<=arr2.length-1;i++)
		{
			System.out.print(arr2[i]+" ");
		}*/
		
	}

}
