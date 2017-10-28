package jsoffer;

public class jsoffer_11 {

	public static int NumberOf1(int n) {
		int a=0,b=1;
//			while(b!=0){
//				if((n&b)!=0) a++;
//				b=b<<1;
//			}
		while(n>0){
			if((n%2)==1) a++;
			n=n>>1;
		}
		return a;
    }
	public static void main(String arg[])
    {
		System.out.println(jsoffer_11.NumberOf1(15));
    }
}
