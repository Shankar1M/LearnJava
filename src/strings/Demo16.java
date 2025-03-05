/*program to reverse the string without using inbuilt
function that performs reversing operation*/

package strings;

import java.util.Scanner;

public class Demo16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//taking string frm keyboard
		System.out.print("Enter a string: "+" ");
		// storing string in s1
		String s1 = new String(scan.next());
		// converting string to character array
		char arr[]= s1.toCharArray();
		// created on empty array to store reversed characters in char array
		char arr2[]= new char[arr.length];
		// j starts frm last index of arr2[]
		int j= arr2.length-1;
		//characters reversing logic in character array
		for(int i=0;i<=arr.length-1;i++)
		{
			arr2[j]=arr[i];
			j--;
		}
		// storing the contents of charcter array in string
		s1 = new String(arr2);
		System.out.println("Reversed string is: "+" "+s1);
		}

}
