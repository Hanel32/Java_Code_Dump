import java.util.*;

public class BowlingLab
{
  public static void main(String[] args)
  {
    int i, check;
    int[] scoresA = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] scoresB = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] score   = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    String more = "Y";

    Scanner keyIn = new Scanner(System.in);
    
    do{
      System.out.printf("\n\t\tWelcome to Blinn Bowling Center");
      for(i = 0 ; i < 10; i++)
      {
       check = 0; 
       System.out.println("\n\tFrame - " + (i + 1));
       System.out.printf("\n\t\tBall - 1 : ");
       scoresA[i] = keyIn.nextInt(); 
       scoresA[i] = checkBounds(scoresA[i], 0, 0);
       check = checkClass(scoresA[i], 0, 0);
       if(check != 1)
       {
         System.out.printf("\n\t\tBall - 2 : ");
         scoresB[i] = keyIn.nextInt(); 
         scoresB[i] = checkBounds(scoresA[i], 1, scoresB[i]);       
         check = checkClass(scoresA[i], scoresB[i], 1);
       }
       else 
         System.out.println("Your score for this frame is: " + (scoresA[i] + scoresB[i]));
      }
      scoresA[10] = 0;
      scoresA[11] = 0;
      if(scoresA[9] == 10)
      {
        scoresA[10] = extra(1);
        if(scoresA[10] == 10)
          scoresA[11] = extra(1);
      }
      if((scoresA[9] + scoresB[9]) == 10 && scoresA[9] != 10)
      {
        scoresA[10] = extra(1);
      }
      score = calc(scoresA, scoresB);
      System.out.printf("\n\n\t  Frame -    1   2   3   4   5   6   7   8   9  10  Xtr-1 Xtr-2");
      printIt(scoresA, scoresB, score);
      
      System.out.println("\n\nDo more? Y/N : ");
      more = keyIn.next();
      for(i = 0; i < 11; i++)
      {
        scoresB[i] = 0;
        scoresA[i] = 0;
        score[i]   = 0;
      }
    }while(more.toUpperCase().charAt(0) == 'Y');
  }
  public static int checkClass(int score, int scoreTwo, int ball)
  {
    if(score == 10 && ball == 0)
    {
      System.out.printf("\n\t\tCongratulations! You hit a strike!");
      return 1;
    }
    else
    {
      if((score + scoreTwo) == 10 && ball == 1)
      {
        System.out.printf("\n\t\tCongratulations! You got a spare!");
        return 1;
      }
      else
        return 0;
    }
  }
  public static int checkBounds(int score, int ball, int scoreTwo)
  {
    int newScore;
    
    if(ball == 0 && score >= 0 && score < 11)
      return score;
    if(ball == 1 && (score + scoreTwo) >= 0 && (score + scoreTwo) < 11 && scoreTwo > 0)
    {
      return scoreTwo;
    }
    else
    {
      newScore = invalidInput(score, ball, scoreTwo);
    }
    return newScore;
  }
  public static int invalidInput(int score, int ball, int scoreTwo)
  {
    Scanner keyIn = new Scanner(System.in);
    if(ball == 0)
      System.out.printf("\n\n\t\tYou entered an invalid score of : " + score);
    else
      System.out.printf("\n\n\t\tYou entered an invalid score of : " + scoreTwo);
    System.out.printf("\n\t\tPlease try again: ");
    int newTry = keyIn.nextInt();
    
    if(ball == 0)
      newTry = checkBounds(newTry, 0, 0);
    if(ball == 1)
      newTry = checkBounds(score, 1, newTry);
    return newTry;
  }
  public static int extra(int num)
  {
    int j, temp, score = 0;
    
    Scanner keyIn = new Scanner(System.in);
    
    for(j = 0; j < num; j++)
    {
      System.out.printf("\n\t\tExtra - " + (j+1));
      temp = keyIn.nextInt();
      temp = checkBounds(temp, 0, 0);
      score += temp;
    }
    return score;
  } 
  public static int[] calc(int[] ballOne, int[]ballTwo)
  {
    int i, total = 0;
    int score[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    
    for(i = 0; i < 10; i++)
    {
      if(ballOne[i] == 10 && ballOne[i+1] != 10)            
        score[i] = ballOne[i] + (ballOne[i+1]+ballTwo[i+1]);
      if(ballOne[i] == 10 && ballOne[i+1] == 10)            
        score[i] = ballOne[i] + ballOne[i+1] + ballOne[i+2];
      if((ballOne[i] + ballTwo[i]) == 10 && ballOne[i] != 10)                  
        score[i] = 10 + ballOne[i+1];
      if((ballOne[i] + ballTwo[i]) < 10)
        score[i] = ballOne[i] + ballTwo[i];
      total = total + score[i];
      score[i] = total;   
    }
    return score;
  }
  public static void printIt(int[] ballOne, int[] ballTwo, int[] score)
  {
    int j;
  
    System.out.printf("\n\tBall - 1 : ");
    for(j = 0; j < 12; j++)
    {
      if(j < 11)
        System.out.printf("%3d ",ballOne[j]);
      if(j > 10)
        System.out.printf("%5d ",ballOne[j]);
    }
    System.out.printf("\n\tBall - 2 : ");
    for(j = 0; j < 10; j++)
      System.out.printf("%3d ", ballTwo[j]);
    System.out.printf("\n\t  Score  : "); 
    for(j = 0; j < 10; j++)
      System.out.printf("%3d ", score[j]);
  }
}
