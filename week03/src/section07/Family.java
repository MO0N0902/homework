package section07;

public class Family {// 클래스 선언
	//예제 7-10
	//필드
	String name; // 구성원 이름
	int age;// 구성원 나이
	String address = "서울"; // 구성원주소
	
	//예제 7-11
	public static void main(String[] args) {
		Family father = new Family(); //father 객체 생성
		Family son = new Family(); // son 객체생성
		
		father.address = "인천"; // father 객체 주소만 변경
		System.out.println(son.address); // 기본값 서울 출력
	}
}

