package section13;

class PrintOut{// 외부 클래스 생성
	public static class Out{ //정적 내부클래스 선언
		public void println(String str) {
			System.out.println(str);
		}
	}
}
public class SataticClassExam {
public static void main(String[] args) {
	String str = "정적내부클래스 테스트";
	PrintOut.Out out = new PrintOut.Out(); //정적내부클래스는 외부클래스 객체생성 없이 생성가능
	out.println(str);
}
}
