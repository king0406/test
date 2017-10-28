package hdu;

import java.util.Scanner;

public class Main6163 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		float a=1;
		for(int b=n;0<k;) 
			a=a*(b--)/(k--);
		System.out.println((int)Math.floor(a/n));
	}

}
