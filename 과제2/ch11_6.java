package 윤빈짱;

import java.util.Scanner;
import java.util.stream.Stream;

public class ch11_6 
{

	public static void main(String[] args) {
		Stream<String> kb = Stream.generate(() -> 
		new Scanner(System.in).nextLine());
		int a=5;//받을 수 있는 값의 개수를 정한다.
		int l=2;//글자의 길이를 정한다.
		
		System.out.print(kb.limit(a).filter(s -> s.length() == l).count());
		//받은 값의 길이가 2인 것을 세어서 출력한다.
	}

}