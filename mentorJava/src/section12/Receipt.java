package section12;

public abstract class Receipt {//추상클래스 선언
	//필드
	String chef;
	
	//생성자
	Receipt(String chef) {
		this.chef = chef;
	}
	
	//메소드
	void info() {
		System.out.println("이 레시피는 " + chef +  "셰프님의 레시피입니다");
	}
}
