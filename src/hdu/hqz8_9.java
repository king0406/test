package hdu;

public class hqz8_9 {

	public static void main(String[] args) {
		hqz8_9 hh=new hqz8_9();
	}
	
	hqz8_9(){
		String hqz="00100";
		hqz(hqz,1);
		System.out.print(hqz(hqz,1));
	}
	
	public String hqz(String hqz,int i){
		char[] h=hqz.toCharArray();
		h[i]='1';
		String s=new String(h);
		return s;
	}

}
