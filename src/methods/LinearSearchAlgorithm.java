package methods;

public class LinearSearchAlgorithm {
	int linearSearch(int arr[], int key)
	{
		for(int i =0; i<=arr.length-1; i++)
		{
			if(key == arr[i])
			{
				return i;
			}
		}
		return -9;
	}
}
