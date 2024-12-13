package section13;


class Calculator{
	
	//필드
	private int val1;
	private int val2;
	
	//매개변수 2개받는 생성자 선언
	public Calculator(int val1, int val2) {
		super();
		this.val1 = val1;
		this.val2 = val2;
	}
	//내부클래스 선언
	public class Calc {
		public int add() {
			return val1 + val2; //외부클래스의 필드를 이용하여 계산
		}
	}
}
public class CalculatorExample {
public static void main(String[] args) {
	Calculator cal = new Calculator(10,11);//외부클래스 객체 생성
	Calculator.Calc c = cal.new Calc();//외부클래스명.내부클래스명 객체명 = new 외부클래스객체명.내부클래스명
	//인스턴스 클래스는 반드시 외부 클래스를 생성한 후 사용해야함
	System.out.println("합 : " + c.add()) ;
	
}
}
