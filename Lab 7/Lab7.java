import java.util.*;

public class Lab7
{
  public static void main(String[] ags)
  {
    double     a[][] = {{.5,  1., 0.}, {0.,   .6666, 0.}, {-.5, -1.,   .6666}};
    double     b[][] = {{.5, -1., 0.}, {0., 1-.6666, 0.}, { .5,  1., 1-.6666}};
    double    pb[][] = {{0.,  0., 0.}, {0.,  0.,     0.}, {0.,   0.,  0.    }};
    double  temp[][] = {{0.,  0., 0.}, {0.,  0.,     0.}, {0.,   0.,  0.    }};
    double  invA[][] = {{0.,  0., 0.}, {0.,  0.,     0.}, {0.,   0.,  0.    }};
    double     i[][] = {{1.,  0., 0.}, {0.,  1.,     0.}, {0.,   0.,  1.    }};
    double check[][] = {{0.,  0., 0.}, {0.,  0.,     0.}, {0.,   0.,  0.    }};
    int k;
    
    invA = AllFunctions.add(invA, i);
    pb   = AllFunctions.copy(pb, b);
    temp = AllFunctions.copy(temp, b);
    for(k = 0; k < 20; k++)
    {
      invA = AllFunctions.add  (invA, temp   );
      temp = AllFunctions.power(pb,   b, temp);
      pb   = AllFunctions.copy (pb,   temp   );
    }
    check = AllFunctions.checkWork(invA, a, check);
    AllFunctions.printWork(invA, check);
  }
}
    