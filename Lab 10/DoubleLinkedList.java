import java.util.*;

public class DoubleLinkedList
{
  private Node first;              //previous
  private Node last;              //post
  
  public DoubleLinkedList()       // This is the default constructor for Node behavior.
  {
    first = null;
  }
  private class Node              //Node data type.
  {
    private String data;          //Data carried within the node.
    private Node   next;          //Pointer to the node to be entered after current. Can be NULL. Will be NULL after input is complete.
    private Node   prev;          //Pointer to the previous node. Will always point to a node, unless it is the first in a list.
    public Node(String data)
    {
      this.data = data;
    }
  }
  public void addANode(String newData)
  {
    int listStart = 0;
    
   if(first == null && listStart == 0)
    {
      first      = new Node(null);
      first.prev = first;
      first.next = first;
      last       = first;
      listStart = 1;
    }
    Node next  = new Node(newData);       
    last.next  = next;       
    next.prev  = last;
    next.next  = first;
    last = next;
    first.prev = last;
    last.next  = first;
  }
  public void showList()  
  {
    Node node = first.next;
    
    if(!node.data.equals(null))
    {
      System.out.print(node.data + " ");
      node = node.next;
      while(node.data != null)
      {
        System.out.print(node.data + " ");
        node = node.next;
      }
    }
    else
      System.out.printf("No elements in the list...");
  }
  public void showReverseMethod()
  {
    Node node;
    String data;
    
    if(last != null)
    {
      System.out.print(last.data + " ");
      node = last;
      data = last.data;
      while(node.prev.data != null)
      {
        node = node.prev;
        System.out.print(node.data + " ");
      }
    }
    else
      System.out.printf("No elements in the list...");
  }
  public void deleteNode(String tgt)
  {
    Node node = first.next;
    int check = 0;
    
 /*   while(node != first)
    {
      if(!node.data.equals(tgt))
      {
        node = node.next;
      }
      else
        check = 1;
    }
    node = first.next;
    if(check == 1)
    {*/
    if(tgt.equals(first.data))
    {
      first      = first.next;
      last.next  = first;
      first.prev = last;
    }
    else
    {
      if(tgt.equals(last.data))
      {
       last       = last.prev;
       last.next  = first;
       first.prev = last;
      }
      else
      {
        while(tgt.equals(node.data) != true && tgt.equals(first.data) != true)
        {
          node = node.next;
        }
        if(node.data != null)
        {
          node.prev.next = node.next;
          node.next.prev = node.prev;
        }
      }
    //}
    }
  }
  public int length()
  {
    int size = 0;
    Node node = first.next;
    
    if(node.data != null)
    {
      size += 1;
      while(node.data != null && node != first)
      {
        size += 1;
        node = node.next;
      }
    }
    return size;
  }
}
  