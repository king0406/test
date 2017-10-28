package Security;

import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
public class testAES {

	public static final String KEY_ALGORITHM="AES";
	
	public static final String CIPHER_ALGORITHM="AES/ECB/PKCS5Padding";
	
	private static Key toKey(byte[] key) throws Exception{
		SecretKey sk=new SecretKeySpec(key, KEY_ALGORITHM);
		return sk;
	}
	
	public static byte[] decrypt(byte[] data, byte[] key) throws Exception{
		Key k=toKey(key);
		Cipher cp=Cipher.getInstance(CIPHER_ALGORITHM);
		cp.init(Cipher.DECRYPT_MODE, k);
		return cp.doFinal(data);
	}
	
	public static byte[] encrypt(byte[] data, byte[] key) throws Exception{
		Key k=toKey(key);
		Cipher cp=Cipher.getInstance(CIPHER_ALGORITHM);
		cp.init(Cipher.ENCRYPT_MODE, k);
		return cp.doFinal(data);
	}
	
	public static byte[] initKey() throws Exception{
		KeyGenerator kg=KeyGenerator.getInstance(KEY_ALGORITHM);
		kg.init(128);
		SecretKey sk=kg.generateKey();
		return sk.getEncoded();
	}
	public static byte[] initKey(String password) throws Exception{
		KeyGenerator kg=KeyGenerator.getInstance(KEY_ALGORITHM);
		kg.init(128, new SecureRandom(password.getBytes()));
		SecretKey sk=kg.generateKey();
		return sk.getEncoded();
	}
	/**将二进制转换成16进制 
	 * @param buf 
	 * @return 
	 */  
	public static String ByteToHex(byte buf[]) {  
	        StringBuffer sb = new StringBuffer();  
	        for (int i = 0; i < buf.length; i++) {  
	                String hex = Integer.toHexString(buf[i] & 0xFF);  
	                if (hex.length() == 1) {  
	                        hex = '0' + hex;  
	                }  
	                sb.append(hex.toUpperCase());  
	        }  
	        return sb.toString();  
	}  
	
	public final void test(String content) throws Exception{
		byte[] inputData=content.getBytes();
		System.out.println("原文：\t"+content);
		byte[] key=testAES.initKey();
		System.out.println("密钥：\t"+ByteToHex(key));
		inputData=testAES.encrypt(inputData, key);
		System.out.println("加密后：\t"+ByteToHex(inputData));
		byte[] outputData=testAES.decrypt(inputData, key);
		System.out.println("解密后：\t"+new String(outputData));
	}
	public final void test(byte[] content) throws Exception{
		System.out.println("原文：\t"+content);
		byte[] key=testAES.initKey();
		System.out.println("密钥：\t"+ByteToHex(key));
		content=testAES.encrypt(content, key);
		System.out.println("加密后：\t"+ByteToHex(content));
		byte[] outputData=testAES.decrypt(content, key);
		System.out.println("解密后：\t"+outputData);
	}

	public static void main(String[] args) {
		try {
			testAES aes=new testAES();
			aes.test(testMD5.encodeMD5("测试 "));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
