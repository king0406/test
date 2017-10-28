package testThread;

public class test extends Thread{

	int i=0;
	test(int i){
		this.i=i;
	}
	public void run(){
		while(i-->0){
			System.out.println(this.getName()+" "+i); 
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
			new test(8).start();
	}

}
