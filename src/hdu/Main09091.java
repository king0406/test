package hdu;

import java.util.Scanner;

public class Main09091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int l;
		for(int j=0;j<n;j++){
			l=sc.nextInt();
			long[] a=new long[l];
			int num=0;
			for(int i=0;i<l;i++){
				a[i]=sc.nextLong();
				if(a[i]%4==0) num+=2;
				else if(a[i]%2==0) num++;
			}
			if(num>=l) System.out.println("Yes");
			else{
				System.out.println("No");
			}
		}
	}

}
