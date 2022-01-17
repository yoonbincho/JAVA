package cho;

import java.util.Scanner;

abstract class Echoer {
	
	void start() //시작 메서드
	{
		System.out.println("시작합니다.");//시작을 알린다.
	}

	abstract void echo();

	void stop() //종료 메서드
	{
		System.out.println("종료합니다.");
	}
}

public class EchoerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		Echoer e = new Echoer() 
		{
	         @Override //오버라이딩 한다.
	         void echo()
	         {
	            String a;
	            while(true) {  //무한 반복
	               a = in.nextLine();
	               if(a.equals("끝")) {
	                  System.out.println(a);
	                  break;  //"끝"이란 단어를 입력하면 종료된다.
	               }
	               else
	                  System.out.println(a);
	            }
	         }
	      };  //한 행 이상 코드 필요
		e.start();//시작 메서드 실행
		e.echo();//에코 메서드 실행
		e.stop();//stop메서드 실행
	}

}
