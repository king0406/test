package hdu;

import java.util.Scanner;

public class Main6162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double exc=Math.pow(2, 2-n);
		for(int i=3;i<=n+1;i++){
			exc+=i*Math.pow(2, 2-i);
		}
		System.out.println((double)Math.round(exc*10)/10);
	}

}
