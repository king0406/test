package test;

public class TestSub {

	private int testname=2;
	public static void main(String[] args) {
		TestSub t=new sub();
	}
	
	TestSub(){
		test();
		System.out.println("super");
	}
	
	public void test(){
		System.out.println(testname+"super");
	}

	static class sub extends TestSub{
		private int testname=1;
		public void test() {
			System.out.println(testname+"sub");
		}
		
		sub(){
			System.out.println("sub");
		}
	}
}
