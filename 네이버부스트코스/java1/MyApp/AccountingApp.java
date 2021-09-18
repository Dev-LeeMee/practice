
public class AccountingApp {

	public static void main(String[] args) {
		double valueOfSupply = Double.parseDouble(args[0]);
		System.out.println("Value of supply: "+valueOfSupply);
		double vatRate = 0.1;
		double vat = valueOfSupply*vatRate;
		System.out.println("VAT: "+vat);
		double total = valueOfSupply+vat;
		System.out.println("Total: "+total);
		double expense = valueOfSupply*0.3;
		System.out.println("Expense: "+expense);
		double income = valueOfSupply-expense;
		System.out.println("Income: "+income);
		

	}

}
