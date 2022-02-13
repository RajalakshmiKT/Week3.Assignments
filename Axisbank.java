package week3.day1;

public class Axisbank extends Bankinfo{

	public void deposit()
	{
		System.out.println("Axis Bank Deposit");
		
	}
	public static void main(String[] args) {
		Axisbank axisbank = new Axisbank();
		axisbank.deposit();
		Bankinfo bankinfo = new Bankinfo();
		bankinfo.deposit();
		axisbank.saving();
		bankinfo.fixed();
	}
}
