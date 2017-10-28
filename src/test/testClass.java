package test;
class qwer{
	int i=0;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	qwer(int i){
		this.i=i;
	}
}
public class testClass {

	public static void main(String[] args) {
		qwer q=new qwer(1);
		qwer w=q;
		System.out.println(q.i);
		w.setI(2);
		System.out.println(q.i);
	}

}
