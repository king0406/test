package test;

import java.util.Scanner;

public class Test0913 {
	static int[] a={1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(BinarySearch(n));
			try {
				System.out.println(Class.forName("test.Test0913").newInstance());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static boolean BinarySearch(int test){
		int mid,high,low;
		low=0;
		high=a.length-1;
		while(low<=high){
			mid=(low+high)/2;
			if(test<a[mid]){
				high=mid-1;
			}else if(test>a[mid]){
				low=mid+1;
			}else 
				return true;
		}
		return false;
	}

}
