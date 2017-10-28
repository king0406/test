package hdu;

import java.util.Scanner;

public class h1039 {
// 我的思路：字符串换成字符数组，对数组每个位置模拟插入不同字符，同时创建一个长度相同的boolean数组,起始false，对相邻位置的相同字符的boolean数组中值设为true
	//一轮遍历后对false值的字符拼接成新的字符数组，继续进行.递归
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String str;
		char[] ch;
		for(;0<n;n--){
			str=in.next();
			ch=str.toCharArray();
			System.out.println(clear(ch));
		}
	}
	
	public static int clear(char[] ch){
		int temp=2;
		for(int i=0;i<ch.length;i++){//i插入点
			boolean[] ar=new boolean[ch.length];
			int t=0;
			for(int j=0;j<ch.length;j++){//j遍历
				ar[j]=false;
				for(int k=1;k<=j;k++){
					if(ch[j]==ch[j-k]){
						if(ar[j-k]==true) {
							if(k==1) {
								t++;
								ar[j]=true;
								break;
							}
						}
						else{
							if(((j<ch.length-1)&&ch[j]!=ch[j+1])||j==ch.length-1||k==1) {
								t+=2;
								ar[j-k]=true;
								ar[j]=true;
							}
							break;
						}
					}
					if(ar[j-k]==false) break;
				}
				if(i==j){
					if(ar[j]==false){ 
						t+=2;
						ar[j]=true;
					}
					else t++;
				}
			}
			//System.out.println(i+","+t);
			if(t>temp) temp=t;
		}
		return temp;
	}

}
