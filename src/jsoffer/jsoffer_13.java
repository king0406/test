package jsoffer;

public class jsoffer_13 {

	public static void main(String[] args) {
		int[] a={2,4,6,1,3,5,7};
		jsoffer_13.reOrderArray(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}
	public static void reOrderArray(int [] a) {
		int temp=0;
        for(int i=0;i<a.length;i++){
        	for(int j=0;j<a.length-1;j++){
        		if(a[j]%2==0&&a[j+1]%2==1){
        			temp=a[j];
        			a[j]=a[j+1];
        			a[j+1]=temp;
        		}
        	}
        }
    }

}
