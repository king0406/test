package hdu;

import java.util.Scanner;
class Model{
	int price;
	int length;
	int width;
	int height;
}
public class Main08251 {

	/** 请完成下面这个process函数，实现题目要求的功能 **/
	 /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
	private static int process(Model[] items,int p,int l,int w,int h) 
	{
		int num=0;
		int temp_p=0,temp=0;
		for(int i=0;i<items.length;i++){
			if(items[i].price>p||max(items[i].length,items[i].height,items[i].width)>max(l,w,h)){
				return -1;
			}
			temp_p+=items[i].price;
			temp+=mid(items[i].length,items[i].height,items[i].width);
			if(temp_p>p){
				num++;
				temp_p=items[i].price;
				/*temp_h=items[i].height;
				temp_l=items[i].length;
				temp_w=items[i].width;*/
				temp=mid(items[i].length,items[i].height,items[i].width);
			}else{
				if(temp>mid(l,w,h)){
					num++;
					temp_p=items[i].price;
					temp=mid(items[i].length,items[i].height,items[i].width);
				}
			}
			
		}
		return num;
	}
	private static int max(int a,int b,int c){
		return Math.max(Math.max(a, b), c);
	}
	private static int mid(int a,int b,int c){
		return Math.max(Math.min(a, b), c);
	}
	public static void main(String args[]){
	        Scanner scanner = new Scanner(System.in);
	        int p = 2000;

	        while (scanner.hasNext()){
	           int l = scanner.nextInt();
	           int w = scanner.nextInt();
	           int h = scanner.nextInt();

	            int itemNum = scanner.nextInt();
	            Model[] items = new Model[itemNum];
	            for(int i=0; i<itemNum; i++){
	                Model item = new Model();
	                item.price = scanner.nextInt();
	                item.length = scanner.nextInt();
	                item.width = scanner.nextInt();
	                item.height = scanner.nextInt();
	                items[i] = item;
	            }
	            long startTime = System.currentTimeMillis();
	            int boxMinNum = 10;
	            if(itemNum>boxMinNum) System.out.println(-1);
	            else System.out.println (process(items,p,l,w,h));
	        
	}
	}

}
