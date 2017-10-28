package hdu;

import java.util.Scanner;

public class Main08161 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try{
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			String s1=n1+"";
			String s2=n2+"";
			if(s1.length()!=s2.length()) System.out.println("-1");
			else{
				boolean con=false;
				int num=1;
				int max=0;
				for(int i=0;i<s1.length();i++){
					if(s1.charAt(i)==s2.charAt(i)){
						if(con) {
							num++;
							if(num>max) max=num;
						}
						con=true;
					}else{
						con=false;
						num=1;
					}
				}
				System.out.println(max);
			}
		}catch(Exception e){
			System.out.println("-1");
		}
	}

}
