package structure;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zzbds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public static boolean isDate(String date)    
     {    
         /**  
          * �ж����ڸ�ʽ�ͷ�Χ  
          */    
         String rexp = "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";    
             
         Pattern pat = Pattern.compile(rexp);      
             
         Matcher mat = pat.matcher(date);      
             
         boolean dateType = mat.matches();    
 
         return dateType;    
     } 
}
