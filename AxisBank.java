package week3.day1.assignments;

public class AxisBank extends BankInfo {

	public void deposit(long depAmt)
	{	System.out.println("The method overriden");
		System.out.println("Deposit Amount :"+depAmt);
	}
	
	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.deposit(75000);
		axis.fixed(45000);
		axis.saving();
		String saving = axis.saving();		
		System.out.println("Savings Account :"+saving);
	}
}
