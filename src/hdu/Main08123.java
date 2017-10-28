package hdu;

import java.util.Scanner;
/*
 * С�׷ǳ�ϲ��ӵ���������ʵ�����:
1�����еĳ���Ϊn
2�������е�ÿ��������1��k֮��(����1��k)
3������λ�����ڵ�������A��B(A��Bǰ),������(A <= B)��(A mod B != 0)(������һ����)
����,��n = 4, k = 7
��ô{1,7,7,2},���ĳ�����4,��������Ҳ��1��7��Χ��,�����������������,����С����ϲ��������е�
����С�ײ�ϲ��{4,4,4,2}������С�С�׸���n��k,ϣ�����ܰ�������ж��ٸ�������ϲ�������С�
 ����dp[j][i]��ʾ����Ϊi���һ������j��С��ϲ�������е�����
 */
public class Main08123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(problem1(n,k));
	}
	public static int problem1(int n, int k){
		int max = (int) Math.pow(10, 5);
		int dp[][]=new int[max][10];
		dp[1][0]=1;
		for(int i = 1; i <= n; i++) {
//	        int sum = 0;
//	        for(int j = 1; j <= k; j++) {
//	            sum += dp[j][i - 1];
//	        }
//	        for(int j = 1; j <= k; j++) {
//	            int sum2 = 0;
//	            for(int z = j + j; z <= k; z += j) {
//	                sum2 += dp[z][i - 1];
//	            }
//	            dp[j][i] = sum - sum2 ;
//	        }
	        for(int j = 1; j <= k; j++) {
	        	int sum = 0;
	        	for(int z = 1 ; z <= k; z += 1) {
	        		if(z<=j||z%j!=0)
	        		sum += dp[z][i - 1];
	        	}
	            dp[j][i] = sum ;
	        }
	    }
	    int ans = 0;
	    for(int j = 1; j <= k; j++) {
	        ans += dp[j][n];
	    }
		return ans;
	}
//	public static int calSub(int value){
//		int temp = 0;
//		for(int i = 1; i < value ; i++){
//			if(value % i == 0){
//				temp++;
//			}
//		}
//		return temp;
//	}
}
