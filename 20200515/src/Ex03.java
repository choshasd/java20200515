/*
 new StrawberryCake �����ϸ� doA doB doC �Լ� ȣ���� ����
 new ChocoCake       �����ϸ� doA doB �Լ� ȣ���� ����
 new Cake               �����ϸ� doA �Լ� ȣ���� ����
 
 ��� �ڽ� Ŭ������ �θ� Ŭ���� ���¿� ���� �� �ִ�.
 �θ�Ŭ���� ���¸� ������� ȣ���� �� �ִ� �Լ��� ��������.
 
 �θ�Ŭ������ �ڽ�Ŭ������ ���¸� ���� �� ����(������ ����ȯ�� ���ؼ� ��´�)
 * */

class Cake extends Object{
	public void doA() {
		System.out.println("Cake.doA()�޼���");
	}
}
class	ChocoCake extends Cake{
	public void doB() {
		System.out.println("Cake.doB()�޼���");
	}
}
class StrawberryCake extends ChocoCake{
	public void doC() {
		System.out.println("Cake.doC()�޼���");
	}
}
public class Ex03 {
	Ex03(){
		Cake ck1 = new Cake();
		Cake ck2 = new ChocoCake();
		Cake ck3 = new StrawberryCake();
		ChocoCake cc = new ChocoCake();
		StrawberryCake sc = new StrawberryCake();
		
		ck3.doA();// ��� St..Cake()�ȿ� B C�� ȣ�� ����
					// �Ⱦ��°� ����
		sc.doA();
		sc.doB();
		sc.doC();
		/*
		try {
			Cake ck4 = new Cake();
			if(ck4 instanceof StrawberryCake) {
				System.out.println("�ٲܼ� �ִ�");
			}
			else {
				System.out.println("�ٲܼ� ����");
			}
		}catch (Exception e) {
			
		}
		*/
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
