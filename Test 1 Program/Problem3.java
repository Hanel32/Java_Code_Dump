
import java.util.*;

public class Problem3
{
  public static void main(String[] args)
  {
    int n, nn, dig, sum = 0, sumDiv = 0, i;
    String more = "y";
    
    Scanner keyIn = new Scanner (System.in);
      
    do
    {
      System.out.printf("\n\t\t\tInput an integer: ");
      nn = n = keyIn.nextInt();
      sum = 0;
      sumDiv = 0;
      while(n > 0)
      {
        dig = n%10;
        sum = sum + dig;
        n = n / 10;
      }
      System.out.printf("\n\t\t\tThe Sum = %d", sum);
      n = nn;
      System.out.printf("\n\t\t\tThe Divisors are: ");
      for (i = 1; i < ((n / 2) + 1) ; i++)
      {
        if(n % i == 0)
        {
          System.out.printf("%d, ", i);
          sumDiv = sumDiv + i;
        }
      }   
      System.out.printf("\n\t\t\tThe Sum of the Divisors is: %d", sumDiv);
      System.out.printf("\n\t\t\tDo more (Y/N)? ");
      more = keyIn.next();
    }while(more.charAt(0) == 'y' || more.charAt(0) == 'Y');
  }
}
