package hdu;

import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Main09182 {
	
	static ConcurrentLinkedQueue<String> queue=new ConcurrentLinkedQueue<String>();
	static AtomicInteger count = new AtomicInteger(0);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			queue.offer(sc.nextLine());
		}
		for(int i=0;i<3;i++){
			new Thread(new Runnable(){

				@Override
				public void run() {
					while(!queue.isEmpty()){
						String str=queue.poll();
						if(str.indexOf("u51")!=-1){
							count.addAndGet(1);
						}
					}
				}
				
			}).start();
		}
		System.out.println(count);
	}
}
