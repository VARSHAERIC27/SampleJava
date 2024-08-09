package string;

public class Employee { //review
	String name;
	int age;
	public Employee(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void name() {
		System.out.println(name);
		System.out.println(age);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1= new Employee("varsha",10);
		Employee obj2= new Employee("angel",11);
		Employee obj3= new Employee("eric",12);

obj1.name();
obj2.name();
obj3.name();


		
	}

}
