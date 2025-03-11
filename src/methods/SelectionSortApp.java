package methods;

import java.util.Scanner;

public class SelectionSortApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int len = scan.nextInt();
		int a[]= new int[len];
		System.out.println("Enter array contents");
		for(int i=0; i<=a.length-1;i++)
		{
			a[i]=scan.nextInt();
		}
		SelectionSortAlgorithm ssa = new SelectionSortAlgorithm();
		ssa.selectionSort(a);
		System.out.println("Sorted array is: ");
		for(int i=0; i<=a.length-1;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}

}
