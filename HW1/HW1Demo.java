package yb;

public class HW1Demo {

	public static void main(String[] args) {
		
		Complex c1 = new Complex(2.0);//정수만 받은 경우
		c1.print(); 
		
		Complex c2 = new Complex(1.5, 2.5);//정수와 실수를 받은 경우
		c2.print(); 

		System.out.println();

		GolfClub g1 = new GolfClub();
		g1.print(); 
		
		GolfClub g2 = new GolfClub(8);
		g2.print(); //함수에서 받는 변수가 정수
		
		GolfClub g3 = new GolfClub("퍼터");
		g3.print(); //함수에서 받는 변수가 문자열
		
	}

}
