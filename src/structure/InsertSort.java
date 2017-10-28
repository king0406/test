package structure;

import jsoffer.jsoffer_13;

public class InsertSort {

	public static void main(String[] args) {
		int[] a={2,1,3,4,5,7,6};
		InsertSort.insertSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}
	
	public static void insertSort(int a[]){
		int temp, i, j;
		for (i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				for (j = i - 1, temp = a[i]; j >= 0 && temp < a[j]; j--)
					a[j + 1] = a[j];
				a[j + 1] = temp;
			}
		}
	}

}
