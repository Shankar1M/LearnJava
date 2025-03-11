package methods;

import java.util.Scanner;

public class StringsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = scan.nextLine();
		Strings s1 = new Strings();
		boolean result = s1.containing(s);
		if(result == true)
		{
			System.out.println("String contains k");
		}
		else
		{
			System.out.println("String does not contain k");
		}

	}

}
