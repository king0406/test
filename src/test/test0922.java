package test;

public class test0922 {

	public static void main(String[] args) {
		int[] arr = {2,1,3,4,5,7,6};
		test(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static void test(int[] arr){
		for(int i=arr.length/2-1;i>=0;i--) quick(arr,i,arr.length-1);
		for(int i=arr.length-1;i>0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			quick(arr,0,i-1);
		}
	}

	private static void quick(int[] arr, int low, int high) {
		int temp=arr[low];
		for(int i=low*2+1;i<=high;i=i*2+1){
			if(i<high&&arr[i]<arr[i+1]) i++;
			if(arr[i]<temp) break;
			arr[low]=arr[i];
			low=i;
		}
		arr[low]=temp;
	}

}
