import java.util.*;
class Employee
{ 
  String firstName;
  String lastName;
  int salary;
  int id;
  int percent;
  Employee(int id, String firstName,String lastName, int salary)
  {
    this.firstName=firstName;
    this.lastName=lastName; 
    this.salary=salary;
    this.id=id;
   }
  String getFirstName()
   {
       return firstName;
    }
   String getLastName()
    {
       return lastName;
     }
   String getName()
   {
      String name=firstName+" "+lastName;
      return name;
    }
    int getSalary(int salary)
    {
      return salary;
    }
    public void setsalary(int salary)
     {
       this.salary=salary;
     }
    int getAnnualSalary(int salary)
     {
        salary=salary*12;
        return salary;
     }
    public int raiseSalary(int percentage,int salary)
    {
      salary=(salary*percentage)/100;
      return salary;
    }
    public String toString()
    {
       return("Employee[id=" +id+ ", name=" +firstName+ " " +lastName+ ", salary=" +salary +"]");
     }
}
class Demo
{
  public static void main(String args[])
   {
     Employee e=new Employee(123,"Prathyusha","Rapelly",50000);
     System.out.println(e.getFirstName());
     System.out.println(e.getLastName());
     System.out.println(e.getName());
    System.out.println(e.getSalary(50000));
     System.out.println(e.getAnnualSalary(50000));
     System.out.println(e.raiseSalary(86,50000));
     System.out.println(e.toString());
    }
}


   
      
   
