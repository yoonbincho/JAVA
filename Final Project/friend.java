package yoonbinquiz;


public class friend{
	String fSae;//플레이어와 조윤빈의 사이
	String usac="어색한 사이";
	String cinsa="친한 사이";
	String jurchin="절친";
	String cho="조윤빈 그 자체";
	int score;
	String thinkSae;//자신이 생각하고 있는 플레이어와 조윤빈의 사이
	public friend(int score,String thinksae)//생성자
	{
		this.score=score;
		this.thinkSae=thinksae;
	}
	
	public void friends(){//점수에 따라 사이를 배정한다.
		try{//예외처리 구문 (점수에 맞는 점수대가 없을 때, 혹은 숫자가 아닐 때 오류를 출력한다.
			if(score>=0&&score<=30)
			{
				fSae=usac;
			}
			else if(score>30&&score<=60)
			{
				fSae=cinsa;
			}
			else if(score>60&&score<=90)
			{
				fSae=jurchin;
			}
			else if(score==100)
			{
				fSae=cho;
			}
		
			if(fSae==thinkSae)
			{
				System.out.println("\n축하합니다! 당신이 추측한 사이와 같네요~!");
			
			}
			else
				System.out.println("\n당신이 생각한 저와의 친밀도는,,,틀렸어요,,유감,,");
		}catch(Exception e)//예외일 경우 출력되는 구문
			{
				System.out.println("오류가 났습니다. 그 점수대는 존재하지 않나봐요. : ");
				e.printStackTrace();//메서드의 호출 기록을 프린트해준다.
			}
	}
}