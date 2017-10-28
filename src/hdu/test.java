package hdu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class A{
	int a=0;
}
public class test {
	//private final static int i=0;
	public static void main(String[] args) {
		double a=32.45454;
		double b=Round(a,1);
		System.out.println(b);
		}
	public static double Round(double d,int i){
		for(int j=i;j>0;j--) d*=10;
		d=Math.round(d);
		for(int j=i;j>0;j--) d/=10;
		return d;
	}
  
}
//String a="ad fds sa  ";
//			String b=a.replaceAll(" ", "");
//			System.out.println(b);
//int a;
//int b;
//StringBuffer c;
//StringBuffer d;
//a = 0;
//b = a;
//c = new StringBuffer("This is c");
//d = c;
//
//a = 2;
//c.append("!!");
//
//System.out.println("a=" + a);
//System.out.println("b=" + b);
//System.out.println("c=" + c);
//System.out.println("d=" + d);
//System.out.println();
//		String a="1123  456";
//		String[] b=a.split("\\s+");
//		Double c=123.5;
//		hqz8_9 a=new hqz8_9();
//		char q='e';
//		System.out.println(String.valueOf(c));
//		System.out.println(c.toString());
//		System.out.println(a);
//		System.out.println((String)null);
//	class Super{
//		int flag=1;
//		
//		Super(){
//			test();
//		}
//		void test(){
//			System.out.println("Suer.test() flag="+flag);
//		}
//	}
//	
//	class Sub extends Super{
//		Sub(int i){
//			flag=i;
//			System.out.println("Sub.test() flag="+flag);
//		}
//		void test(){
//			System.out.println("Sub.test() flag="+flag);
//		}
//	}
	
//	public static void main(String[] args) {
//		new test().new Sub(5);
//		
//	}
//}
//		Set<MyClass> set=new HashSet<MyClass>();
//		set.add(new MyClass(5));
//		set.add(new MyClass(2));
//		set.add(new MyClass(6));
//		System.out.print(set.size());
//	}
//}
//	class MyClass{
//		Integer i;
//		public MyClass(Integer y){
//			i=y;
//		}
//		public boolean equals(MyClass c){
//			return false;
//		}
//		public boolean equals(Object o){
//			return false;
//		}
//		public int hashCode(){
//			return 32;
//		}
//	}
//		x--;
//		method();
//		System.out.print(x+y+ ++x);
//	}
//	static{
//		x=1;
//	}
//	static int x,y;
//	public static void main(String[] args) {
//		x--;
//		method();
//		System.out.print(x+y+ ++x);
//	}
//	static void method(){
//		y=x++ + ++x;
//	}
//	public static void main(String[] args) {
//		HashMap map=new HashMap<Integer,Integer>();
//		changeHashMap(map);
//		for(Iterator it=map.keySet().iterator();it.hasNext();){
//			Object key=it.next();
//			System.out.println(key+"="+map.get(key));
//		}
//	}
//
//	static void changeHashMap(HashMap map){
//		map=new HashMap<Integer,String>();
//		map.put(6, "apple");
//		map.put(3, "banana");
//		map.put(2, "pear");
//		map.put(null, null);
//		map.put(null, null);
//	}
//}
