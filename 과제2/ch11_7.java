package 윤빈짱;

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;

public class ch11_7 {

	public static void main(String[] args) {
		
		String[] s1 = {"a", "b", "a", "b", "c"};
		String[] s2 = {"c"};
		
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		Collections.addAll(set1, s1);
		Collections.addAll(set2, s2);
		System.out.println("set1 : " + set1);//set1에 있는 중복하지 않는 값의 종류를 보여준다.
		System.out.println("set2 : " + set2);//set2에 있는 중복하지 않는 값의 종류를 보여준다.
		
		System.out.println("set1 과 set2는 같다 : " + (set1 == set2));//값은 다르니까 false가 출력
		System.out.println("set1은 set2의 모든 원소를 포함한다 : " + set1.containsAll(set2));//c포함
		
		set1.addAll(set2);//set1에 set2의 값을 추가한다. (합집합)
		System.out.println("합집합 : " + set1.toString());
		set1.retainAll(set2);//중복값을 제거한다. (교집합)
		System.out.println("교집합 : " + set1.toString());
	}

}