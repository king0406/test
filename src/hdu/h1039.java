package hdu;

import java.util.Scanner;

public class h1039 {
// �ҵ�˼·���ַ��������ַ����飬������ÿ��λ��ģ����벻ͬ�ַ���ͬʱ����һ��������ͬ��boolean����,��ʼfalse��������λ�õ���ͬ�ַ���boolean������ֵ��Ϊtrue
	//һ�ֱ������falseֵ���ַ�ƴ�ӳ��µ��ַ����飬��������.�ݹ�
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
		for(int i=0;i<ch.length;i++){//i�����
			boolean[] ar=new boolean[ch.length];
			int t=0;
			for(int j=0;j<ch.length;j++){//j����
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
