package hdu;

import java.util.Arrays;
import java.util.Scanner;

public class Main08122 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][]=new int[4][2];
		for(int i=0;i<n;i++){
			a[i][0]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			a[i][1]=sc.nextInt();
		}
		System.out.print(0);
		int s[]=new int[n];
		for(int i=1;i<n;i++){
			int sum=0;
			for(int j=0;j<n;j++){
				s[j]=JL(a[j][0],a[j][1],i,1);
				//sum+=l;
			}
			Arrays.sort(s);
			for(int k=0;k<=i;k++){
				sum+=s[k];
			}
			System.out.print(" "+sum);
		}
	}

	private static int JL(int i, int j, int m, int n) {
		
		return Math.abs(i-m)+Math.abs(j-n); 
	}

}
