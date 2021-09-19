
public class FirstMethod {

	public static void main(String[] args) {
		System.out.println("Hello Method");
		System.out.println(Math.floor(1.8));

		printTwoTimes("a");
		printTwoTimes("b");
		
	}
	public static void printTwoTimes(String text) {
		System.out.println("-");
		System.out.println(text);
		System.out.println(text);
	}
}
