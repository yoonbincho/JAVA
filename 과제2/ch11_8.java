package 윤빈짱;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ch11_8 {

	public static void main(String[] args) {
	
		String[] s = {"독수리", "고양이", "강아지"};
		List<String> list = new ArrayList<String>();//새로운 ArrayList를 만들어준다.
		
		list.add("개미");//list에 개미를 추가한다.
		list.add("개미");//list에 개미를 추가한다.
		
		System.out.println(list);//list를 출력한다.
		
		List<String> al1 = new ArrayList<>(list);
		System.out.println("nCopies : " + al1);
		
		al1.set(0, "벌");//al1에 0번째에 벌을 추가한다.
		al1.set(1, "벌");//al1에 1번째에 벌을 추가한다.
		System.out.println("'벌'을 채운 후 : " + al1);//벌을 채운 후를 추가한다.
		
		for(String i : s) {
			al1.add(i);
		}//모든 항목을 추가한다.
		
		System.out.println("리스트를 모두 추가한 후 : " + al1);
		
		Collections.sort(al1);//리스트를 섞는다.
		System.out.println("리스트를 섞은 후 : " + al1);
		
		Collections.reverse(al1);//리스트를 반대로 정렬시킨다.
		System.out.println("리스트를 역순으로 정렬한 후 : " + al1);
		
		System.out.println("리스트에서 최소 : " + Collections.min(al1));//사전순으로 최솟값을 반환한다.(강->최솟값)
		System.out.println("리스트에서 최대 : " + Collections.max(al1));//사전순으로 최댓값을 반환한다.<벌->최댓값)
		System.out.println("리스트에서 벌의 빈도 : " + Collections.frequency(al1, "벌"));//벌이 얼마나 나왔는지 빈도를 출력한다.
	}
}
