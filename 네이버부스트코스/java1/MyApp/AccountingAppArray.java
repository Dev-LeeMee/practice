
public class AccountingAppArray {

	public static void main(String[] args) {
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply+vat;
		double expense = valueOfSupply*0.3;
		double income = valueOfSupply-expense;
		
		double[] dividendRates=new double[3]; //변수 3개 할당
		dividendRates[0]=0.5;
		dividendRates[1]=0.3;
		dividendRates[2]=0.2;
		
		double dividend1=income*dividendRates[0];
		double dividend2=income*dividendRates[1];
		double dividend3=income*dividendRates[2];
		
		System.out.println("Value of supply: "+valueOfSupply);
		System.out.println("VAT: "+vat);
		System.out.println("Total: "+total);
		System.out.println("Expense: "+expense);
		System.out.println("Income: "+income);
		System.out.println("Dividend1: "+dividend1);
		System.out.println("Dividend2: "+dividend2);
		System.out.println("Dividend3: "+dividend3);

	}

}
