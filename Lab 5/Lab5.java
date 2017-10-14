import java.util.*;

public class Lab5
{
  public static void main(String[] args)
  {
    int size = 21;
    int x[] = {99, 86, 78, 65, 66, 79, 29, 45, 16, 92, 59, 48, 44, 31, 27, 26, 24, 19, 15, 8, 1};
    int getNum;
    String more = "Y";
    
    Scanner keyIn = new Scanner (System.in);
    
    System.out.printf("\n\tUnsorted Seq: ");
    AllFunctions.printIt(x, size);
    System.out.printf("\n\tSorted   Seq: ");
    AllFunctions.sortIt(x, size);
    AllFunctions.printIt(x, size);
    do{
      System.out.printf("\n\t\tInput a number: ");
      getNum = keyIn.nextInt();
      AllFunctions.searchIt(x, getNum);
      System.out.printf("\n\t\t\tDo more? (Y/N): ");
      more = keyIn.next();
    }while(more.toUpperCase().charAt(0) == 'Y');
  }
}
       