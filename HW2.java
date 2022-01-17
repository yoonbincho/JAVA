package 윤빈짱;

import java.util.HashMap;
import java.util.Scanner;

public class hw2_2018204037 {
	public static void main(String[] args) 
{
		HashMap<String, String> capital = new HashMap<>();//HashMap 호출
		//5개의 국가를 설정해준다.
		
		capital.put("프랑스", "파리");
		capital.put("스페인", "리스본");
		capital.put("그리스", "아테네");
		capital.put("대한민국", "서울");
		capital.put("영국", "런던");
		String [] keys = capital.keySet().toArray(new String[0]);
		
		System.out.println("***  수도맞추기 게임 시작  ***");
		
		while(true)
		{//계속 반복
			Scanner A = new Scanner(System.in);
			int r = (int)(Math.random() * 5);//랜덤 함수를 설정해준다.
			String input;//답변을 받을 변수
			String key = keys[r];
			System.out.print(key + "의 수도는?");
			input = A.next();
			
			if(input.equals(capital.get(key))) {//정답일 경우
				System.out.println("정답");
			}
			else if(input.equals("종료")) {//종료를 입력할 경우
				System.out.println("게임 종료...");
				break;
			}else{
				System.out.println("아닙니다!!");
			}
		}
	}

}