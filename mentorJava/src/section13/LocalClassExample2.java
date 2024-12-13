package section13;

public class LocalClassExample2 {
//필드
	private int speed = 10;
	
	public void getUnit(String unitName) {
		unitName = unitName +"님";//오류발생
		class Unit	{
			public void move() {
				System.out.println(unitName + "이" + speed +"속도로 이동합니다.");
				
			}
		}
		Unit unit = new Unit();
		unit.move();
	}
	public static void main(String[] args) {
		LocalClassExample local = new LocalClassExample();
		local.getUnut("마린");
	}
}
