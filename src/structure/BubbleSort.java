package structure;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a={2,1,3,4,5,7,6};
		BubbleSort.bubbleSort2(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}

	
	public static void bubbleSort2(int[] arr){
		int temp, i, j;
		boolean tag=true;
		for (i = 0; i < arr.length; i++) {
			for(j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					tag=false;
				}
			}
			if(tag) break;
		}
	}
}
