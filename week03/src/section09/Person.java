package section09;

public class Person {
	//예제 9-5
	String name; // 필드 생성
	int age;
	// 생성자 
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void introduce() { //메소드 생성
		System.out.println("안녕하세요. 저는" + age + "세" + name + "입니다.");
	}
	
	// 예제 9-6
	public static void main(String[] args) {
		Person p1 = new Person("김자바", 20); //매개변수 2개 전달받아서 객체 생성
		Person p2 = new Person("이코딩", 40);// 
		
		p1.introduce(); // 메소드 호출
		p2.introduce();
		
	}
	
		
}//class
