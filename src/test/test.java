package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;

import hdu.Add;

abstract class a implements B{
	
}
interface B {
	public void testb();
}
class te{
	private int a=1;
	int u=2;
	protected int r=3;
	public int getA(){
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}
public class test extends Add implements B{
		
		private int aa=10;
	    int b=20;
	    static int c=1;
	    String str;
	    float f=11.1f;
	    char s='7';
	    int p=s+b;
	    public static void main(String arg[])
	    {
	    	try {
				new OutputStreamWriter(new FileOutputStream(""));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        test t = new test(3);
	        t.bbb(t);
	        System.out.println(t.aaa());
	        String q="2";
	        String w="2";
	        System.out.println(q==w);
	        te tst=new te();
	        tst.setA(3);
	        System.out.println(tst.getA());
	        System.out.println(tst.r);
	        B tb = new test();
	    	tb.testb();
	    }
	    public void a(B b){
	    	this.aa=3;
	    }
	    test(){
	    	 
	    }
	    test(int a){
	    	a=3;
	    	this.aa=4;
	    }
	    public void bbb(test t){
	    	t=new test();
	    	t.aa=5;
	    }
	    public int aaa(){
	    	//String str;局部变量没有默认值
	    	try{
	        	System.out.println(aa+"a"+str);
	        }catch(Exception e){
	        	return 2;
	        }finally{
	        	System.out.println("b");
	        	//return 3;
	        }
	        	return 1;
	    }
		@Override
		public void testb() {
			System.out.println("shixian b");
		}

}
