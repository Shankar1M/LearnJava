// copy the contents of one array to another array
package arrays;

import java.util.Scanner;

public class Demo13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int []arr1 = new int[scan.nextInt()];
		System.out.println("Enter Array elements");
		for(int i=0; i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		int []arr2 = new int[arr1.length];
		for(int i=0; i<=arr1.length-1;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("Array 1 contents are");
		for(int i=0; i<=arr1.length-1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("Array 2 contents are");
		for(int i=0; i<=arr2.length-1;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		
	}

}
