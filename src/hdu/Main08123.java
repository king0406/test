package hdu;

import java.util.Scanner;
/*
 * 小易非常喜欢拥有以下性质的数列:
1、数列的长度为n
2、数列中的每个数都在1到k之间(包括1和k)
3、对于位置相邻的两个数A和B(A在B前),都满足(A <= B)或(A mod B != 0)(满足其一即可)
例如,当n = 4, k = 7
那么{1,7,7,2},它的长度是4,所有数字也在1到7范围内,并且满足第三条性质,所以小易是喜欢这个数列的
但是小易不喜欢{4,4,4,2}这个数列。小易给出n和k,希望你能帮他求出有多少个是他会喜欢的数列。
 定义dp[j][i]表示长度为i最后一个数是j的小易喜欢的数列的数量
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
