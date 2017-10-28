package hdu;

import java.util.Scanner;

public class anheizifuchuan {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		System.out.print(3*fun(a));
	}
	static int fun(int i){
		if(i==1){
			return 1;
		}else if(i==2){
			return 3;
		}else if(i==3){
			return 7;
		}else
		return fun(i-2)*5+fun(i-3)*2;
	}

}
