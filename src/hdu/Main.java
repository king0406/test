package hdu;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();int i=3,j=0,m=n;
	        boolean prime[]=new boolean[n];
	        for(int k=0;k<n;k++) prime[k]=true;
	        for(;m%2==0;j++){
	        	m/=2;
	        }
	        if(m==1&&j>1){
	    		System.out.println(2+" "+j);
	    	}else{
		        for(; i <= Math.sqrt(n); i+=2){
		        	if(prime[i]) for(int k=i+1;k<n;k+=i) prime[k]=false;
		        	for(j=0;n%i==0;j++){
		        		n=n/i;
		        	}
		        	if(n==1&&j>1){
		        		System.out.println(i+" "+j);
		        		break;
		        	}
		        } 
		    	if(n!=1||j<=1){
		    		System.out.println("No");
		    	}
	    	}
        }
	}
}
