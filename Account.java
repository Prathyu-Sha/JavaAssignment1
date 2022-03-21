class Account1
{
	private double balance;
	public double getBalance() {
		return balance;
	}

	 void setBalance(double balance) {
		this.balance = balance;
	}
	 synchronized void substractAmount(double amount)
	{
		 System.out.println("The amount Subtracted");
		for(int i=0;i<5;i++)
		{
			amount=amount-1000;
			System.out.println(amount);
		}
	}
	synchronized void addAmount(double amount)
	{
		System.out.println("The amount added is:");
		for(int i=0;i<5;i++)
		{
			amount=amount+1000;
			System.out.println(amount);
		}
		try
		{
			Thread.sleep(400);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
}
class Bank extends Account1
{
	Account1 a;
	Bank b;
	Bank(Account1 a)
	{
		this.a=a;
	}
	public void run()
	{
		a.addAmount(250000);
		a.substractAmount(350000);
	}
}
class Company extends Account1
{
	Account1 a;
	Company c;
    Company(Account1 a)
	{
		this.a=a;
	}
	public void run()
	{
		a.addAmount(250000);
		a.substractAmount(350000);
	}
}
class Account
{
	public static void main(String[] arg)
	{
		Account1 a=new Account1();
		Bank b=new Bank(a);
		Company c=new Company(a);
		b.run();
		c.run();
		b.setBalance(5000.00);
		System.out.println("Balance Amount is");
		b.getBalance();	
	}
}
