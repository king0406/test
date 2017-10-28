package hdu;

import java.util.Scanner;

public class Main0812 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int f = sc.nextInt();
		int d = sc.nextInt();
		int p = sc.nextInt();
		if(d<=f*x){
			System.out.println(d/x);
		}else{
			System.out.println((d-f*x)/(x+p)+f);
		}
	}

}
