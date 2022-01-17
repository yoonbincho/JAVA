package cho;
interface Flyable {
	void speed();
	void height();
}

public class FlyableTest {

	public static void main(String[] args) {
		
		Flyable f = new Flyable() {
	         @Override//오버라이딩 한다.
	         public void speed() 
	         {
	            System.out.println("속도");
	         }
	         
	         @Override
	         public void height() 
	         {
	            System.out.println("높이");
	         }
	      };//인터페이스 사용
		
		f.speed();//스피드 실행
		f.height();//높이 실행
	
		

	}

}
