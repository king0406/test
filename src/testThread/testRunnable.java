package testThread;

public class testRunnable implements Runnable{

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() +"������ʵ���˽ӿڣ�������ʵ����");
			}
		};
		Thread t1=new Thread(r, "���߳�1");
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
		System.out.println(Thread.currentThread().getName() +"����ʵ���˽ӿ�"+i);		
	}

}
