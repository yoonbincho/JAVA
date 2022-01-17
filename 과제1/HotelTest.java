package cho;



class Hotel {
	
	private class Room {
		int number;
		String client;

		public Room(int number, String client) {
			
			this.number = number;
			this.client = client;
			//생성자 완성
		}
	}

	Room[] room = new Room[10];// room 배열 선언
	public void add(int number, String client) {
		for(int i = 0; i < room.length; i++) {
			if(room[i] == null) 
			{
				//room배열이 비어있다면
				room[i] = new Room(number, client);//클래스 할당한다.
				break;
			}
			else //room배열이 안 비면
			{
				continue; 
			}
		}
	}
	public void show() {//show 메서드
		for(int i = 0; i < room.length; i++) {
			if(room[i] == null) {
				break;
			}
			else {
				System.out.println(room[i].number + "번 방을 " + room[i].client + "가 예약 했습니다.");
			}//값을 출력한다.
		}
		
	}
}

public class HotelTest {

	public static void main(String[] args) {

		Hotel hotel = new Hotel();
		hotel.add(5, "호돌이");
		hotel.add(7, "길동이");
		hotel.show();

	}

}
