package testJVM;

public class TestAnonymousClass {
	public static void main(String args[]) {
		TestAnonymousClass testAnonymousClass = new TestAnonymousClass();
		testAnonymousClass.show();
	}

	// 在这个方法中构造了一个匿名内部类
	private void show() {
		Out anony = new Out() { // 获取匿名内部类实例
			void show() { // 重写父类的方法
				System.out.println("this is Anonymous InterClass showing.");
			}
		};
		anony.show();// 调用其方法
	}
}

// 已有类Out；匿名内部类通过重写其方法获得另外的实现
class Out {
	void show() {
		System.out.println("this is Out showing.");
	}
}
