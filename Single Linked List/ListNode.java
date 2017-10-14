public class ListNode
{
  private String data;
  private ListNode link;
  
  public ListNode()
  {
    link = null;        //Default Constructor
    data = null;
  }
  
  public ListNode(String newData, ListNode linkValue)
  {
    data = newData;
    link = linkValue;   //Constructor
  }
  
  public void setData(String newData)
  {
    data = newData;
  }
  
  public String getData()
  {
    return data;
  }
  
  public void setLink(ListNode newLink)
  {
    link = newLink;
  }
  
  public ListNode getLink()
  {
    return link;                //This method works, but not good enough...
  }                             //Because privacy problem!
}