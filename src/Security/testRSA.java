package Security;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;

public class testRSA {

	public static final String KEY_ALGORITHM="RSA";
	
	private static final String PUBLIC_KEY="RSAPublicKey";
	
	private static final String PRIVATE_KEY="RSAPrivateKey";
	
	private static final int KEY_SIZE=512;
	
	private static byte[] publicKey;
	
	private static byte[] privateKey;
	
	private static Map<String, Object> initKey() throws Exception{
		KeyPairGenerator keyPairGen=KeyPairGenerator.getInstance(KEY_ALGORITHM);
		keyPairGen.initialize(KEY_SIZE);
		KeyPair keypair=keyPairGen.generateKeyPair();
		RSAPublicKey pubkey=(RSAPublicKey)keypair.getPublic();
		RSAPrivateKey prikey=(RSAPrivateKey)keypair.getPrivate();
		Map<String,Object> keymap=new HashMap<String,Object>(2);
		keymap.put(PUBLIC_KEY, pubkey);
		keymap.put(PRIVATE_KEY, prikey);
		return keymap;
	}
	
	 static {
		Map<String, Object> keyMap;
		try {
			keyMap = initKey();
		if(publicKey==null||privateKey==null){
			publicKey=((Key) keyMap.get(PUBLIC_KEY)).getEncoded();
			privateKey=((Key) keyMap.get(PRIVATE_KEY)).getEncoded();
		}
		System.out.println("¹«Ô¿:\n"+testAES.ByteToHex(publicKey));
		System.out.println("Ë½Ô¿:\n"+testAES.ByteToHex(privateKey));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		testRSA rsa=new testRSA();
		try {
			rsa.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void test() throws Exception{
		System.out.println("¹«Ô¿:\n"+testAES.ByteToHex(publicKey));
	}
}
