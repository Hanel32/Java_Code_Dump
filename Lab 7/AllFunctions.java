public class AllFunctions
{
  public static double[][] add(double[][] a, double[][] b)
  {
    int c, d, e;
    
    for(c = 0; c < 3; c++)
    {
      for(d = 0; d < 3; d++)
      {
        a[c][d] += b[c][d];
      }
    }
    return a;
  }
  public static double[][] copy(double[][] a, double[][] b)
  {
    int c, d;
    
    for(c = 0; c < 3; c++)
    {
      for(d = 0; d < 3 ; d++)
      {
        a[c][d] = b[c][d];
      }
    }
    return a;
  }

  public static double[][] power(double[][] x, double[][] y, double[][] z)
  {
    int i, j, k;
  
    for(i = 0; i < 3; i++)
    {
      for(j = 0; j < 3; j++)
      {
      z[i][j] = 0;
      for(k = 0; k < 3; k++)
        z[i][j] += (x[i][k] * y[k][j]);
      }
    }
    return z;
  }
  public static double[][] checkWork(double[][] inv, double[][] a, double[][] check)
  {
    int c, d;
  
    for(c = 0; c < 3; c++)
    {
      for(d = 0; d < 3; d++)
      {
        check[d][c] = inv[c][d] * a[d][c];
      }
    }
    return check;
  }
  public static void printWork(double[][] i, double[][] a)
  {
    int c, d;
    System.out.printf("\n\n\n\n\n\t\t       InvA\t        InvA * A");
    for(c = 0; c < 3; c++)
    {
      System.out.printf("\n\t\t");
      for(d = 0; d < 3; d++)
      {
        System.out.printf("%5.2f ", i[c][d]);
      }
      System.out.printf("     ");
      for(d = 0; d < 3; d++)
      {
        System.out.printf("%5.2f ", a[c][d]);
      }
      System.out.printf("\n");
    }
  }
}