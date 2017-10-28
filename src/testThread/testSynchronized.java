package testThread;

class ABC {
	static synchronized public void deal() throws InterruptedException {
		System.out.println(System.currentTimeMillis());
		Thread.sleep(2000);
		System.out.println(System.currentTimeMillis());
	}
}
class myThread222 extends Thread{
	private ABC a = new ABC();
	public myThread222(ABC a) {
		this.a = a;
	}
	@Override
	public void run() {
		try {
			a.deal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class testSynchronized {
	public static void main(String[] args) throws InterruptedException {
		ABC a = new ABC();
		ABC b =new ABC();
		myThread222 t1 = new myThread222(a);
		myThread222 t2 = new myThread222(b);
		t1.start();
		t2.start();
	}

}
