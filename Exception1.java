import java.util.*;
class Exception1
{
  public static void main(String args[])
  {
    try{
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    int c=a/b;
    System.out.println("The Quotient of two numbers is:" +c);
    }
   catch(ArithmeticException e)
   {
      System.out.println("Divided by Zero Exception Caused");
   }
   finally
   {
     System.out.println("Inside finally block");
   }
  }
}

    