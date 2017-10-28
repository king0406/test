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
	        //c[i][v]��ʾǰi����Ʒǡ����һ������Ϊm�ı������Ի�õ�����ֵ
	        int c[][] = new int[n + 1][v + 1];
	        for (int i = 0; i < n + 1; i++)
	            c[i][0] = 0;
	        for (int j = 0; j < v + 1; j++)
	            c[0][j] = 0;

	        for (int i = 1; i < n + 1; i++) {
	            for (int j = 1; j < v + 1; j++) {
	                //����ƷΪi������Ϊjʱ�������i��������(w[i-1])С������jʱ��c[i][j]Ϊ�����������֮һ��
	                //(1)��Ʒi�����뱳���У�����c[i][j]Ϊc[i-1][j]��ֵ
	                //(2)��Ʒi���뱳���У��򱳰�ʣ������Ϊj-w[i-1],����c[i][j]Ϊc[i-1][j-w[i-1]]��ֵ���ϵ�ǰ��Ʒi�ļ�ֵ
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
