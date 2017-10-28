package jsoffer;
import java.util.ArrayList;
public class jsoffer_6 {

	public int minNumberInRotateArray(int [] array) {
		if(array==null||array.length==0) return 0;
		int temp=array[0];
		int a=0,b=array.length-1;
		for(int i=array.length/2;b>=a;){
			if(array[i]<temp) {
				temp=array[i];
				b=i-1;
			}else{
				a=i+1;
			}
			i=(a+b)/2;
		}
		return temp;
    }
}
//for(int i=1;i<array.length;i++){
//	if(array[i]<temp) temp=array[i];
//}