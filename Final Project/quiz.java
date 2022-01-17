package yoonbinquiz;

import java.util.Scanner;
import java.util.ArrayList;




interface interScore{
	
	void printScore();//점수를 출력하는 메서드를 만들라고 시킨다.
	
}
public class quiz {//퀴즈 클래스

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		int ifFriend;//플레이어가 생각하는 조윤빈과의 사이
		String thinkSae=null;
		System.out.println("당신은 윤빈이와 무슨 사이인가요?");
		System.out.println("당신이 생각하는 사이는 몇번인지 골라주세요.");
		System.out.println("1. 어색한 사이");
		System.out.println("2. 친구 사이");
		System.out.println("3. 절친");
		System.out.println("4. 조윤빈 그 자체\n");
		
		
		ArrayList<Integer> scores=new ArrayList<>();//점수들에 대한 Arraylist를 생성한다
		int []answer=new int[10];//문제에 대한 정답을 담는 배열
		

		System.out.print("값을 입력하세요 : ");
		ifFriend=in.nextInt();
		if(ifFriend==1)//무슨 사인지 출력해준다.
		{
			System.out.println("어색한 사이라고 답하셨습니다.");
			thinkSae="어색한 사이";
		}
		else if(ifFriend==2)
		{
			System.out.println("친구 사이라고 답하셨습니다.");
			thinkSae="친한 사이";
		}
		else if(ifFriend==3)
		{
			System.out.println("절친라고 답하셨습니다.");
			thinkSae="절친";
		}
		else if(ifFriend==4)
		{
			System.out.println("조윤빈 그 자체라고 답하셨습니다.");
			thinkSae="조윤빈 그 자체";
		}
		
		//1번 문제 답 2
		System.out.println();
		System.out.println();
		System.out.print("본격적으로 게임이 시작됩니다. 다들 준비하세요!\n\n");
		System.out.print("1번 문제 ) 저의 이름은 무엇일까요?\n");
		System.out.println("1. 조은빈");
		System.out.println("2. 조윤빈");
		System.out.println("3. 최윤빈");
		System.out.println("4. 최은빈");
		System.out.println("5. 박윤빈");
		System.out.print("값을 입력하세요 : ");
		answer[0]=in.nextInt();
		if(answer[0]==2)//정답이라면
		{
			scores.add(10);//Arraylist에 10점을 추가한다.
		}
		
		
		//2번 문제 답 4
		System.out.println();
		System.out.print("2번 문제 ) 저는 몇살일까요? \n");
		System.out.println("1. 8");
		System.out.println("2. 13");
		System.out.println("3. 19");
		System.out.println("4. 21");
		System.out.println("5. 25");
		System.out.print("값을 입력하세요 : ");
		answer[1]=in.nextInt();
		if(answer[1]==4)//정답이라면
		{
			scores.add(10);//Arraylist에 10점을 추가한다.
		}
		
		
		//3번 문제 답1
		System.out.println();
		System.out.print("3번 문제 ) 저는 무슨 학교에 재학중일까요? \n");
		System.out.println("1. 광운대학교");
		System.out.println("2. 강원대학교");
		System.out.println("3. 서울대학교");
		System.out.println("4. 고려대학교");
		System.out.println("5. 숭실대학교");
		System.out.print("값을 입력하세요 : ");
		answer[2]=in.nextInt();//정답이라면
		if(answer[2]==1)
		{
			scores.add(10);//Arraylist에 10점을 추가한다.
		}
		

		//4번 문제 답3
		System.out.println();
		System.out.print("4번 문제 ) 제가 싫어하는 음식은 무엇일까요?\n");
		System.out.println("1. 치즈");
		System.out.println("2. 떡볶이");
		System.out.println("3. 오이");
		System.out.println("4. 석박지");
		System.out.println("5. 스팸");
		System.out.print("값을 입력하세요 : ");
		answer[3]=in.nextInt();
		if(answer[3]==3)//정답이라면
		{
			scores.add(10);//Arraylist에 10점을 추가한다.
		}
		
		//5번 문제 답2
		System.out.println();
		System.out.print("5번 문제 ) 저는 무슨 전공일까요?\n");
		System.out.println("1. 데이터사이언스");
		System.out.println("2. 컨텐츠테크놀로지");
		System.out.println("3. 피아노");
		System.out.println("4. 조소");
		System.out.println("5. 체육");
		System.out.print("값을 입력하세요 : ");
		answer[4]=in.nextInt();
		if(answer[4]==2)//정답이라면
		{
			scores.add(10);//Arraylist에 10점을 추가한다.
		}
		
		//6번 문제 답1
		System.out.println();
		System.out.print("3번 문제 ) 제가 좋아하는 연예인은 누구일까요?\n");
		System.out.println("1. 아이유");
		System.out.println("2. 방탄소년단");
		System.out.println("3. 박진영");
		System.out.println("4. 비");
		System.out.println("5. 빌리 아일리쉬");
		System.out.print("값을 입력하세요 : ");
		answer[5]=in.nextInt();
		if(answer[5]==1)//정답이라면
		{
			scores.add(10);//Arraylist에 10점을 추가한다.
		}
		

		//7번 문제 답4
		System.out.println();
		System.out.print("7번 문제 ) 무슨 음악 장르를 가장 좋아할까요?\n");
		System.out.println("1. 힙합");
		System.out.println("2. 락");
		System.out.println("3. 발라드");
		System.out.println("4. 어쿠스틱");
		System.out.println("5. 동요");
		System.out.print("값을 입력하세요 : ");
		answer[6]=in.nextInt();
		if(answer[6]==4)//정답이라면
		{
			scores.add(10);//Arraylist에 10점을 추가한다.
		}
		

		//8번 문제 답3
		System.out.println();
		System.out.print("8번 문제 ) 저는 스트레스를 어떻게 풀까요? \n");
		System.out.println("1. 밋있는 디저트를 먹는다.");
		System.out.println("2. 친구들과 수다를 떤다.");
		System.out.println("3. 강아지, 고양이 영상을 본다.");
		System.out.println("4. 슬픈 노래를 듣는다.");
		System.out.println("5. 혼자만의 시간을 갖는다.");
		System.out.print("값을 입력하세요 : ");
		answer[7]=in.nextInt();
		if(answer[7]==3)//정답이라면
		{
			scores.add(10);//Arraylist에 10점을 추가한다.
		}
		
		//9번 문제 답1
		System.out.println();
		System.out.print("9번 문제 ) 요즘 즐겨하는 게임은 무엇일까요?\n");
		System.out.println("1. 테일즈런너");
		System.out.println("2. 카트라이더");
		System.out.println("3. 오버워치");
		System.out.println("4. 쥬니어네이버");
		System.out.println("5. 롤");
		System.out.print("값을 입력하세요 : ");
		answer[8]=in.nextInt();
		if(answer[8]==1)//정답이라면
		{
			scores.add(10);//Arraylist에 10점을 추가한다.
		}
		
		//10번 문제 답5
		System.out.println();
		System.out.print("10번 문제 ) 제가 제일 존경하는 교수님은 누구일까요?\n");
		System.out.println("1. 김수한무 교수님");
		System.out.println("2. 김꺽정 교수님");
		System.out.println("3. 김아무개 교수님");
		System.out.println("4. 김천재 교수님");
		System.out.println("5. 한진섭 교수님");
		System.out.print("값을 입력하세요 : ");
		
		answer[9]=in.nextInt();
		if(answer[9]==5)//정답이라면
		{
			scores.add(10);//Arraylist에 10점을 추가한다.
		}
		int score=0;//점수의 합 변수를 만들어준다.
		for(int i=0;i<scores.size();i++) {
			score+=scores.get(i);//Arraylist에 있는 모든 점수를 더해준다.
		}
		score sc=new score(score);//생성자를 통해 score객체 생성
		sc.printScore();//score클래스에 printScore 호출
		friend fr=new friend(score,thinkSae);//생성자를 통해 friend객체 생성
		fr.friends();//friend클래스에서 friends 호출
		
	}

}
