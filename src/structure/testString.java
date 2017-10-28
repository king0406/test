package structure;

public class testString implements CharSequence{
	private final char value[];
	public static void main(String[] args) {
		String s1="abc";
		char c1[]=s1.toCharArray();
		String s2="ab"+"c";
		s1=s2+"d";
		String s3=new String("abc").intern();
		String s4="a"+new String("bc");
		System.out.println(s4.equals(s2));
		System.out.println(s3==s2);
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		StringBuffer sb1=new StringBuffer("abc");
		StringBuilder sb2=new StringBuilder("abc");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb2.equals(s1));
		String s5=new String("×Ö·û´®²âÊÔ");
		System.out.println(s5.intern()==s5);
		s1="1234567890";
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(1, 5));
	}
	testString(){
		this.value=new char[0];
	}
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return value[index];
	}
	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

}
