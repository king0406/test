package structure;

public class Swap {

	public static void swap(int [] a,int i,int j){
		int temp=a[j];
		a[j]=a[i];
		a[i]=temp;
	}
	public static void main(String[] args) {

		int a[]={1,4,6,8,2,5,3};
		swap(a,2,5);
		System.out.println(a[2]+","+a[5]);
	}

}
