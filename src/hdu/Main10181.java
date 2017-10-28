package hdu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main10181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Map<Long,Integer> counter=new HashMap<Long,Integer>();
		Long str;
		while(n-->0){
			str=sc.nextLong();
			if(counter.containsKey(str)){
				counter.put(str, counter.get(str)+1);
			}else{
				counter.put(str, 1);
			}
		}
		int max=0;
		Long min=null;
		for(Long st:counter.keySet()){
			if(max<counter.get(st)){
				max=counter.get(st);
				min=st;
			}else if(max==counter.get(st)){
				if(st.compareTo(min)<0){
					min=st;
				}
			}
		}
		System.out.println(min);
	}

}
