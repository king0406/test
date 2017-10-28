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
		 String result = null;// ��Ž���ַ���

	        // ȷ������
	        int flagStr1 = 0;
	        if (str1.startsWith("-")) {
	            flagStr1++;
	        }
	        int flagStr2 = 0;
	        if (str2.startsWith("-")) {
	            flagStr2++;
	        }
	        // *********************************************************************

	        // �����ַŵ��������飬�����ַ���β������
	        int[] arrStr1 = new int[str1.length() - flagStr1];
	        for (int i = 0; i < arrStr1.length; i++) {
	            arrStr1[i] = str1.charAt(str1.length() - 1 - i) - '0';
	        }
	        int[] arrStr2 = new int[str2.length() - flagStr2];
	        for (int i = 0; i < arrStr2.length; i++) {
	            arrStr2[i] = str2.charAt(str2.length() - 1 - i) - '0';
	        }
	        // ***********************************************************************

	        // ���㿪ʼ��arrStr2��ÿλȥ��arrStr1��ÿλ
	        StringBuffer subResult = new StringBuffer();// �м���
	        for (int i = 0; i < arrStr2.length; i++) {
	            StringBuffer midResult = new StringBuffer();// ÿλ���
	            int subBenWei = 0;// ÿλ���ʱ�ı�λ������
	            int subJinWei = 0;// ÿλ���ʱ�Ľ�λ������
	            for (int k = 0; k < i; k++) {
	                midResult.append(0);// �����0��ȷ��ÿλĩβ���룬���ڼӷ�����
	            }
	            for (int j = 0; j < arrStr1.length; j++) {
	                subBenWei = (arrStr2[i] * arrStr1[j] + subJinWei) % 10;
	                subJinWei = (arrStr2[i] * arrStr1[j] + subJinWei) / 10;
	                midResult.append(subBenWei);
	                if ((j == arrStr1.length - 1) && subJinWei > 0) {
	                    midResult.append(subJinWei);// �����ǰ��λ����н�λ�������ӽ�λ����
	                }
	            }
	            if (0 == i) {
	                subResult = midResult;// ��һλ���ӽ����ŵ�һλ���
	            } else {
	                // ��λ���룬ȷ���м�����ÿλ���λ����ͬ�������������
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
	                // ������㣬����ŵ�subResult��
	                int benWei = 0;
	                int jinWei = 0;
	                for (int j = 0; j < subResult.length(); j++) {

	                    benWei = ((subResult.charAt(j) - '0')
	                            + (midResult.charAt(j) - '0') + jinWei) % 10;
	                    jinWei = ((subResult.charAt(j) - '0')
	                            + (midResult.charAt(j) - '0') + jinWei) / 10;
	                    subResult.setCharAt(j, (char) (benWei + '0'));
	                }
	                // ������������н�λ���������ӽ�λ
	                if (jinWei > 0) {
	                    subResult.append(jinWei);
	                }
	                // ***********************************************************
	            }
	        }
	        // �жϡ�-���ĸ�����û�л���������Ϊ���Ϊ���������ǣ���ֻ��һ������Ҫ��ӡ�-��
	        if (1 == (flagStr1 + flagStr2)) {
	            subResult.append('-');
	        }
	        result = subResult.reverse().toString();// �����ӽ�����򣬼�Ϊ���
	        return result;
	    }
}
