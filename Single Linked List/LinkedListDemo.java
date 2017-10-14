import java.util.*;

public class LinkedListDemo
{
  private void listMenu()
  {
    System.out.println("\n\n\t\t\tLink List Demo");
    System.out.println("\n\t\t1. Input node(s)");
    System.out.println("\t\t2. List nodes in FILO - order");
    System.out.println("\t\t3. List nodes in FIFO - order");
    System.out.println("\t\t4. Delete a node");
    System.out.println("\t\t5. Exit the program");
    System.out.println("\n\t\tChoice(1/2/3/4/5)? ");
  }
  
  private StringLinkedList enterNodes(StringLinkedList list)
  {
    String more;
    Scanner keyIn = new Scanner(System.in);
    
    do{
      System.out.print("\n\t\tInput a string: ");
      String temp = keyIn.nextLine();
      StringLinkedList.addANodeToStart(temp);
      System.out.print("\n\t\tDo more(Y/N) ? ");
      more = keyIn.nextLine();
    }while (more.toUpperCase().charAt(0) == 'Y');
    return list;
  }
  private static StringLinkedList deleteNode(StringLinkedList list)
  {
    String more;
    
    Scanner keyIn = new Scanner(System.in);
    
    if(list.length() != 0)
    {
      do{
        System.out.print("\n\t\tDelete a string: ");
        String temp = keyIn.nextLine();
        list.deleteANode(temp);
        if(list.length() != 0)
        {
          System.out.print("\nThe rest elements in the list - ");
          list.showReverseList();
        }
        else
          break;
        System.out.print("\n\t\tDo more (Y/N)? ");
        more = keyIn.nextLine();
      }while(more.toUpperCase().charAt(0) == 'Y');
    }
    else
      System.out.println("\nNo elements in the list...");
    return list;
  }
  public void main(String[] args)
  {
    StringLinkedList list = new StringLinkedList();
    
    Scanner keyIn = new Scanner(System.in);
    
    do{
      listMenu();
      String choice = keyIn.nextLine();
      switch(choice.charAt(0))
      {
        case '1': list = enterNodes(list);
                  break;
        case '2': System.out.print("\nIterate from first to last: ");
                  list.showList();
                  break;
        case '3': System.out.print("\nIterate from last to first: ");
                  list.showReverseList();
                  break;
        case '4': list = deleteNode(list);
                  break;
        case '5': System.exit(0);
        default : System.out.println("\n\tUnknown input choice, try again..");
      }
    }while (true);
  }   
}
             