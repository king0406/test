package hdu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import structure.zzbds;

public class Main09142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		String[] inputarray=input.split(",");
		int n=Integer.parseInt(inputarray[0]);
		try {
			Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(inputarray[1]);
			Date date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(inputarray[2]);
			if(n<3){
				System.out.println("incorrect data");
			}else{
				if(!isDate(inputarray[1])||!isDate(inputarray[2])){
					System.out.println("incorrect data");
				}else{
					int time=(int)(date2.getTime()-date1.getTime())/(1000*60);
					int sum=n*15;
					System.out.print(time/sum+1+";");
					int rest=time%sum/5;
					int temp=(rest+4)/3;;
					if((rest+4)%3==0){
						if(temp<=3)
							System.out.print(temp+"-"+temp);
						else System.out.print(1+"-"+1);
					}else{
						if(temp<=2)
							System.out.print(temp+"-"+(temp+1));
						else System.out.print(3+"-"+1);
					}
				}
			}
		} catch (ParseException e) {
			System.out.println("incorrect data");
		} 
	}
	
	public static boolean isDate(String date)    
    {    
        /**  
         * 判断日期格式和范围  
         */    
        String rexp = "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";    
            
        Pattern pat = Pattern.compile(rexp);      
            
        Matcher mat = pat.matcher(date);      
            
        boolean dateType = mat.matches();    

        return dateType;    
    } 

}
