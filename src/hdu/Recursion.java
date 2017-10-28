package hdu;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion i=new Recursion();
	}
	
	public Recursion() {
		// TODO Auto-generated constructor stub
		System.out.println(function(3));
	}
	
	public int function(int n){
		if(n<3){
			return 1;
		}else{
			return function(n-1)+function(n-2);
		}
	}
}
