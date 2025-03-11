package methods;

public class Strings {
	boolean containing(String str)
	{
		char arr[]=str.toCharArray();
		for(int i=0; i<=arr.length-1;i++)
		{
			if(arr[i] == 'K' || arr[i] == 'k')
			{
				return true;
			}
		}
		return false;
	}
}
