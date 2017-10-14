import java.io.*;
import java.util.*;

public class Lab8
{
  public static void main (String[] args) throws FileNotFoundException
  {     
    System.out.printf("\n\n\t\t\t Blinn Apparel Store");
    System.out.printf("\n\n\t\t    Unit  Cost\t     Extended");
    System.out.printf("\n\t Quantity \t    Cost  Market\t  Cost      Market    Lower Cost");
    System.out.printf("\nMens Dept");
    doWork();
  }
  public static void doWork() throws FileNotFoundException
  {
    Scanner     inputStream  = null;
    inputStream  = new Scanner(new FileReader("blinn.txt")); 
    
    double cost, sale, quan, totalCost = 0., totalMark = 0., extCost, extMark, lowerTot = 0.;
    int prev = 1, dep;
    String item;
    String[] title = {"Mens Dept", "Ladies Dept", "Girls Dept", "Boys Dept"};

   do{
     dep  = inputStream.nextInt();
     item = inputStream.next();
     quan = inputStream.nextDouble();
     cost = inputStream.nextDouble();
     sale = inputStream.nextDouble();
     
     if(dep == prev)
     {
       extCost    = cost * quan;
       totalCost += extCost;
       extMark    = sale * quan;
       totalMark += extMark;
       display(cost, sale, quan, item, extCost, extMark);
     }
     else
     {
       lowerTot += findLower(totalCost, totalMark);
       totalMark = 0.;
       totalCost = 0.;
       prev = dep;
       System.out.printf(title[prev-1]);
       extCost    = cost * quan;
       totalCost += extCost;
       extMark    = sale * quan;
       totalMark += extMark;
       display(cost, sale, quan, item, extCost, extMark);
     }
   }while(inputStream.hasNext());
   lowerTot += findLower(totalCost, totalMark);
   System.out.printf("\n  Inventory at lower cost \t\t\t\t  $%6.2f", lowerTot); 
   inputStream.close();
  }
  public static void display(double cost, double sale, double quan, String item, double extCost, double extMark)
  {
    System.out.printf("\n    %-7s    %-4.0f %8.2f %7.2f     %8.2f   %8.2f",item, quan, cost, sale, extCost, extMark);
  }
  public static double findLower(double totalCost, double totalMark)
  {
    double lower;
    
    if(totalCost > totalMark)
      lower = totalMark;
    else
      lower = totalCost;
    System.out.printf("\n   Total\t\t\t         $%8.2f  $%8.2f     $%8.2f\n", totalCost, totalMark, lower);

    return(lower);
  }
}
    