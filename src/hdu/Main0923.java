package hdu;

import java.util.Scanner;

public class Main0923 {

	public static void main(String[] args) {

		final int days[]={0,31,59,90,120,151,181,212,243,273,304,334,365};
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int year=sc.nextInt();
			int month=sc.nextInt();
			int day=sc.nextInt();
			int num=days[month-1]+day;
			if((year%100==0&&year%400==0)||(year%100!=0&&year%4==0)){
				if(month>2){
					num++;
				}
			}
			System.out.println(num);
		}
	}

}
