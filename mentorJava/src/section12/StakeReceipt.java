package section12;

public class StakeReceipt extends Receipt{

	public StakeReceipt(String chef) {
		super(chef);
	}
	
	void grillStake() {
		System.out.println("스테이크를 맛이게 굽습니다.");
	}

}
