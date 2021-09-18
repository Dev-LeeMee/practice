
public class AccountingAppMethod {

	public static double vatRate = 0.1;
	public static double valueOfSupply;
	
	public static void main(String[] args) {
		valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;

		print();
	}

	public static void print() {
		System.out.println("Value of supply: "+valueOfSupply);
		System.out.println("VAT: "+getVAT());
		System.out.println("Total: "+getTotal());
		System.out.println("Expense: "+getExpense());
		System.out.println("Income: "+getIncome());
	}

	public static double getIncome() {
		return valueOfSupply-getExpense();
	}

	public static double getExpense() {
		return valueOfSupply*0.3;
	}

	public static double getTotal() {
		return valueOfSupply+getVAT();
	}

	private static double getVAT() {
		return valueOfSupply*vatRate;
	}

}
