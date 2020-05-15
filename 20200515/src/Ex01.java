class A{
	public void doA() {
		System.out.println("A.doA");
	}
}
class B extends A{
	@Override
	public void doA() {
		super.doA(); // 위에 함수랑 자기자신 출력
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
