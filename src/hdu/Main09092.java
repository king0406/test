package hdu;

import java.util.Scanner;

public class Main09092 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		String[] sp = str.split(" ");
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (sp[i].equals("1")) {
				sum += 1;
			}
			sum <<= 1;
		}
		sum >>= 1;
		if ((sum & 1) == 1) {
			System.out.println("Alice");
		}else {
			System.out.println("Bob");
		}
	}
}

