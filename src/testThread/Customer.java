package testThread;

public class Customer {
    private long id;
    private String name;
    private String age;
    
    private static Customer instance = null;
    /** ��ʾ�����캯������Ϊ˽�У�����޷�ͨ��new��ʵ�������� */
    private Customer(){}
    private static synchronized Customer getInstance(){
        if(instance == null){
            return new Customer();
        }
        return instance;
    }
    
    /** ��set()����Ϊ˽�з���������޷�ֱ��Ϊid���Ը�ֵ */
    private void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }
    /** ��set()����Ϊ˽�з���������޷�ֱ��Ϊname���Ը�ֵ */
    private void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    /** ��set()����Ϊ˽�з���������޷�ֱ��Ϊage���Ը�ֵ */
    private void setAge(String age) {
        this.age = age;
    }
    public String getAge() {
        return age;
    }
}
