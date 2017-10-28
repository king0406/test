package hdu;

import java.util.Scanner;

public class Main7251 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		char c[]=n.toCharArray();
		int temp=0,k=c.length-2;
		for(int i=k/2,j=0;i<k;){
			if(c[i]==c[j]){
				j++;
				i++;
				temp++;
			}else{
				k-=2;
				i=k/2;
				temp=j=0;
			}
		}
		System.out.println(2*temp);

	}

}
