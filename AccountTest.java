/*Create a class Customer with the fields custId, custName and custAddress. Create a
method display() which displays the Customer details.
Create a class Account with the fields acctId, acctType, Customer and acctBalance.
Create a method display() which displays Account Details
Create a main class “AccountTest” to test the above classes
Note: Use constructors to set the values to the fields of the classes*/

package myproject1;

class Customer
{
	int custId;
	String custName;
	String custAddress;
	Customer(int custId, String custName, String custAddress)
	{
		this.custId=custId;
		this.custName=custName;
		this.custAddress=custAddress;
	}
	void display()
	{
		System.out.println("Customer id = "+custId);
		System.out.println("Customer Name = "+custName);
		System.out.println("Customer Address = "+custAddress);
	}
}
class account
{
	int acctId;
	String acctType;
	int acctBalance;
	account(int acctId, String acctType, int acctBalance)
	{
		this.acctId=acctId;
		this.acctType=acctType;
		this.acctBalance=acctBalance;
	}
	void display()
	{
		System.out.println("Account Id = "+acctId);
		System.out.println("Account Type = "+acctType);
		System.out.println("Account Balance = "+acctBalance);
	}
}
public class AccountTest {

	public static void main(String[] args) 
	{
		Customer c = new Customer(457,"Ram","Rajahmundry");
		c.display();
		account a = new account(6310,"Savings",5000);
		a.display();
	}

}
