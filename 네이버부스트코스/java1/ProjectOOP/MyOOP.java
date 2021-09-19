public class MyOOP {

//	public static void main(String[] args) {
//		Print p1=new Print();
//		p1.delimiter="----";
//		p1.A();
//		
//		Print p2=new Print();
//		p2.delimiter="****";
//		p2.B();
//	}
//}

// or delimiter를 생성자로 처음부터 지정하기
	public static void main(String[] args) {
		Print p1=new Print("----");
		p1.A();
		
		Print p2=new Print("****");
		p2.B();
	}
}