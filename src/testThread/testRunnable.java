package testThread;

public class testRunnable implements Runnable{

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() +"匿名类实现了接口，匿名类实例化");
			}
		};
		Thread t1=new Thread(r, "新线程1");
		t1.start();
		Thread t2=new Thread(r);
		t2.start();
		new Thread(new testRunnable(1)).start();
	}

	private int i;
	public testRunnable(int i) {
		this.i=i;
	}
	
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +"本类实现了接口"+i);		
	}

}
