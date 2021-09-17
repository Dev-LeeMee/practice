
public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;
		System.out.println(b); // 1 을 double로 바꿔줌 = 자동으로 casting
		
		// int c = 1.1; // double->int 는 자동 casting X (손실이 일어나기 때문). 마우스를 대서 선택하
		double c = 1.1; // c를 double로 바꿔주거나 
		int d = (int) 1.1; // 소수점 아래를 다 제거하는 손실이 있더라도 억지로 int로 바꿔주거나 
		System.out.println(c);
		System.out.println(d);
	
		// 1 to string
		String f = Integer.toString(1);
		System.out.println(f.getClass()); // 변수 f의ㅣ 클래스가 뭔지 묻는 
		
	}

}
