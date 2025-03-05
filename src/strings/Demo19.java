// program to reverse the string by preserving the white space also reverse exact string
// Enter the string : 
//	She is a girl
//	ehS si a lrig
package strings;

import java.util.Scanner;

public class Demo19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String input = scan.nextLine();
		String revsent = " ";
		String []inputarr = input.split(" ");
		for(int i=0; i<=inputarr.length-1;i++)
		{
			String word = inputarr[i];
			String revword =" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				revword = revword + word.charAt(j);
			}
			revsent = revsent + revword;
		}
		System.out.print(revsent);
		
	}

}
