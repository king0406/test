package hdu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main09181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String[] arr1=str1.split(" ");
		String[] arr2=str1.split(" ");
		Map<String,Integer> vote=new HashMap<String,Integer>();
		Map<String,Integer> weight=new HashMap<String,Integer>();
		for(int i=0;i<arr1.length;i++){
			if(vote.containsKey(arr1[i])){
				vote.put(arr1[i], vote.get(arr1[i])+1);
				weight.put(arr1[i], weight.get(arr1[i])+Integer.parseInt(arr2[i]));
			}else{
				vote.put(arr1[i], 1);
				weight.put(arr1[i], Integer.parseInt(arr2[i]));
			}
		}
		int max=0,temp=0;
		String vic="";
		for(String str:weight.keySet()){
			if(max<weight.get(str)){
				max=weight.get(str);
				temp=vote.get(str);
				vic=str;
			}else if(max==weight.get(str)){
				if(vote.get(str)>temp){
					temp=vote.get(str);
					vic=str;
				}
			}
		}
		System.out.println(vic);
	}

}
