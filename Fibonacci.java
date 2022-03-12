import java.util.*;
class Fibonacci
{
   public static void main(String args[])
   {
      int n1=0,n2=1,n,n3;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter range of fibonacci"); 
      n=sc.nextInt();
      float avg=n1+n2;
      System.out.println("The first " + n + " Fibonacci numbers are:");
      System.out.print(n1+" "+n2);
      for(int i=0;i<n-1;i++)
       {
         n3=n1+n2;
         avg=avg+n3;
         System.out.print(" " +n3);
         n1=n2; 
         n2=n3;
         }
        avg=avg/n;
        System.out.println("\n");
        System.out.println("The average is  " + avg);
    }
}
      
      
      