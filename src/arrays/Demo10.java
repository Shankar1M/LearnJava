/* 
 * 2D Jagged Array
 * 
 * Write a java program to take customers bank balence as input from the keyboard
 * of the  customers present in different banks and store it in a appropriate array
 * Display the contents of array onto the monitor based on the below given scenario
 * 
 * 
 * Banks    Customers
 * 0        0 1 
 * 1        0 1 2 
 * 2        0 1 
 *       
 * 
 * 
 * */
package arrays;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[3][];
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[1];
		System.out.println("Enter the Bank elements");
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1;j++)
			{
			System.out.println("Enter the balence of bank"+i+" "+"and customer"+j);
			arr[i][j]= scan.nextInt();
			}
		}
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1;j++)
			{
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
