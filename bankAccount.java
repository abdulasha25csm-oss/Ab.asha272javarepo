class bankAccount
{
private double balance=0;
public void deposit(double amount)
{
if(amount>0)
balance+=amount;
}
public double getbalance()
{
return balance;
}
	public static void main(String[] args)
	{
		bankAccount b=new bankAccount();
		b.deposit(50000);
		b.getbalance();
	}
}
