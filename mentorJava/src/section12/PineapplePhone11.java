package section12;

public class PineapplePhone11 implements Phone10{
	int batteryCapacity = 40;
	boolean isOn = false;
	@Override
	public void powerOn() {
		if(batteryCapacity>30) {
			System.out.println("@@@Power On!@@@\n");
			isOn = true;
		}else {
			System.out.println("Low Battery...");
		}
		
	}
	@Override
	public void powerOff() {
	System.out.println("@@@Power Off!!@@@\n");
	isOn = false;
		
	}
	@Override
	public void charge() {
		if(batteryCapacity < Phone10.MAX_BATTERY_CAPACITY - 20) {
			System.out.println("---충전 중---");
			batteryCapacity +=10;
			System.out.println("잔여 배터리 ..." + batteryCapacity + "%\n");
		}else {
			System.out.println("충전할 필요가 없습니다");
			System.out.println("잔여 배터리..." + batteryCapacity + "%");
		}
		
	}
	@Override
	public void watchUtube() {
		if(batteryCapacity > 10) {
			System.out.println("---watching Utube---");
			batteryCapacity -=10;
			System.out.println("battey is..." + batteryCapacity + "%\n");
		}else {
			System.out.println("Low battery...");
			powerOff();
		}
		
	}
	@Override
	public boolean isON() {
		if(isOn) {
			return true;
		}else {
		return false;
		}
	}

	

}
