package arrays;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the Number employees");
     int emp= scan.nextInt();
     int arr[] = new int[emp];
     System.out.println("Enter 1st Employee salary");
     arr[0]= scan.nextInt();
     System.out.println("Enter 2nd Employee salary");
     arr[1]= scan.nextInt();
     System.out.println("Enter 3rd Employee salary");
     arr[2]= scan.nextInt();
     System.out.println("Enter 4th Employee salary");
     arr[3]= scan.nextInt();
     System.out.println("Enter 5th Employee salary");
     arr[4]= scan.nextInt();
     System.out.println("___________________________________");
     System.out.println(arr[0]);
     System.out.println(arr[1]);
     System.out.println(arr[2]);
     System.out.println(arr[3]);
     System.out.println(arr[4]);


     
     
	}

}
