package structure;

public class QuickSort {

	public static void main(String[] args) {
		int[] a={2,1,3,4,5,7,6};
		QuickSort.quickSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}

	public static void quickSort(int[] a,int low,int high){
		if(low<high){
			int p=Partition( a, low, high);
			quickSort(a,low,p-1);
			quickSort(a,p+1,high);
		}
	}

	private static int Partition(int[] a, int low, int high) {
		int temp=a[low];
		while(low<high){
			while(low<high&&a[high]>=temp) --high;
			a[low]=a[high];
			while(low<high&&a[low]<=temp) ++low;
			a[high]=a[low];
		}
		a[low]=temp;
		return low;
	}

}
