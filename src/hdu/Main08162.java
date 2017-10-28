package hdu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main08162 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();  
		boolean con=false;
		while(sc.hasNext()){
			String str=sc.nextLine();
			str=str.replace(" ", "");
			str=str.replace("{", "");
			if(str.charAt(str.length()-1)==('}')) 
				con=true;
			str=str.replace("}", "");
			String [] arr= str.split(",");
			for(int i=0;i<arr.length;i++){
				if(!",".equals(arr[i]))
					list.add(arr[i]);
			}
			if(con) break;
		} 
		String temp; boolean c=false;
		boolean[] b=new boolean[list.size()];
		for(int i=1;i<list.size();i+=2){
			for(int q=i,j=i-1;q<list.size();q+=2){
				temp= list.get(j);
				if(q==list.size()-1||!list.get(q).equals(list.get(q+1))){
					if(c&&(temp.equals(list.get(q)))){
							for(int k=j;k<=q;k++) b[k]=true;
					}
					j=q+1;
					c=false;
				}else{
					if(temp.equals(list.get(q))){
						for(int k=j;k<=q;k++) b[k]=true;
						j=q+1;
						c=false;
					}
					else c=true;
				}
			}
		}
		for(int i=0;i<list.size();i++){
			if(i==list.size()-1||!list.get(i).equals(list.get(i+1)))
			System.out.println("{"+list.get(i)+", "+b[i]+"}");
		}
		
	}

}
