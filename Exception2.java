class InvalidAgeException extends Exception
{
  public InvalidAgeException(String str)
  {
    System.out.println(str);
   }
}
public class Exception2
{
  public static void main(String args[])
  {
      String name=args[0];

      int age=Integer.parseInt(name);
    try
    {
       if(age<18 || age>=60)
       {
         throw new InvalidAgeException("Invalid age");
       }
       else
       {
         System.out.println("Valid Age");
       }
     }
       catch(InvalidAgeException e)
       {
         System.out.println(e);
       }
   }
}
