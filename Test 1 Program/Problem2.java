import java.util.*;

public class Problem2
{
  public static void main(String[] ags)
  {
    int sum = 1;
    int add = 1;
    int flag = 0;
    int i;
    
    for(i = 1; i <= 36; i++)
    {
     add = add + i;
     if(flag == 0)
     {
       sum = sum - (add);
       flag = 1;
     }  
     if(flag == 1)
     {
       sum = sum + (add);
       flag = 0;
     }
    }
    System.out.printf("Sum = %d\n", sum);
  }
}
  
    