// converting string to character array
package strings;

public class Demo15 {
	public static void main(String[] args) {
		String s= "Kajal";
		char arr[] = s.toCharArray();
		System.out.println(s);
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
