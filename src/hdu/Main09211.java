package hdu;

import java.util.*;
public class Main09211{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in 

);
        String s = scan.nextLine();
        System.out.println(ReverseSentence(s));
    }

    public static String ReverseSentence(String str) {
      if(str.trim().equals("")){
            return str;
      }
        String[] a = str.split(" ");
        StringBuilder o = new StringBuilder();
        int i;
        for (i = a.length; i >0;i--){
            String eachS = a[i-1];
            String resultS = "";
            for(int j=eachS.length()-1;j>=0;j--){
                char c = eachS.charAt(j);
                if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
                    String s1 = eachS.substring(j+1,eachS.length());
                    String s2 = eachS.substring(0,j+1);
                    resultS = s1+s2;
                    break;
                }
            }
            o.append(resultS);
            if(i > 1){
                o.append(" ");
            }
        }
        return o.toString();
    }


}

