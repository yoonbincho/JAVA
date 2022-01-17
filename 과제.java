package choyoonbin;

import java.util.Scanner;

class yoonbin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int m;//지불할 금액
		int p;//제품 가격
		while(true) //while문을 사용하여 반복시켜준다.
		{
		System.out.print("제품 가격을 입력하시오(1~10000): ");
		p=in.nextInt();
		//제품 가격 값을 받음
		if(p==0)//0을 입력하면
			break;//반복을 멈춤
		System.out.print("지불 금액 입력(1~10000): ");
		m=in.nextInt();
		//지불할 가격 값을 받음
		
		
		System.out.printf("- 5000원 :%d개\n",(m-p)/5000);//5000원이 필요한 개수
		System.out.printf("- 1000원 :%d개\n",((m-p)%5000)/1000);//1000원이 필요한 개수
		System.out.printf("- 500원 :%d개\n",((m-p)%1000)/500);//500원이 필요한 개수
		System.out.printf("- 100원 :%d개\n",((m-p)%500)/100);//100원이 필요한 개수
		System.out.printf("- 50원 :%d개\n",((m-p)%100)/50);//50원이 필요한 개수
		System.out.printf("- 10원 :%d개\n",((m-p)%50)/10 );//10원이 필요한 개수
		System.out.printf("- 5원 :%d개\n", ((m-p)%10)/5);//5원이 필요한 개수
		System.out.printf("- 1원 :%d개\n", (m-p)%5);//1원이 필요한 개수
		System.out.println("============================");
		}
		System.out.print("프로그램 종료......");//0을 입력하면 나오는 메세지
	}

	

}
