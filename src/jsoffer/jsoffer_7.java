package jsoffer;

public class jsoffer_7 {

	public int Fibonacci(int n) {
		if(n<1) return 0;
		int a=0,b=1,c=1;
		for(int i=1;i<n;i++){
			c=a+b;
			a=b;
			b=c;
		}
		return c;
    }
}
//if(n==1) return 0;
//else if(n==2) return 1;
//else return Fibonacci(n-1)+Fibonacci(n-2);