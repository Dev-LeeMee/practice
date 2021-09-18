class Accounting {
	public static double vatRate = 0.1;
	public static double valueOfSupply;
	public static double getIncome() {
		return valueOfSupply-getExpense();
	}

	public static double getExpense() {
		return valueOfSupply*0.3;
	}

	public static double getTotal() {
		return valueOfSupply+getVAT();
	}

	static double getVAT() {
		return valueOfSupply*vatRate;
	}

}
public class AccountingAppClass {
	
	public static void main(String[] args) {
		Accounting.valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;

		print();
	}

	public static void print() {
		System.out.println("Value of supply: "+Accounting.valueOfSupply);
		System.out.println("VAT: "+Accounting.getVAT());
		System.out.println("Total: "+Accounting.getTotal());
		System.out.println("Expense: "+Accounting.getExpense());
		System.out.println("Income: "+Accounting.getIncome());
	}

}
