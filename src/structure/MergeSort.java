package structure;

public class MergeSort {

	public static void main(String[] args) {
		int[] a={2,34,18,9,6,1,13,5,7,12};
		MergeSort.mergeSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}
	}
	public static void mergeSort(int[] a, int low, int high){
		if(low<high){
			int mid=(low+high)/2;
			mergeSort(a,low,mid);
			mergeSort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	private static void merge(int[] a, int low, int mid, int high) {
		int i=low,j=mid+1,k=i;
		int b[]=new int[high+1];
		for(int c=low;c<=high;c++) b[c]=a[c];
		for(;i<=mid&&j<=high;k++){
			if(b[i]<=a[j]) a[k]=b[i++];
			else a[k]=b[j++];
		}
		while(i<=mid) a[k++]=b[i++];
		while(j<=high) a[k++]=b[j++];
	}

}
