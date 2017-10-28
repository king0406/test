package test;

public class jvm8_6 {

	static abstract class a{}
	static class b extends a{}
	public void  c(a aa){
		System.out.println("a");
	}
	public void c(b bb){
		System.out.println("b");
	}
	public static void main(String[] args) {

		a ab=new b();
		jvm8_6 j=new jvm8_6();
		j.c(ab);//out:a
		j.c(ab);
	}

}
