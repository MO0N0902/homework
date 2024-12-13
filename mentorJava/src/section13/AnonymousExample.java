package section13;

interface buttonClickListener{
	public void click();
}

public class AnonymousExample {
	public class Button{
		private buttonClickListener listener;
		
		public void setButtonListener(buttonClickListener listener) {
			this.listener = listener;
		}
		public void click() {
			if(Listener !=null) {
				this.listener.click();
			}
		}
	}
	public static void main(String[] args) {
		AnonymousExample exam = new AnonymousExample();
		AnonymousExample.Button button = exam.new Button();
		
		
	}
}
