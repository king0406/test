package testThread;

public class testThread {

	public static void main(String [] args) {
	      Runnable hello = new testRunnable(1);
	      Thread thread1 = new Thread(hello);
	      thread1.setDaemon(true);
	      thread1.setName("hello");
	      System.out.println("Starting hello thread...");
	      thread1.start();
	      
	      Runnable bye = new testRunnable(2);
	      Thread thread2 = new Thread(bye);
	      thread2.setPriority(Thread.MIN_PRIORITY);
	      thread2.setDaemon(true);
	      System.out.println("Starting goodbye thread...");
	      thread2.start();
	 
	      System.out.println("Starting thread3...");
	      Thread thread3 = new test(7);
	      thread3.start();
	      try {
	    	  //join（0）=join（）等待线程终止，join(millisec) 等待超时。需要捕捉异常。
	         thread3.join();
	      }catch(InterruptedException e) {
	         System.out.println("Thread interrupted.");
	      }
	      System.out.println("Starting thread4...");
	      Thread thread4 = new test(5);
	      
	      thread4.start();
	      System.out.println("main() is ending...");
	   }
}
