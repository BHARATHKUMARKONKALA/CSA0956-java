import java.util.*;
public class square
{
public static void main (String[] args)
{
try
{
 Scanner sc=new Scanner(System.in);
 int i;
 System.out.println("Enter lower range: ");
 int l=sc.nextInt();
 System.out.println("Enter upper range: ");
 int u=sc.nextInt();
 if(l>u)
 {
    System.out.println("The upper limit need to be high");

  }
 if(l<=0||u<=0)
 {
    System.out.println("Enter the valid limit");

  }
  if(l==u)
  {
     System.out.println("The both limit not should be equal");
  }
 else
 {

   for (i = l; i <= u; i++)
 {
  if (Math.sqrt(i) == (int)Math.sqrt(i))
  System.out.print(i + " ");
 }
 }
}
catch(Exception e)
{
   System.out.println("Enter the valid limit");
}
}
}
