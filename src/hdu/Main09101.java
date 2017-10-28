package hdu;

import java.util.HashSet;
import java.util.Scanner;

public class Main09101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long temp=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println(getResult(a));
//		int dp[][]=new int[n+1][n+1];
//		for(int i=0;i<=n;i++){
//			dp[i][0]=0;
//		}
//		for(int i=0;i<=n;i++){
//			dp[0][i]=0;
//		}
//		for(int i=1;i<=n;i++){
//			temp=a[i-1];
//			boolean b=true;
//			for(int j=1;j<=n;j++){
//				if(b&&a[i-1]==0){
//					dp[i][i]=dp[i-1][i-1]+1; 
//					b=false;
//				}else if(b&&j==i+1&&a[i-1]==a[j-1]){
//					dp[i][j]=dp[i-1][j-1]+1; 
//					b=false;
//				}else if(b&&j>i&&(temp^a[j-1])==0){
//					dp[i][j]=dp[i-1][j-1]+1; 
//					b=false;
//				}else{
//					if(j>i) temp=temp^a[j-1];
//					if(dp[i][j]==0) dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
//				}
//			}
//		}
//		System.out.print(dp[n][n]);
		
	}
	private static int getResult(int[] nums)
    {
        int count = 0;
        HashSet<Integer> cont = new HashSet<>();
        cont.add(0);
        int sums = 0;
        for (int i = 0; i < nums.length; i++)
        {
            sums = sums ^ nums[i];
            if (!cont.contains(sums))
            {
                cont.add(sums);
            }else
            {
                cont.clear();
                cont.add(0);
                sums = 0;
                count++;
            }
        }
        return count;
    }


}
