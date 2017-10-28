package testJVM;

public class ObjectInit {
	public static void main(String[] args) {
        //func();
        ObjectInit st = new ObjectInit();
        //out:1 2 1,2
    }
    
	static{
		System.out.println(1);
	}
	
	{
		System.out.println(2+""+b);
	}
	
    static void func(){
    	System.out.println("3"+b);
    }

    ObjectInit(){
    	System.out.println(a+","+b);
    }
    
    int a=1;
    static int b=2;
}
