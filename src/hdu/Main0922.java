package hdu;

import java.util.Scanner;

public class Main0922 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long target=sc.nextLong();
		int a=sc.nextInt();
		int b=sc.nextInt();
		long[][] array=new long[a][b];
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				array[i][j]=sc.nextLong();
			}
		}
		String[] str=Find(target,array,a,b).split(",");
		System.out.println(str[0]+" "+str[1]);
	}
	public static String Find(long target, long [][] array,int a,int b) {
        int c=a/2;
        int i=0;
        while(c>=0&&c<=a-1&&target<array[c][i]) c--;
        while(i<=b-1&&i>=0&&target>array[c][i]) i++;
        if(target==array[c][i]) return c+","+i;
        else return "-1,-1";
    }
}
