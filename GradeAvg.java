import java.util.*;
class GradeAvg
{
  public static void main(String args[])
   {
      int n,n1;;
      float avg=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of Students");
      n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        System.out.println("Enter the grade for Student" +i+ ":");
        n1=sc.nextInt();
        while(n1<0 || n1>100)
        {
          System.out.println("Invalid grade, try again...");
          System.out.println("Enter the grade for Student" +i+ ":");
          n1=sc.nextInt();
         }
        avg=avg+n1;
       }
      avg=avg/n;
      System.out.println("The average is "+avg);
     }
}
