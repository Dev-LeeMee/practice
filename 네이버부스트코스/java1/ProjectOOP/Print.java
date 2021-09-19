
//class Print {
//	public String delimiter="";
//	
//	public void A() {
//		System.out.println(delimiter);
//		System.out.println("A");
//	}
//	public void B() {
//		System.out.println(delimiter);
//		System.out.println("B");
//	}
//}

//or delimiter를 생성자로 처음부터 지정하기
class Print {
	public String delimiter="";
	public Print(String delimiter) { //생성자 
		this.delimiter=delimiter; // this:내가 만든 객체를 가리킴 
	}
	
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
	}
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
	}
}