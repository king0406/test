package testJVM;

public class testClassInit {

	 public static void main(String[] args) {
	        func();
	        System.out.println(b);
		    testClassInit st = new testClassInit();
	    }
	    static testClassInit st = new testClassInit();
	    
	    static{
			System.out.println(Math.ceil(new Double(-0.5)));
		}
		
		{
			System.out.println(++b);
		}
		
	    static void func(){
	    	System.out.println(++b);
	    }

	    testClassInit(){
	    	System.out.println("a="+a+"b="+b);
	    }
	    
	    int a=1;
	    static int b=2;
}
