package section09;

public class Phone {
	//예제 9-7
	// 필드생성
	String brand;
	int series;
	String color;
	
	//생성자 호출
	public Phone(String brand, int series, String color) {

		this.brand = brand;
		this.series = series;
		this.color = color = "black";
	}
	
	// 예제 9-8
	public Phone(String brand, int series) { // 매개변수 2개받는 생성자 호출
		
		this.brand = brand;
		this.series = series;
	}
	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시", 1, "흰색"); // 매개변수 3개받아 객체 생성
		Phone p2 = new Phone("아이폰", 2); // 매개변수 2개받아 객체 생성
		p1.phoneInfo();
		p2.phoneInfo();
	}


	void phoneInfo() { //메소드 생성 
		System.out.println(color + " " + brand + " " + series);
	}
	//예제 9-8
//public static void main(String[] args) {
//	Phone p1 = new Phone("갤럭시", 1, "흰색"); // 매개변수 3개받아서 객체 생성
//	Phone p2 = new Phone("아이폰", 2); // 매개변수를 입력 안했기 때문에 오류 발갱
	
//}
	
	
}//class
