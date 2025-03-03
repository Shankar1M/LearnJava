/* 
 * 3D Jagged Array
 * 
 * Write a java program to take customers bank balence as input from the keyboard
 * of the  customers present in different banks and store it in a appropriate array
 * Display the contents of array onto the monitor based on the below given scenario
 * 
 * 
 * Banks    Bracnches   Customers
 * 0        0			0 1
 * 			1   		0 1 2
 * 
 * 1        0           0 1 2 3
 * 
 * 2        0			0
 * 			1 			0 1
 * 			2           0 1 2
 *       
 * 
 * 
 * */
package arrays;

import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][][] = new int[3][][];
		arr[0]=new int[2][];
		arr[1]=new int[1][];
		arr[2]=new int[3][];
		arr[0][0] =  new int[2];
		arr[0][1] =  new int[3];
		arr[1][0] =  new int[4];
		arr[2][0] =  new int[1];
		arr[2][1] =  new int[2];
		arr[2][2] =  new int[3];
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1;j++)
			{
				for(int k=0; k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter the balence of bank"+i+" "+"branch"+j+"and Customer"+k);
					arr[i][j][k]= scan.nextInt();
				}
			
			}
		}
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1;j++)
			{
				for(int k=0; k<=arr[i][j].length-1;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			
			}
		}
	}

}
