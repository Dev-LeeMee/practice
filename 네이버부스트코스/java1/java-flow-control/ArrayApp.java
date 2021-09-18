import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
//		String users="egoing, jinsu, dayoung"; //이런 방법보다 아래처럼 배열을 사용하는 것이 더 깔끔.
//		String[] users=new String[3]; 
//users라는 이름의 String타입 배열=새로 만들어 3칸
//		users[0]="egoing";
//		users[1]="jinsu";
//		users[2]="dayoung";
		
//		처음부터 한꺼번에 데이터까지 입력하고 싶으면 아래처
//		String[] users= {"egoing","jinsu","dayoung"};
//	
//		System.out.println(users[1]);
//		System.out.println(users.length);
		
// loop+array		
//		for(int i=0; i<users.length; i++) {
//			System.out.println(users[i]+",");
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert your name: ");
		String user=sc.next();
		
		String[] list= {"Sally","David","Talia"};
		boolean login=false; // 전역변수를 선언해줘야 해서 for문 밖에 default로 false 선언!
		
		for(int i=0; i<list.length; i++) {
			String people=list[i];
			if (user.equals(people)) {
				login=true; break;
			}
		}
			
		if (login) {
			System.out.println("Hi, master!"); 
		} else 
			System.out.println("Who are you?"); 	
	}
}

