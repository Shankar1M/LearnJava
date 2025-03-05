// StringTokenizer ==> Is used to chopp the string at a particular character
//After chopping token would be generated and to access the token we can make use 
//of hasMoreTokens() and nextToken()
// whenever we tell the characters that character also chopped off

package strings;
import java.util.*;
public class Demo13 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer(" RAJA RAM MOHAN ROY"," ");
		while(st.hasMoreTokens() == true)
		{
			System.out.println(st.nextToken());
		}
	}

}
