package hdu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main09141 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Long> arr=new ArrayList<Long>();
		ArrayList<Long> arr2=new ArrayList<Long>();
		HashSet<String> hs=new HashSet<String>();
		long temp=0;
		for(int i=0;i<n;i++){
			temp=sc.nextLong();
			if(temp%7==0) arr2.add(temp);
			else arr.add(temp);
		}
		for(int i=0;i<arr2.size();i++){
			for(int j=i+1;j<arr2.size();j++){
				String str1=""+arr2.get(i)+arr2.get(j);
				hs.add(str1);
				str1=""+arr2.get(j)+arr2.get(i);
				hs.add(str1);
			}
		}
		int sum=hs.size();
		//int sum=seven*(seven-1);
		for(int i=0;i<arr.size();i++){
			for(int j=i+1;j<arr.size();j++){
				String str1=""+arr.get(i)+arr.get(j);
				long num1=Long.parseLong(str1);
				if(num1%7==0) sum++;
				str1=""+arr.get(j)+arr.get(i);
				num1=Long.parseLong(str1);
				if(num1%7==0) sum++;
			}
		}
		System.out.println(sum);
	}

}
