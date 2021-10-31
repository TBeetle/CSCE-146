/*
 * Tyler Beetle
 */
public class SortingAlgos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,9,8,7,6,5,4,3,2,1};
		mergeSort(array);
		for(int i : array);
	}
	public static void mergeSort(int[] a)
	{
		int size = a.length;
		if(size < 2)//Halting condition
			return;
		int mid = size/2;
		int leftSize = mid;
		int rightSize = size - mid; 
		int[] left = new int[leftSize];
		int[] right = new int[rightSize];
		//Populate the left and the right 
		for(int i=0;i<mid;i++)
			left[i] = a[i];
		for(int i=mid;i<size;i++)
			right[i-mid] = a[i];
		//Recursive
		mergeSort(left);
		mergeSort(right);
		//merge(left,right,a);
	}
	public static void merge(int[] left, int[] right, int [] a)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0;//Left array's index
		int j = 0;//Right array's index
		int k = 0;//Merged array (a)'s index
		while(i<leftSize && j<rightSize)
		{
			if(left[i]>right[j])
			{
				a[k] = left[i];
				i++;
				k++;
			}
			else
			{
				a[k] = right[j];
				j++;
				k++;
			}
		}
		//Left over data
		while(i<leftSize)
		{
			a[k] = left[i];
			i++;
		}
		while(j<rightSize)
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}
	public static void quickSort(int[] a)
	{
		quickSort(a,0,a.length-1);
	}
	public static void quickSort(int[] a,int start,int end)
	{
		if(start >= end)
			return;
		int pivot;//Something
	}
	public static int partition(int[] a, int start, int end)
	{
		int pivot = a[end];
		int i = start;
		for(int j=start;j<end;j++)
		{
			if(a[j] < pivot)
			{
			 int temp = a[i];
			 a[i] = a[j];
			 a[j] = temp;
			 i++;
			}
		}
		int temp = a[i];
		a[i] = a[end];
		a[end] = temp;
		return i;
	}
}
