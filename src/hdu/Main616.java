package hdu;

import java.util.Arrays;
import java.util.Scanner;

public class Main616 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		int b=0,c=0,temp=0;
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		Arrays.sort(a);
		if(n>4){
			for(int i=2,max=0;i<n-2;i++){
				b=a[i]-a[i-2];
				c=a[i+2]-a[i];
				max=Math.max(b, c);
				if(temp<max) temp=max;
			}
		}else if(n==2||n==3){
			temp=a[n-1]-a[0];
		}else if(n==4){
			b=a[2]-a[0];
			c=a[3]-a[1];
			b=Math.max(b, c);
			c=a[1]-a[0];
			temp=Math.max(c, b);
		}else temp=a[0];
		System.out.println(temp);
	}

}
