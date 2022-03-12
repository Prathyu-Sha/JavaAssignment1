import java.util.*;
class One
{
  public static void main(String args[])
   {
        int date,month,year;
      Scanner sc=new Scanner(System.in);
      date=sc.nextInt();
      month=sc.nextInt();
      year=sc.nextInt();
      System.out.println("The given date is:" +date+ "/" +month+ "/" +year);
      if(((year%400==0)||(year%100!=0)&&(year%4==0)) && month==2)
         {
            if(date<=28)
            {
               date++;
             }
             else
             {
                 month++;
                date=1;
           }
         }
      else
       {
          if(month== 1 || month==3||month==5||month==7||month==8||month==10||month==12)
          {
             if(date==30)
             {
               date=1;
               month++;
             }
             else if(month==12 && date==31)
              {
                year++;
                date=1;
                month=1;
              }
             else
              {
                 date++;
               }
             
            }
           else
            {
               if(date<=29)
                {
                  date++;
                }
                else
                 {
                    date=1;
                    month++;
                  }
              }
       }
      System.out.println("The next date is:" +date+ "/" +month+ "/" +year);
    }
}
