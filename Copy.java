public class Copy
{
  public static void main(String args[])
  {
    int array[]={1,2,3,4,5};
    int c[]=new int[array.length];
    c=array;
    c[0]++;
    System.out.println("The copied contents from array to c array are:");
    for(int i=0;i<c.length;i++)
    System.out.println(c[i] +" ");
  }
}
