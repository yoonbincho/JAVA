package yb;

public class GolfClub {
	
	int i; // i변수 소환
	String club; 
	boolean Iron; //참 거짓 판명

	public GolfClub(int i) 
	{
		this.i = i;//정수를 입력 받음
		Iron = true;//임의로 아이언을 가진 객체
	}

	public GolfClub(String club) 
	{
		this.club = club;//문자열을 입력 받음
	} // 임의로 클럽을 가진 객체 생성자

	public GolfClub() 
	{
		this(7);// 아이언 7번 객체를 만든다.
	} 

	void print() //출력하는 함수
	{
		
		if (Iron) //정수인지 아닌지로 판별한다.
		{
			System.out.println(i + "번 아이언입니다.");
			
		} 
		
		else //아닐 경우
		{
			System.out.println(club + "입니다.");
		}
	} 

	
}
