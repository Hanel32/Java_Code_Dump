import java.util.*;

public class Lab6
{
  public static void main(String[] ags)
  {
    int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String more;
    int mm, dd, yy, choice;
    
    Scanner keyIn = new Scanner (System.in);
    
    do{
      System.out.printf("\n\n\tThis program will find days passed or date in the year.");
      System.out.printf("\n\t\t\t1) Input date (mm/dd/yyy) to find days passed.");
      System.out.printf("\n\t\t\t2) Input passed days to find date in the year.");
      System.out.printf("\n\n\t\t\tYour choice (1/2): ");
      choice = keyIn.nextInt();
      switch(choice)
      {
        case 1:
        {
          days[1] = 28;
          System.out.printf("\n\t\tPlease input months: ");
          mm = keyIn.nextInt();
          System.out.printf("\n\t\t               days: ");
          dd = keyIn.nextInt();
          System.out.printf("\n\t\t               year: ");
          yy = keyIn.nextInt();
          if(AllFunctions.dateCheck(mm, dd, yy, days) == 1)
          {
            System.out.printf("\n\t\tThere are %d days passed in the year %d", AllFunctions.countIt(mm, dd, yy, days), yy);
            System.out.printf("\n\n\t\tDo more (Y/N) ? ");
            more = keyIn.next();
            break;
          }
          else
          {
            System.out.printf("\n\t\tInvalid entry under one or more criteria.");
            System.out.printf("\n\n\t\tDo more (Y/N) ? ");
            more = keyIn.next();
            break;
          }
        }
        case 2:
        {
          days[1] = 28;
          System.out.printf("\n\n\t\tInput days: ");
          dd = keyIn.nextInt();
          System.out.printf("\n\n\t\t     Years: ");
          yy = keyIn.nextInt();
          AllFunctions.findDate(dd, yy, days);
          System.out.printf("\n\n\t\tDo more (Y/N) ? ");
          more = keyIn.next();
          break;
        }
        default:
        {
          System.out.printf("\n\t\tInvalid decision.");
          System.out.printf("\n\n\t\tDo more (Y/N) ? ");
          more = keyIn.next();
          break;
        }
      }
    }while(more.toUpperCase().charAt(0) == 'Y');
  }
}
          