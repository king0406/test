package testThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class testCallable implements Callable<Integer>{

	public static void main(String[] args) {
		FutureTask<Integer> ft=new FutureTask<>(new testCallable());
		for(int i = 0;i < 10;i++){ 
			System.out.println(Thread.currentThread().getName()+" 的循环变量i的值"+i);
			new Thread(ft).start();
		}
		try {
			System.out.println(ft.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Integer call() throws Exception {
		int i=0;
		for(;i<10;i++)  
        {  
            System.out.println(Thread.currentThread().getName()+" "+i);  
        }
		return i;
	}

}
