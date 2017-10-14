import java.util.*;
import java.io.*;

public class Judge
{
  public static void main(String[] args) throws FileNotFoundException
  {
    Scanner inputStream = null;
    inputStream  = new Scanner(new FileReader("data.txt")); 
    
    double[] scores = {0., 0., 0., 0., 0., 0., 0., 0., 0., 0.};
    double temp, average, tot = 0.;
    int i, comp = 1;
    
    do{
      for(i = 0; i < 10; i++)
        scores[i] = inputStream.nextDouble();
      sortIt(scores);
      for(i = 1; i < 9; i++)
        tot += scores[i];
      average = tot / 8.;
      System.out.printf("For competitor #%d, the average score is %5.3f\n",comp, average); 
      tot     = 0.;
      average = 0.;
      comp    += 1;
    }while(inputStream.hasNext());
    inputStream.close();
  }
  public static double[] sortIt(double[] scores)
  {
    int i = 0, j = 0, k = 0, size = 9;
    double mid;
    
    for(j = k; j < size; j++)
    {
      for(i = j - k; i >= 0; i-= k)
      {
        if(scores[i+k] >= scores[i])
        {
          break;
        }
        else
        {
          mid = scores[i];
          scores[i] = scores[i + k];
          scores[i+k] = mid;
        }
      }
    }
    return scores;
  }
}
    
    