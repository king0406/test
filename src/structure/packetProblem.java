package structure;

public class packetProblem {
	 	public static int[] weights = {2,1,4,3,5};  
	    public static int[] values = {4,3,5,3,6};  
	    public static int n = 5;  
	    public static int v = 10;  
	  
	    public static void main(String[] args) {  
	  
	        int c[][] = knapsack(weights,values);  
	  
	        for (int i = 1; i <=n; i++) {
	            for (int j = 1; j <=v; j++) {
	                System.out.print(c[i][j]+"\t");
	                if(j==v){
	                    System.out.println();
	                }
	            }
	        }  
	    }  
	    public static int[][] knapsack(int[] w, int[] p) {
	        //c[i][v]表示前i件物品恰放入一个重量为m的背包可以获得的最大价值
	        int c[][] = new int[n + 1][v + 1];
	        for (int i = 0; i < n + 1; i++)
	            c[i][0] = 0;
	        for (int j = 0; j < v + 1; j++)
	            c[0][j] = 0;

	        for (int i = 1; i < n + 1; i++) {
	            for (int j = 1; j < v + 1; j++) {
	                //当物品为i件重量为j时，如果第i件的重量(w[i-1])小于重量j时，c[i][j]为下列两种情况之一：
	                //(1)物品i不放入背包中，所以c[i][j]为c[i-1][j]的值
	                //(2)物品i放入背包中，则背包剩余重量为j-w[i-1],所以c[i][j]为c[i-1][j-w[i-1]]的值加上当前物品i的价值
	                if (w[i - 1] <= j) {
	                    if (c[i - 1][j] < (c[i - 1][j - w[i - 1]] + p[i - 1]))
	                        c[i][j] = c[i - 1][j - w[i - 1]] + p[i - 1];
	                    else
	                        c[i][j] = c[i - 1][j];
	                } else
	                    c[i][j] = c[i - 1][j];
	            }
	        }
	        return c;
	    }
}  
