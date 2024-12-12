package section07;

//예제 7-12
public class Student { // 클래스 선언
	static String schoolName = "코리아 고등학교"; // 정적 멤버 선언

	static void goToSchool() { // 정적메소드 선언
		System.out.println("학교에 갑니다");
	}
//예제 7-13
//public static void main(String[] args) {
//	System.out.println(Student.schoolName); // 정적 필드 호출
//	Student.goToSchool();// 정적메소드 호출
//}

//예제 7-14
	String studentName;

	void hello() {
		System.out.println("안녕하세요, 제 이름은" + studentName + "입니다.");
	}

//예제 7-15
public static void main(String[] args) {
	Student stu1 = new Student(); // 객체생성
	stu1.studentName = "김고이";  // 필드 호출
	stu1.hello();// 객체.메소드명으로 메소드 호출
	System.out.println("학교는" + Student.schoolName + "입니다.");
	Student.goToSchool();

	Student stu2 = new Student(); // 객체 생성
	stu2.studentName = "김고삼";// 필드 호출
	stu2.hello(); // 메소드 호출
	System.out.println("학교는" + Student.schoolName + "입니다");
	Student.goToSchool(); // 메소드 호출

}

}
