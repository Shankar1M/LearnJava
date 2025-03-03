/* Write a java program to take height as input from the keyboard
 * of various players present in various games and store it in a array
 * Display the contents of array onto the monitor based on the below given scenario
 * 
 * 
 * Games    Players
 * 0        0 1 2 
 * 1        0 1 2 
 * 2        0 1 2 
 * 3        0 1 2
 * 4        0 1 2
 * 
 * 
 * */
package arrays;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Float arr[][] = new Float[5][3];
	
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1;j++)
			{
			System.out.println("Enter the height of Game"+i+" "+"and Player"+j);
			arr[i][j]= scan.nextFloat();
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
