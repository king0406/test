package structure;

public class ShellSort {

	public static void main(String[] args) {
		int[] a={2,1,3,4,5,7,6};
		ShellSort.shellSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}

	public static void shellSort(int[] a){
		for(int dk=a.length/2;dk>=1;dk/=2){
			for(int i=dk;i<a.length;i++){
				if(a[i]<a[i-dk]){
					int temp=a[i],j;
					for(j=i-dk;j>=0&&temp<a[j];j-=dk){
						a[j+dk]=a[j];
					}
					a[j+dk]=temp;
				}
			}
		}
	}
}
