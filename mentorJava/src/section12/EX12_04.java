package section12;

public class EX12_04 {
public static void main(String[] args) {
	//Receipt클래스는 추상클래스이기때문에 직접 객체를 생성할 수 없음
	// 자식클래스의 객체를 생성해서 추상클래스(부모클래스)의 메소드를 호출할 수 있음
	PastaReceipt pr = new PastaReceipt("최연석");
	pr.info();
	pr.makeSource();
	
	System.out.println();
	
	StakeReceipt sr = new StakeReceipt("이연복");
	sr.info();
	sr.grillStake();
	
}
}
