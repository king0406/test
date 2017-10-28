package test;

public class object_1 {

	public static void main(String[] args) throws InterruptedException {

		Object o=new Object();
		System.out.println(o.equals(1L));
		o.getClass();
		o.hashCode();
		o.notify();
		o.notifyAll();
		o.toString();
		o.wait();
		o.wait(0);
		o.wait(0, 0);
	}

}
