import java.util.*;

public class Lab4
{
  public static void main(String[] args)
  {
    double x;
    char   more;
    
    AllFunctions temp = new AllFunctions();
    
    Scanner keyIn = new Scanner (System.in);
    do{
      System.out.printf ("\n\t\t\tInput x: ");
      x = keyIn.nextDouble();
      System.out.printf("\n\t\t\t\t    LibraryResult\t   MyResult");
      System.out.printf("\n\t\t\tSin(%5.2f)\t      %9.6f\t  %9.6f", x, Math.sin(x), temp.mySin(x));
      System.out.printf("\n\t\t\tCos(%5.2f)\t      %9.6f\t  %9.6f", x, Math.cos(x), temp.myCos(x));
      System.out.printf("\n\t\t\tExp(%5.2f)\t      %9.6f\t  %9.6f", x, Math.exp(x), temp.myExp(x));
      System.out.printf("\n\t\t\t\tDo more (Y/N) ? ");
      more = keyIn.next().charAt(0);
    }while (more == 'y' || more == 'Y');
    keyIn.close();
  }
}