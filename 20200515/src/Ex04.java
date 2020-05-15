class Person{
	protected String name;
	public Person(String name) {
		this.name = name;
	}
}
class StudentFriend extends Person{
	public void doStudy() {
		System.out.println(name+ "은(는) 공부를 함");
	}
	public StudentFriend(String name) {
		super(name);
	}
}
// 겹칠수 있기 때문에 Person한테 상속
class CompanyFriend extends Person{
	public void doWork() {
		System.out.println(name+ "은(는) 일을 함");
	}
	public CompanyFriend(String name) {
		super(name);
	}
}
public class Ex04 {
	Ex04(){
		/*
		StudentFriend[] stufs = new StudentFriend[10];
		CompanyFriend[] comfs = new CompanyFriend[10];
		
		stufs[0] = new StudentFriend("김길동");
		comfs[0] = new CompanyFriend("홍길동");
		*/
		
		Person[] persons = new Person[20];
		persons[0] = new StudentFriend("홍길동");
		persons[1] = new CompanyFriend("김길동");
		
		if(persons[0] instanceof StudentFriend) {
			StudentFriend temp = (StudentFriend)persons[0];
			temp.doStudy();
		}
		if(persons[1] instanceof CompanyFriend) {
			CompanyFriend temp = (CompanyFriend)persons[1];
			temp.doWork();
		}
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
