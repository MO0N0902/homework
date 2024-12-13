package section13;

public class LocalClassExample {
	//필드
	private int speed = 10;
	
	//메소드
	public void getUnut(String unitName) {
		//지역클래스
		class Unit{
			public void move() {
				System.out.println(unitName + "이" + speed + "속도로 이동합니다.");
			}
		}
		Unit unit = new Unit();//지역클래스 객체선언
		unit.move();//메소드 호출
	}
	public static void main(String[] args) {
		LocalClassExample local = new LocalClassExample();// 외부클래스 객체 선언
		local.getUnut("마린");
	}
	
}
