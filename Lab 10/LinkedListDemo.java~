import java.util.*;

public class LinkedListDemo
{
  private static void listMenu()
  {
    System.out.println("\n\n\t\t\tLink List Demo");
    System.out.println("\n\t\t1. Input node(s)");
    System.out.println("\t\t2. List nodes in FILO - order");
    System.out.println("\t\t3. List nodes in FIFO - order");
    System.out.println("\t\t4. Delete a node");
    System.out.println("\t\t5. Exit the program");
    System.out.println("\n\t\tChoice(1/2/3/4/5)? ");
  }
  
  private static DoubleLinkedList enterNodes(DoubleLinkedList list)
  {
    String more;
    Scanner keyIn = new Scanner(System.in);
    
    do{
      System.out.print("\n\t\tInput a string: ");
      String temp = keyIn.nextLine();
      list.addANode(temp);
      System.out.print("\n\t\tDo more(Y/N) ? ");
      more = keyIn.nextLine();
    }while (more.toUpperCase().charAt(0) == 'Y');
    return list;
  }
  private static DoubleLinkedList deleteNode(DoubleLinkedList list)
  {
    String more; 
    Scanner keyIn = new Scanner(System.in);
    
    if(list.length() != 0)
    {
      do{
        System.out.print("\n\t\tDelete a string: ");
        String temp = keyIn.nextLine();
        list.deleteNode(temp);
        if(list.length() != 0)
        {
          System.out.print("\nThe rest elements in the list - ");
          list.showList();
        }
        else
          break;
        if(list.length() == 0)
        {
          System.out.println("\nNo more elements in the list...");
          break;
        }
        System.out.print("\n\t\tDo more (Y/N)? ");
        more = keyIn.nextLine();
      }while(more.toUpperCase().charAt(0) == 'Y');
    }
    else
      System.out.println("\nNo elements in the list...");
    return list;
  }
  public static void main(String[] args)
  {
    DoubleLinkedList list = new DoubleLinkedList();
    int isData = 0;
    
    Scanner keyIn = new Scanner(System.in);
    
    do{
      listMenu();
      String choice = keyIn.nextLine();
      switch(choice.charAt(0))
      {
        case '1': list = enterNodes(list);
                  isData = 1;
                  break;
        case '2': if(list.length() != 0)
                  {
                    System.out.println("\nIterate from first to last: ");
                    list.showList();
                  } 
                  else
                    System.out.println("\nNo elements in the list...");
                  break;
        case '3': if(list.length() != 0)
                  {
                    System.out.println("\nIterate from last to first: ");
                    list.showReverseMethod();
                  }
                  else
                    System.out.println("\nNo elements in the list...");
                  break;
        case '4': if(isData == 1)
                    list = deleteNode(list);  
                  else
                    System.out.println("\nNo elements in the list...");
                  break;
        case '5': System.exit(0);
        default : System.out.println("\n\tUnknown input choice, try again..");
      }
    }while (true);
  }   
}