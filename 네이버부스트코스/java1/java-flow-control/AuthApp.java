
public class AuthApp {

	public static void main(String[] args) {
		
		String id="egoing";
		String inputId= args[0];
		String pw="1111";
		String inputPw=args[1];
		
		System.out.println("Hi. ");
		if (inputId.equals(id) && inputPw.equals(pw)) // (inputId==id)가 아니라!
			System.out.println("Master!");
		else 
			System.out.println("Who are you?");
		
//		== 동등연산자는 가리키는 곳이 같은지를 묻는 것 
//		equals 내용이 같은지를 묻는 것 
		
//		String a="hello";
//		String b="hello";
//		System.out.println(a==b); //true가 나옴.String 같은 참조형 데이터도 내용이 같으면 같은 주소 쓸 수 있음.

	}

}
