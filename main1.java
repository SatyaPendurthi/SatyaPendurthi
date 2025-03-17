package myproject1;
class Account
{
	int accountNo;
	String accountType;
	int accountBalance;
	void setAccountDetails(int accountNo, String accountType, int accountBalance)
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
public class main1 {

	public static void main(String[] args) {
		Account a = new Account();
		a.setAccountDetails(457,"savings",1000);
		a.withdraw(500);
		a.deposit(100);
		a.dispAccountDetails();
	}

}
