package testSpring;

interface Subject1 {
	public void request();
}

class RealSubject1 implements Subject1 {

	@Override
	public void request() {
		System.out.println("RealSubject");
	}

}

class Proxy1 implements Subject1 {

	private Subject1 sub = null;

	public Proxy1() {
		this.sub = new Proxy1();
	}

	public Proxy1(Object... objects) {
		if (objects.length == 1) {
			this.sub = (Subject1) objects[0];
		}
	}

	public Proxy1(Subject1 sub) {
		this.sub = sub;
	}

	@Override
	public void request() {
		before();
		this.sub.request();
		after();
	}

	private void before() {
		System.out.println("before");
	}

	private void after() {
		System.out.println("after");
	}
}

public class testProxy {

	public static void main(String[] args) {
		Subject1 subject = new RealSubject1();
		Subject1 sub = new Proxy1(subject);
		sub.request();
	}

}
