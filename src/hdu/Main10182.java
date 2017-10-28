package hdu;

import java.util.Scanner;

public class Main10182 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		String result = multiply(str1, str2);
		System.out.println(result);
	}

	 public static String multiply(String str1, String str2){
		 String result = null;// 存放结果字符串

	        // 确定负号
	        int flagStr1 = 0;
	        if (str1.startsWith("-")) {
	            flagStr1++;
	        }
	        int flagStr2 = 0;
	        if (str2.startsWith("-")) {
	            flagStr2++;
	        }
	        // *********************************************************************

	        // 将数字放到整数数组，逆序，字符串尾部对齐
	        int[] arrStr1 = new int[str1.length() - flagStr1];
	        for (int i = 0; i < arrStr1.length; i++) {
	            arrStr1[i] = str1.charAt(str1.length() - 1 - i) - '0';
	        }
	        int[] arrStr2 = new int[str2.length() - flagStr2];
	        for (int i = 0; i < arrStr2.length; i++) {
	            arrStr2[i] = str2.charAt(str2.length() - 1 - i) - '0';
	        }
	        // ***********************************************************************

	        // 运算开始，arrStr2的每位去乘arrStr1的每位
	        StringBuffer subResult = new StringBuffer();// 中间结果
	        for (int i = 0; i < arrStr2.length; i++) {
	            StringBuffer midResult = new StringBuffer();// 每位结果
	            int subBenWei = 0;// 每位相乘时的本位上数字
	            int subJinWei = 0;// 每位相乘时的进位上数字
	            for (int k = 0; k < i; k++) {
	                midResult.append(0);// 先添加0，确保每位末尾对齐，便于加法运算
	            }
	            for (int j = 0; j < arrStr1.length; j++) {
	                subBenWei = (arrStr2[i] * arrStr1[j] + subJinWei) % 10;
	                subJinWei = (arrStr2[i] * arrStr1[j] + subJinWei) / 10;
	                midResult.append(subBenWei);
	                if ((j == arrStr1.length - 1) && subJinWei > 0) {
	                    midResult.append(subJinWei);// 如果最前面位相乘有进位，结果添加进位数字
	                }
	            }
	            if (0 == i) {
	                subResult = midResult;// 第一位，子结果存放第一位结果
	            } else {
	                // 各位对齐，确保中间结果和每位结果位数相同，便于相加运算
	                if (midResult.length() > subResult.length()) {
	                    int diff = midResult.length() - subResult.length();
	                    while (diff > 0) {
	                        subResult.append(0);
	                        diff--;
	                    }
	                } else {
	                    int diff = subResult.length() - midResult.length();
	                    while (diff > 0) {
	                        midResult.append(0);
	                        diff--;
	                    }
	                }
	                // *********************************************************
	                // 相加运算，结果放到subResult中
	                int benWei = 0;
	                int jinWei = 0;
	                for (int j = 0; j < subResult.length(); j++) {

	                    benWei = ((subResult.charAt(j) - '0')
	                            + (midResult.charAt(j) - '0') + jinWei) % 10;
	                    jinWei = ((subResult.charAt(j) - '0')
	                            + (midResult.charAt(j) - '0') + jinWei) / 10;
	                    subResult.setCharAt(j, (char) (benWei + '0'));
	                }
	                // 如果最后相加任有进位，结果中添加进位
	                if (jinWei > 0) {
	                    subResult.append(jinWei);
	                }
	                // ***********************************************************
	            }
	        }
	        // 判断“-”的个数，没有或有两个则为结果为正，不考虑，如只有一个则结果要添加“-”
	        if (1 == (flagStr1 + flagStr2)) {
	            subResult.append('-');
	        }
	        result = subResult.reverse().toString();// 最终子结果逆序，即为结果
	        return result;
	    }
}
