class Problem4
{
  private static int quiz(double a, double b, double c)
  {
    return (int) (a*b*c);
  }
  
  private static int quiz(int[] a)
  {
    int i = 1, sum = a[0];
    for ( ; i < a.length; i++)
    {
      if(sum < a[i])
        sum = a[i]++;
      else
        a[i] = ++sum;
    }
    return sum;
  }
  private static int quiz( int x, int y, int z)
  {
    return x + y + z;
  }
  private static double quiz(int x, double y)
  {
    return (double) x/y;
  }
  private static int quiz(double x, int y)
  {
    return (int) x - y;
  }
  
  public static void main(String[] ag)
  {
    int[] x = {6, 2, 3, 5, 8, 7, 4};
    
    System.out.printf("\n\tLine 1: ", + quiz(7.5, 4));
    System.out.printf("\n\tLine 2: ", + quiz(3, 4, 5));
    System.out.printf("\n\tLine 3: ", + quiz(2.5, 3.0, -2.0));
    System.out.printf("\n\tLine 4: ", + quiz(9, -4.5));
    System.out.printf("\n\tLine 5: ", + quiz(x));
    System.out.printf("\n\t" + x[1]+" "+x[2]+" "+x[3]+" "+x[5]+" "+x[6]);
  }
}
    
    
    
  