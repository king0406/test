package structure;

public class packet2 {
	 	public static int[] weights = {2,1,4,3,5};  
	    public static int[] values = {4,3,5,3,6};  
	    public static int n = 5;  
	    public static int v = 10;  
	    public static int[] results = new int[n];  
	  
	    public static void main(String[] args) {  
	  
	        int result = knapsack(n, v);  
	  
	        System.out.println(result);  
	        for(int s : results) {  
	            System.out.print(s + "\t");  
	        }  
	    }  
	public static int knapsack(int n, int v) {  
        if(n == 1) {  
            if(weights[0] <= v) {  
                results[0] = values[0];  
                return values[0];  
            }else {  
                results[0] = 0;  
                return 0;  
            }  
        }else {  
        	//第n-1个物品不取
            int f1 = knapsack(n - 1, v);  
            int f2 = 0;  
            if(v >= weights[n - 1]) {  
            	//取第n-1个物品
                f2 = knapsack(n - 1, v - weights[n - 1]) + values[n - 1];  
            }  
  
            //存储位置  
//            if(f1 > f2) {  
//                results[n - 1] = 0;  
//                knapsack(n - 1, v);  
//            }else {  
//                results[n - 1] = values[n - 1];  
//                knapsack(n - 1, v - weights[n - 1]);  
//            }  
  
            return Math.max(f1, f2);  
        }  
    }  
}  
