/*
 new StrawberryCake 생성하면 doA doB doC 함수 호출이 가능
 new ChocoCake       생성하면 doA doB 함수 호출이 가능
 new Cake               생성하면 doA 함수 호출이 가능
 
 모든 자식 클래스는 부모 클래스 형태에 담을 수 있다.
 부모클래스 형태를 기반으로 호출할 수 있는 함수가 정해진다.
 
 부모클래스는 자식클래스에 형태를 담을 수 없다(하지만 형변환을 통해서 담는다)
 * */

class Cake extends Object{
	public void doA() {
		System.out.println("Cake.doA()메서드");
	}
}
class	ChocoCake extends Cake{
	public void doB() {
		System.out.println("Cake.doB()메서드");
	}
}
class StrawberryCake extends ChocoCake{
	public void doC() {
		System.out.println("Cake.doC()메서드");
	}
}
public class Ex03 {
	Ex03(){
		Cake ck1 = new Cake();
		Cake ck2 = new ChocoCake();
		Cake ck3 = new StrawberryCake();
		ChocoCake cc = new ChocoCake();
		StrawberryCake sc = new StrawberryCake();
		
		ck3.doA();// 대신 St..Cake()안에 B C는 호출 못함
					// 안쓰는게 좋음
		sc.doA();
		sc.doB();
		sc.doC();
		/*
		try {
			Cake ck4 = new Cake();
			if(ck4 instanceof StrawberryCake) {
				System.out.println("바꿀수 있다");
			}
			else {
				System.out.println("바꿀수 없다");
			}
		}catch (Exception e) {
			
		}
		*/
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
