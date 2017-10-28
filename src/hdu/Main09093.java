package hdu;

import java.util.Scanner;

//dp[i][j]表示小Q上一个演唱的音符是v[i],牛博士上一个演唱的音符是v[j]的最小难度和。
//dp[la][lb] = min(solve(now, lb) + (la>0 ? abs(v[now] - v[la]) : 0), 
//	solve(la, now) + (lb>0 ? abs(v[now] - v[lb]) : 0));
public class Main09093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int min=100,temp=0,k=0,sum=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				temp=Math.abs(a[j]-a[i]);
				if(temp<min){
					min=temp;
					k=j;
				}
				sum+=min;
			}
		}
	}

}
