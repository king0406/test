package structure;

public class publicSubStringContinuous {
	public static String s1 = "acbdfeca";  
    public static String s2 = "abdfega";
    
	public static void main(String[] args) {
		System.out.print(getPublicSubStringContinuous(s1,s2));
	}

	public static double getPublicSubStringContinuous(String s1, String s2) {
		int l1=s1.length();
		int l2=s2.length();
		int dp[][]=new int[l1+1][l2+1];
		for(int i=0;i<=l1;i++){
			dp[i][0]=0;
		}
		for(int i=0;i<=l2;i++){
			dp[0][i]=0;
		}
		for(int i=1;i<=l1;i++){
			for(int j=1;j<=l2;j++){
				if(s1.charAt(i-1)==s2.charAt(j-1)&&(i>1&&j>1&&s1.charAt(i-2)==s2.charAt(j-2)||(i==1&&j==1))){
					dp[i][j]=dp[i-1][j-1]+1;
				}else
					dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
			}
		}
		return dp[l1][l2];
	}

}
