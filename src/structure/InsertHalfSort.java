package structure;

public class InsertHalfSort {

	public static void main(String[] args) {
		int[] a={2,1,3,4,5,7,6};
		InsertHalfSort.insertSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}

	public static void insertSort(int[] a){
		int i,j,low,high,mid,temp;
		for(i=1;i<a.length;i++){
			temp=a[i];
			low=0;
			high=i-1;
			while(low<=high){
				mid=(low+high)/2;
				if(a[mid]>temp) high=mid-1;
				else low=mid+1;
			}
			for(j=i-1;j>=high+1;j--) a[j+1]=a[j];
			a[high+1]=temp;
		}
	}
}
