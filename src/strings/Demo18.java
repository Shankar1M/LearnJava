// program to reverse the string by preserving the white space
package strings;

import java.util.Scanner;

public class Demo18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s1 = new String(scan.nextLine());
		char arr1[] = s1.toCharArray() ;
		char arr2[] = new char[arr1.length];
		// mark spaces in result or mark spaces in the new array
		for(int i=0; i<=arr1.length-1;i++)
		{
			if(arr1[i] == ' ') 
			{
				arr2[i] = ' ';
			}
		}
		
		int j= arr2.length-1;
		//characters reversing logic in character array
		for(int i=0;i<=arr1.length-1;i++)
		{   
			if(arr1[i]!= ' ')
			{
				if(arr2[j] == ' ')
				{
					j--;
				}
				arr2[j]=arr1[i];
				j--;
			}
				
		}
	
		s1= new String(arr2);
		System.out.println(s1);
		
	}

}
