package hdu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class liaoli {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Set<String> set=new HashSet<>();
		String[] temp;
		while(in.hasNextLine()){
			String line=in.nextLine();
			temp=line.split(" ");
			for(int i=0;i<temp.length;i++){
				set.add(temp[i]);
			}
		}
		System.out.print(set.size());
	}

}
