package hdu;

import java.util.Scanner;

public class Main7252 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		char c[]=n.toCharArray();
		boolean b[]=new boolean[n.length()];
		int temp=0,l=n.length();
		for(int i=0;i<l;i++) b[i]=false;
		for(int i=0;i<l;i++){
			if(!b[i]){
				n=n.substring(1);
				int a=n.indexOf(""+c[i]);
				if(a!=-1&&!b[a]){
					b[a]=true;
				}else {
					temp++;
					continue;
				}
			}
		}
		System.out.println(temp);

	}

}
