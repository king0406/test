package Security;

import java.security.MessageDigest;

public class testMD5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] data={0,9,8,7,6,5,4,3,2,1};
		String str="≤‚ ‘";
		try {
			System.out.println(testAES.ByteToHex(encodeMD5(str)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static byte[] encodeMD5(byte[] data) throws Exception{
		MessageDigest md=MessageDigest.getInstance("MD5");
		return md.digest(data);
	}
	public static byte[] encodeMD5(String str) throws Exception{
		MessageDigest md=MessageDigest.getInstance("MD5");
		return md.digest(str.getBytes("GBK"));
	}
}
