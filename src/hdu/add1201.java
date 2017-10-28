package hdu;

public class add1201 {

	public static void main(String[] args) {
		add1201 a=new add1201();
		int i=0;
		int c=0;
		a.add(i);
		System.out.println(i);
		i=i++;
		int b=i;
		System.out.println(i);
		System.out.println(c);
	}
	void add(int i){
		++i;
	}

}
