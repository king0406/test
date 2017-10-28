package testThread;

//����������ʼ���÷��䴴������ʵ������������˽�л�������Ϊ�����Ը�ֵ���������乫���ķ�����֤�������Ƿ񱻸�����ֵ��
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class testReflect {
	public static void main(String[] args) {
		// �������ʵ��
		java.lang.Class c = null;
		Customer customer = null;
		try {
			c = Customer.class;
			Method m1 = c.getDeclaredMethod("getInstance");
			m1.setAccessible(true);// ���������Ҫ��������Ϊtrue�����޷���ȡ˽�з���
			customer = (Customer) m1.invoke(c);
		} catch (Exception e) {
		}

		try {
			java.lang.reflect.Field fieldId = customer.getClass()
					.getDeclaredField("id");// ��ȡ˽�г�Ա����id

			// ��ȡ˽�з���setId(int id)
			String firstLetter = fieldId.getName().substring(0, 1)
					.toUpperCase();
			String setName = "set" + firstLetter
					+ fieldId.getName().substring(1);
			String getName = "get" + firstLetter
					+ fieldId.getName().substring(1);
			java.lang.reflect.Method setMethod = customer.getClass()
					.getDeclaredMethod(setName,
							new Class[] { fieldId.getType() });
			Method getMethod = customer.getClass().getDeclaredMethod(getName,
					new Class[] {});
			setMethod.setAccessible(true);// ʹ˽�з������Ա���ȡ��
			setMethod.invoke(customer, new Object[] { 23 });// ���ø�˽�з�������������

			System.out
					.println("-------------ͨ������������ȡ����idֵ��" + customer.getId());
			System.out.println("-------------ͨ�������ȡ����idֵ��"
					+ getMethod.invoke(customer, null));

			// ���潫ģ���������һ�δ��룬ͨ���������ֱ�Ϊname��age������˽�г�Ա������ֵ
			Field fieldName = customer.getClass().getDeclaredField("name");
			firstLetter = fieldName.getName().substring(0, 1).toUpperCase();
			setName = "set" + firstLetter + fieldName.getName().substring(1);
			setMethod = customer.getClass().getDeclaredMethod(setName,
					new Class[] { fieldName.getType() });
			setMethod.setAccessible(true);
			setMethod.invoke(customer, "����");
			System.out.println("-----------------������" + customer.getName());

			Field fieldAge = customer.getClass().getDeclaredField("age");
			firstLetter = fieldAge.getName().substring(0, 1).toUpperCase();
			setName = "set" + firstLetter + fieldAge.getName().substring(1);
			setMethod = customer.getClass().getDeclaredMethod(setName,
					new Class[] { fieldAge.getType() });
			setMethod.setAccessible(true);
			setMethod.invoke(customer, "40");
			System.out.println("-----------------���䣺" + customer.getAge());
		} catch (Exception e) {
		}
	}
}