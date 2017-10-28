package hdu;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
        	if(i%2==0){
        		if(m%i!=0){
        			int a=m%i;
        			if(i/a==2){
        				int b=m/i;
        				int c=b-i/2+1;
        				System.out.print(c);
        				for(int j=1;j<i;j++)System.out.print(" "+(c+j));
        			}
        		}
        	}else{
        		
        	}
        }
	}
}
