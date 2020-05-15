class A{
	public void doA() {
		System.out.println("A.doA");
	}
}
class B extends A{
	@Override
	public void doA() {
		super.doA(); // ���� �Լ��� �ڱ��ڽ� ���
		System.out.println("B.doA");
	}
}
public class Ex01 {
	Ex01(){
		B b = new B();
		b.doA();
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
