package hdu;

import java.util.Scanner;

public class Main1020 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		for(int k=0;k<l;k++){
			String str=sc.next();
			int sum=0;
			char[] ch=str.toCharArray();
			int n=ch.length;
			int dp[][]=new int[n+1][n+1];
			for(int i=0;i<=n;i++){
				dp[i][0]=0;
			}
			for(int i=0;i<=n;i++){
				dp[0][i]=0;
			}
			boolean cap=false;
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					if(Character.isLowerCase(ch[i])==Character.isLowerCase(ch[i-1])){
						dp[i][j]=dp[i-1][j-1]+1;
					}else
						dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
			System.out.println(dp[n][n]);
		}
	}

}
