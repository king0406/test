package testJVM;

public class TestAnonymousClass {
	public static void main(String args[]) {
		TestAnonymousClass testAnonymousClass = new TestAnonymousClass();
		testAnonymousClass.show();
	}

	// ����������й�����һ�������ڲ���
	private void show() {
		Out anony = new Out() { // ��ȡ�����ڲ���ʵ��
			void show() { // ��д����ķ���
				System.out.println("this is Anonymous InterClass showing.");
			}
		};
		anony.show();// �����䷽��
	}
}

// ������Out�������ڲ���ͨ����д�䷽����������ʵ��
class Out {
	void show() {
		System.out.println("this is Out showing.");
	}
}
