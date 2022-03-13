import java.util.*;
class Account
{
 int minBal=5000;
 String name;
 int accNum;
 double accBal;
 double b;
 Account(String name, int accNum, double accBal)
 {
   this.name=name;
   this.accNum=accNum;
   this.accBal=accBal;
  }
  void deposit(double b)
  {
    accBal=accBal+b;
    System.out.println("The total amount after deposit is:" +accBal);
   }
}
class SavingsAccount extends Account
{
   public SavingsAccount()
   {
     super("Prathyusha",1234,600.00);
    }
  int interest=5;
  double x;
  double maxWithdrawalAmount=accBal;
  void getBal()
  {
    maxWithdrawalAmount=(interest*maxWithdrawalAmount)/100;
    System.out.println("Balance after applying interes in SavingsAccount is:" +maxWithdrawalAmount);
   }
   void withdrawal(double x)
   { 
     double y=accBal-x;
     if(x>accBal && y<minBal)
     {
       System.out.println("You doesn't have enough money to withdraw");
      }
     else
      {
        System.out.println("The remaining balance in SavingsAccount is:" +accBal);
       }
    }
}
class CurrentAccount extends Account
{
   public CurrentAccount()
   {
      super("Prathyusha",1234,500.00);
    }
   double a;
  void getBal()
  {
    System.out.println("The remaining balance in Current Account is: " +accBal);
  }
  void withdrawal(double a)
   {
     if(a>accBal)
     {
        System.out.println("You doesn't have enough money to withdraw");
     }
     else
     {
        double z=accBal-a;
       System.out.println("The remaining balance in CurrentAccount is: " +z);
     }
   }
}
class BankAccount
{
  public static void main(String args[])
  {
     SavingsAccount sa=new SavingsAccount();
     sa.getBal();
     sa.withdrawal(200.0);
     CurrentAccount ca=new CurrentAccount();
     ca.getBal();
     ca.withdrawal(300.0);
  }
}

     
       
      
   