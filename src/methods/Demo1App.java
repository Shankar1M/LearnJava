//program to find gcd of two numbers
package methods;

import java.util.Scanner;

public class Demo1App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a =scan.nextInt();
		int b =scan.nextInt();
		
		Demo1 d = new Demo1();
		int result = d.findgcd(a,b);
		System.out.println("GCD of "+a+" "+"and"+b+" "+"is"+" "+result);
		
	}

}
