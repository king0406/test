package test;

public class shilihua {

	static int b=1;
	int c=2;
	public void d(){
		
	}
	public void e(){
		d();
	}
	public static void a(){
		System.out.println("a"+b);
	}
	public static void main(String[] args) {

		shilihua slh=null;
		slh.a();
		slh=new shilihua();
		slh.a();
	}

}
