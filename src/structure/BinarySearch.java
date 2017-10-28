package structure;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7};
		System.out.println(search(arr,7));
	}
	public static int search(int[] arr,int number){
		int low=0,high=arr.length-1;
		int mid=0;
		while(low<=high){
			mid=(low+high)/2;
			if(arr[mid]<number){
				low=mid+1;
			}else if(arr[mid]==number){
				return mid;
			}else
				high=mid-1;
		}
		return -1;
	}
}
