class Person{
	protected String name;
	public Person(String name) {
		this.name = name;
	}
}
class StudentFriend extends Person{
	public void doStudy() {
		System.out.println(name+ "��(��) ���θ� ��");
	}
	public StudentFriend(String name) {
		super(name);
	}
}
// ��ĥ�� �ֱ� ������ Person���� ���
class CompanyFriend extends Person{
	public void doWork() {
		System.out.println(name+ "��(��) ���� ��");
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
		
		stufs[0] = new StudentFriend("��浿");
		comfs[0] = new CompanyFriend("ȫ�浿");
		*/
		
		Person[] persons = new Person[20];
		persons[0] = new StudentFriend("ȫ�浿");
		persons[1] = new CompanyFriend("��浿");
		
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
