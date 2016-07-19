import java.util.Scanner;

public class Reverse
{
private static Scanner e;
public static void main(String[] args) 
       {
           e = new Scanner(System.in);
	       System.out.print("Enter the number to be reversed:");
	       int get = e.nextInt();
	       int result = reverse(get);
	       System.out.println("The reversed number is "+result);
	   }
      public static int reverse(int t) 
      {
	       int result = 0;
	       int i;
	       while (t > 0) 
	       {
	           i = t %10;
	           t = t /10;
	           result=result*10+i;
	       }
	       return result;
	   }
}
