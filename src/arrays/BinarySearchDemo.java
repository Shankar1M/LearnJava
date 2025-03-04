package arrays;

import java.util.Scanner;

public class BinarySearchDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int []arr= new int[scan.nextInt()];
		System.out.println("Enter Array contents");
		for(int i=0; i<=arr.length-1;i++)
		{
			arr[i]= scan.nextInt();
		}
		
		System.out.println("Enter the key to search");
		int key = scan.nextInt();
		int low= 0;
		int high= arr.length-1;
		while(low<=high)
		{
			int mid = (low + high) /2;
			if(key == arr[mid])
			{
				System.out.println("Key found at" +mid);
				System.exit(0);
			}
			else if(key >arr[mid])
			{
				low = mid +1;
				high = high;
			}
			else
			{
				high = mid -1;
				low= low;
			}
		}
		System.out.println("Key not found");
	}

}
