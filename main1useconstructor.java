package myproject1;
class Account1
{
	int accountNo;
	String accountType;
	int accountBalance;
	Account1(int accountNo, String accountType, int accountBalance)
	{
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	void withdraw(int amount)
	{
		accountBalance = accountBalance-amount;
	}
	void deposit(int amount)
	{
		accountBalance = accountBalance+amount;
	}
	void dispAccountDetails()
	{
		System.out.println("Account Number = "+accountNo);
		System.out.println("Account Type = "+accountType);
		System.out.println("Account Balance = "+accountBalance);
	}
}
public class main1useconstructor {

	public static void main(String[] args) {
		Account1 a = new Account1(457,"savings",1000);
		a.withdraw(500);
		a.deposit(100);
		a.dispAccountDetails();

	}

}
