package section07;

public class Car { // 클래스 선언
	//예제 7-5
	int wheel = 4;  // 클래스 필드 선언 및 초기화
	
	void ride() {//메서드 선언
		System.out.println("달립니다.");
		//예제 7-8
		System.out.println("씽씽씽");
	}

	//예제 7-6
	public static void main(String[] args) { // 메인메소드
		Car c = new Car();// 객체 생성
		System.out.println("wheel의 개수는" + c.wheel + "개입니다.");
		c.wheel = 5;
		System.out.println("wheel의 개수는" + c.wheel + "개입니다.");
	}//main
	
	}//class



