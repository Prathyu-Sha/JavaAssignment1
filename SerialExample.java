import java.io.*;
class Emp implements Serializable
{
  static int id;
  String name;
  String Address;
  double Salary;
  public Emp(int id, String name, String Address, double Salary)
  {
    this.id=id;
    this.name=name;
    this.Address=Address;
    this.Salary=Salary;
  }
public  void display(Emp object)
  {
     System.out.println("Id is:" +id+ "Name is:" +name+ "Address is:" +Address+ "Salary is:" +Salary);
  }
}
public class SerialExample
{
  public static void main(String args[])
   {
      Emp object=new Emp(143,"Prathyu","3-78,Morapally",25000.0);
     String filename="prathyu.txt";
    try
     {
       FileOutputStream file=new FileOutputStream(filename);
       ObjectOutputStream out=new ObjectOutputStream(file);
       out.writeObject(object);
       out.close();
       file.close();
       System.out.println("Object has been Serialized");
       System.out.println("data before Deserialization is:");
       display(object);
       object.id=2000;
     }
   catch(IOException i)
    {
       System.out.println("Exception occured");
    }
   object=null;
   try
    {
      FileInputStream file=new FileInputStream(filename);
      ObjectInputStream in=new ObjectInputStream(file);
      object=(Emp)in.readObject();
      in.close();
      file.close();
      System.out.println("Objects has been Deserialized");
      System.out.println("Data after Desrialization");
      display(object);
    }
   catch(IOException ie)
    {
       System.out.println("Exception occurred");
    }
   catch(ClassNotFoundException c)
    {
      System.out.println("Exception occurred");
    }
}
}
 
      
