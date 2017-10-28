package jsoffer;

public class jsoffer_8 {

	public static void main(String args[]){
		jsoffer_8 q=new jsoffer_8();
	}
	public jsoffer_8() {
		System.out.println(function(1));
	}
	public int function(int n){
		int num=1;
		for(int i=1;i<=n/2;i++){
			int t=1;
			for(int k=1;k<=i;k++){
				t=t*(n-i-k+1)/k;
			}
			num+=t;
		}
		return num;
	}
}
/*
   if(n<1) return 0;
		int a=0,b=1,c=1;
		for(int i=1;i<n;i++){
			c=a+b;
			a=b;
			b=c;
		}
		return c;
 */
