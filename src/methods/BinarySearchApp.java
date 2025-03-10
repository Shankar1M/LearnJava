package methods;

import java.util.Scanner;

public class BinarySearchApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int len = scan.nextInt();
		int a1[] = new int[len];
		System.out.println("Enter array contents");
		for(int i=0;i<=a1.length-1;i++)
		{
			a1[i]=scan.nextInt();
		}
		System.out.println("Enter key to search");
		int k= scan.nextInt();
		BinarySearchAlgorithm bsa = new BinarySearchAlgorithm();
		int result = bsa.binarySearch(a1, k);
		if(result >=0)
		{
			System.out.println("Key found at the index :"+" "+result);
		}
		else
		{
			System.out.println("Key is not found take a look at array");
			for(int i=0;i<=a1.length-1;i++)
			{
				System.out.print(a1[i]+" ");
			}
		}

	}

}
