/* 
 * 2D Jagged Array
 * 
 * Write a java program to take First name  as input from the keyboard
 * of the  Students present in different classes and store it in a appropriate array
 * Display the contents of array onto the monitor based on the below given scenario
 * 
 * 
 * Classes    Students
 * 0      	  0 1 2 3
 * 1      	  0 1 2 
 * 2      	  0 1 
 * 3      	  0 1 2 3
 * 4      	  0 
 * 5      	  0 1 2 

 *       
 * 
 * 
 * */
package arrays;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String arr[][] = new String[6][];
		arr[0]=new String[4];
		arr[1]=new String[3];
		arr[2]=new String[2];
		arr[3]=new String[4];
		arr[4]=new String[1];
		arr[5]=new String[3];
	
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1;j++)
			{
			System.out.println("Enter the First name Of class"+i+" "+"and student"+j);
			arr[i][j]= scan.next();
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
