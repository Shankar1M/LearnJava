package methods;

import java.util.Scanner;

public class LinearSearchApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int len = scan.nextInt();
		int a[]= new int[len];
		System.out.println("Enter array elements");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Enter key to search");
		int k= scan.nextInt();
		LinearSearchAlgorithm lsa = new LinearSearchAlgorithm();
		int result = lsa.linearSearch(a, k);
		if(result >=0)
		{
			System.out.println("Key found at the index :"+" "+result);
		}
		else
		{
			System.out.println("Sorry key is not found");
		}
	}

}
