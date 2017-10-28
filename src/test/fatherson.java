package test;
class Person {
    protected String  name = "No name";
    public void te(int a){
    	int a1=a+2;
    	System.out.println(a1);
    }
    public Person(String i){
    	System.out.println("fa");
    }
}
class Employee extends Person {
    String empID = "0000";
    public  void te(int a,int b){
    	int a1=a+1;
    	System.out.println(a1);
    };
    public void te(int a){
    	int a1=a+3;
    	System.out.println(a1);
    };
    public Employee(String id) {
    	super(id);
        empID = id;
        System.out.println("son");
    }
}
public class fatherson {

	public static void main(String[] args) {
		Employee e = new Employee("123");
        Person p=new Person("");
        p.te(0);
        e.te(0, 1);
        e.name="";
        new fatherson().a();
	}
	public void a(){
		System.out.println("a");
	}

}
