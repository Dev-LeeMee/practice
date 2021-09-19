
public class AccountingApp {
//	public static void main(String[] args) {
//		double valueOfSupply = Double.parseDouble(args[0]);
//		double vatRate = 0.1;
//		double vat = valueOfSupply*vatRate;
//		double total = valueOfSupply+vat;
//		double expense = valueOfSupply*0.3;
//		double income = valueOfSupply-expense;
//		
//		System.out.println("Value of supply: "+valueOfSupply);
//		System.out.println("VAT: "+vat);
//		System.out.println("Total: "+total);
//		System.out.println("Expense: "+expense);
//		System.out.println("Income: "+income);

//----------------
	
	public static double valueOfSupply = 10000.0; //전역변수로 이사해줬음 
	public static double vatRate = 0.1;
	
	// 내가 만든 메소드 추가 
	public static double getVAT() {
		return valueOfSupply*vatRate;
	}
	public static double getTotal() {
		return valueOfSupply+getVAT();
	}
	public static double getExpense() {
		return valueOfSupply*0.3;
	}
	public static double getIncome() {
		return valueOfSupply-getExpense();
	}
	
	public static void main(String[] args) { //메소드가 void란건 return값이 없다는 뜻  

		double vat = getVAT();
		double total = getTotal();
		double expense = getExpense();
		double income = getIncome();
		
		System.out.println("Value of supply: "+valueOfSupply);
		System.out.println("VAT: "+getVAT());
		System.out.println("Total: "+getTotal());
		System.out.println("Expense: "+getExpense());
		System.out.println("Income: "+getIncome());
		
	}
}
