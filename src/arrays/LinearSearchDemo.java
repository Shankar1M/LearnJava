package arrays;

import java.util.Scanner;

public class LinearSearchDemo {
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
		for(int i=0; i<=arr.length-1;i++)
		{
			if(key == arr[i]) {
				System.out.println("Key found at the index of "+i);
				System.exit(0);
			}
		}
		System.out.println("Key not found");
	}

}
