package yoonbinquiz;

public class score implements interScore{
	private int score;
	public score(int score)//score 인터페이스
	{
		this.score=score;
	}
	public void printScore()
	{
		System.out.println("\n\n당신의 점수는 "+score+"점입니다.");//플레이어의 점수를 출력한다.
	}
	
	
}