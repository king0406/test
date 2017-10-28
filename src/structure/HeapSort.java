package structure;

public class HeapSort {

	public static void main(String[] args) {
		int[] a={2,34,18,9,6,1,13,5,7,12};
		HeapSort.heapSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}
	}

	public static void heapSort(int[] a){
		for(int i=a.length/2-1;i>=0;i--) heapAdjust(a,i,a.length-1);
		for(int i=a.length-1;i>0;i--){
			Swap.swap(a, 0, i);
			heapAdjust(a,0,i-1);
		}
	}

	private static void heapAdjust(int[] a, int i, int length) {
		int temp=a[i];
		for(int j=i*2+1;j<=length;j=j*2+1){
			if(j<length&&a[j]<a[j+1]) j++;
			if(temp>=a[j]) break;
			a[i]=a[j];
			i=j;
		}
		a[i]=temp;
	}
}
