package test;

abstract class t {
	private int test() {
		return 1;
	}
}
class fath{
	static int i=1;
}
public class test918 extends fath{

	class Super {
		int flag = 1;

		Super() {
			test();
		}

		void test() {
			System.out.println("Super.test() flag=" + flag);
		}
	}

	class Sub extends Super {
		Sub(int i) {
			flag = i;
			System.out.println("Sub.Sub()flag=" + flag);
		}

		void test() {
			System.out.println("Sub.test()flag=" + flag);
		}
	}

	public static void main(String[] args) {
		new test918().new Sub(5);
		System.out.println(i);
	}

}
