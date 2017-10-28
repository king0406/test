package testJVM;
class Abc{
	
}
public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc abc=new Abc();
		ClassLoader cl=abc.getClass().getClassLoader();
		System.out.println(cl);
	}

}
