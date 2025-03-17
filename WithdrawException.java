package Exceptions;
class WithdraException extends Exception
{
	WithdraException(String msg)
	{
		super(msg);
	}
	WithdraException(){}
}
class Amount
{
	void setWithdraw(int amount, int balance)throws WithdraException
	{
		if (amount>balance)
			throw new WithdraException("Insufficient Amount");
		else
			System.out.println("Amount Withdran Successfully");
	}
}
public class WithdrawException{

	public static void main(String[] args) {
		Amount a= new Amount();
		try
		{
			a.setWithdraw(10,200);
		}
		catch(WithdraException e)
		{
			System.err.println(e);
		}

	}

}
