// extends Object�� �����Ǿ��� ǥ��
class Car extends Object{
	protected String number;
	
	public Car(String number) {
		this.number = number;
	}
	public void answer() {
		System.out.println("����ȣ  = "+number);
	}
}
class ElecCar extends Car{
	private String carver;
	public ElecCar(String number, String carver) {
		super(number);
		this.carver = carver;
	}
	public void driveCar() {
		System.out.println("�ڵ����� ���� "+carver);
	}
}
public class Ex02 {
	Ex02(){
		ElecCar ec = new ElecCar("41�� 1122", "�ֽŹ���");
		ec.driveCar();
		ec.answer();
	}
	public static void main(String[] args) {
		
		new Ex02();
	}
}
