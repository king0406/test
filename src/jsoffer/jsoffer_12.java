package jsoffer;

public class jsoffer_12 {
	public static double Power(double base, int exponent) {
		double num=base;
		int n=0;
		if(base==0){
			throw new RuntimeException("��ĸ����Ϊ0");
		}
		if(exponent==0){
			return 1;
		}else if(exponent>0){
	        n=exponent;
		}else{
			n=-exponent;
		}
		while(n>1){
	        	num=base*num;
	        	n--;
	        }
		/* while(exponent!=0){
		        if((exponent&1)==1)
		            res*=curr;
		        curr*=curr;// ����
		        exponent>>=1;// ����һλ
		    }*/
		return exponent>0?num:(1/num);
	  }
	public static void main(String arg[])
    {
        System.out.println(jsoffer_12.Power(-2, 3));
        
    }
}
