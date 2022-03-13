import java.util.*;
import java.io.*;
interface Payable
{
  public double getPayment();
}
public  class Invoice implements Payable
{
 public String partNum;
   public  String partDescription;
   public int quantity;
  public double pricePerItem;
 String getPartNum()
  {
    return partNum;
  }
  public void setPartNum(String partNum)
  {
    this.partNum=partNum; 
   }
   public String getPartDescription()
  {
    return partDescription;
  }
  public void setPartDescription(String partDescription)
  {
    this.partDescription=partDescription; 
   }
  public int getQuantity()
  {
    return quantity;
  }
  public void setQuantity(int quantity)
  {
    this.quantity=quantity; 
   }
}
class Employee implements Payable
{ 
   public String partNum;
  public String partDescription;
  public int quantity;
  public double pricePerItem;
  public double getPayment()
  {
     System.out.println("Part Number is:" +partNum+ "Part Description is:" +partDescription+ "Quantity is:" +quantity);
   }
}
class Application
{
   public static void main(String args[])
    {
      Invoice i=new Invoice();
       i.setPartNum("12345");
       i.getPartNum();
       i.setPartDescription("abcdef");
       i.getPartDescription();
       i.setQuantity(5000);
       i.getQuantity();
       i.toString();
       Employee e=new Employee();
       e.getPayment();
    }
}


  