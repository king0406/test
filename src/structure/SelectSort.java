package structure;

public class SelectSort {

	public static void main(String[] args) {
		int[] a={2,1,3,4,5,7,6};
		SelectSort.selectSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}

	public static void selectSort(int[] arr){
		int temp, i, j,max;
		for (i = 0; i < arr.length; i++) {
			for(j=0,max=arr.length-i-1;j<arr.length-i;j++){
				if(arr[j]>arr[max]) 
					max=j;
			}
			if(max!=arr.length-i-1){
				temp=arr[max];
				arr[max]=arr[j-1];
				arr[j-1]=temp;
			}
		}
	}
}
