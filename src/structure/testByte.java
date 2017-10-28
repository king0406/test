package structure;

public class testByte {

	public static void main(String[] args) {
		byte a1=1,a2=3,a3,a4;
		final byte a5=2,a6=4,a7;
		int a8;
		final int a9;
		a3=(byte) (a1+a2);
		a8=a1+a2;
		a7=(byte) (a1+a2);
		//a7=a5+a6;
		//The final local variable a7 may already have been assigned
		a9=a1+a2;
		a4=a5+a6; 
		a4=(byte) (a1+a5);
	}

}
