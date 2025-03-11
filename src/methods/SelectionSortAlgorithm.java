package methods;

public class SelectionSortAlgorithm {
	
	void selectionSort(int arr[])
	{
		int min=0;
		int pos=0;
		int temp=0;
		for(int i=0;i<=arr.length-2;i++)
		{
			min=arr[i];
			pos=i;
			for(int j=i+1; j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
	}

}
