package any.name;

public class Person {
	int age ;
	public Person(int age){
		this.age = age ;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Person p = new Person(15) ;
		System.out.println(p.getAge());
	}
}
