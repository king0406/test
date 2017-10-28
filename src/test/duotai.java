package test;
class Grandfather{
	static {
		System.out.println("0");
	}
	{
		System.out.println("1");
	}
	Grandfather(){
		System.out.println("2");
	}
}
class father extends Grandfather{
	int b=1;
	public void a(){
		System.out.println("3");
	}
	static {
		System.out.println("4");
	}
	{
		System.out.println("5");
	}
	father(){
		System.out.println("6");
	}
	{
		System.out.println("7");
	}
	father(String str){
		System.out.println(8+str);
	}
}
public class duotai extends father{
	public void a(){
		System.out.println("9");
	}
	public final void c(){
		System.out.println("final");
	}
	public void c(int a){
		System.out.println("no final");
	}
	static {
		System.out.println("10");
	}
	{
		System.out.println("11");
	}
	public static void main(String[] args) {
		father f=new duotai(2);
		f.a();
		f.b=3;
		System.out.println(f.b);
		father ff=new father();
		ff.a();
	}
	duotai(){
		super("12");
		System.out.println("13");
	}
	duotai(int i){
		this();
		System.out.println("14");;
		//this();
		//super();
	}
}
