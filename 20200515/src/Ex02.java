// extends Object는 생략되어진 표현
class Car extends Object{
	protected String number;
	
	public Car(String number) {
		this.number = number;
	}
	public void answer() {
		System.out.println("차번호  = "+number);
	}
}
class ElecCar extends Car{
	private String carver;
	public ElecCar(String number, String carver) {
		super(number);
		this.carver = carver;
	}
	public void driveCar() {
		System.out.println("자동차가 운전 "+carver);
	}
}
public class Ex02 {
	Ex02(){
		ElecCar ec = new ElecCar("41저 1122", "최신버전");
		ec.driveCar();
		ec.answer();
	}
	public static void main(String[] args) {
		
		new Ex02();
	}
}
