package hdu;

import java.util.Scanner;

public class Main08163 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int start=0;
		int i;
		char c[]=str.toCharArray();
		while((i=str.indexOf('@', start))!=-1){
			if(i-start<3){
				start=i+1;
				continue;
			}
			c[i-1]='*';
			c[i-2]='*';
			c[i-3]='*';
			start=str.indexOf('.', i+1)+1;
		}
		System.out.println(new String(c));
	}

}
