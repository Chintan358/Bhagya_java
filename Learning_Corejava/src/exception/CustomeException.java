package exception;

class InsufficentAmountException extends Exception
{
	
}


class Bank
{
	double balance;
	
	public void checkBalance()
	{
		System.out.println("current balance is : "+balance);
	}
	
	public void deposite(double amt)
	{
		balance+=amt;
	}
	
	public void withdrow(double amt) throws InsufficentAmountException
	{
		if(amt>balance)
		{
//			System.out.println("Insuffcient amount");
			throw new InsufficentAmountException();
		}
		else
		{
			balance-=amt;
		}
	}
}


public class CustomeException {
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.checkBalance();
		b.deposite(5000);
		b.deposite(15000);
		b.checkBalance();
		try {
			b.withdrow(25000);
		} catch (InsufficentAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.checkBalance();
	}
}
