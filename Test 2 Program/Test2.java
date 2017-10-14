import java.util.*;

public class Test2
{ 
  public static void main(String[] args)
  {
    int sumDig;
    int sumChar;
    int check;
    int letConv;
    int[] dig     = {1, 2, 3, 4, 5};
    String lett = "1 2 3 4 5";
    
    sumDig = digSum(dig);
    System.out.printf("The sum of the digits is: %d\n", sumDig);
    sumChar = striSum(lett);
  }
  public static int digSum(int[] dig)
  {
    int i;
    int sum = 0;
    
    for(i = 0; i < dig.length ; i++)
    {
      sum = sum + dig[i];
    }
    return sum;
  }
/*  public static int striSum(String lett)             //Unfinished. ORD, charAt, and Integer.parseInt() did not work.
  {
    int num;
    int conv;
    int i;
    
    for( i = 0; i < 10 ; i++)
    {
      conv [i] = lett.charAt(i);
    }
    
    conv = lett.charAt();
    System.out.printf("Conv is: %d", conv); 
    num = Integer.parseInt(lett);
    System.out.printf("The sum of the string is: %d", num);
   

    return num;
  }*/
}

