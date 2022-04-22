package oddeven;
import java.util.Scanner;
public class num 
{
   public static void main(String[] args)
   {
	   int n;
	   System.out.println("enter any number");
	   Scanner sc= new Scanner(System.in);
	   n=sc.nextInt();
	   
	   {
		   if (n%2==0)
		   {
			   System.out.println("even number"+n);
		   }
		   else {
			   System.out.println("odd number"+n);
		   }
	   }
 }
 
 
}
