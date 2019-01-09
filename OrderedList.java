public abstract class OrderedList extends List 
{    
    public OrderedList(String listName) 
    {
        super(listName);
    }
    ListNode lastNode = new ListNode(null, null);
    protected abstract int compare(Object obj1, Object obj2);
    public void insert(Object Data) 
    {
        ListNode Node;
        ListNode NextNode;
        if (firstNode == null) // adding a new node if the first one is empty
            firstNode = new ListNode(Data, null);
        else 
        	if(compare(Data, firstNode.getData()) <= 0) 
        	{
        		ListNode firstNodeNew = new ListNode(Data, firstNode);
        		firstNode = firstNodeNew;//the new first data is redefined
        	}
        else 
        {
            Node = firstNode;
            while (Node.getNext() != null)//works only if the current node precedes another one
            {
                NextNode = Node.getNext();
                if (compare(Data, NextNode.getData()) <= 0) 
                {
                    ListNode newNode = new ListNode(Data, NextNode);
                    Node.setNext(newNode);
                    break;//this uses compare to order the list
                }
                else 
                {
                    Node = Node.getNext();
                }
            }
            if (Node.getNext() == null) 
            {
                ListNode NewNode = new ListNode(Data, null);
                Node.setNext(NewNode);// if there is no "next" node, the new one is placed there
            }
        }
    }
    public Boolean remove(Object remData) 
    {
        ListNode RemNode;
        ListNode RemNext;

        if (firstNode != null) //if first node isn't empty, the tests start from there
        {
            RemNode = firstNode;

            if(compare(remData, RemNode.getData()) == 0)
            {//compares current node with ListNode node;
                firstNode = RemNode.getNext();
                RemNode = null;
            }
            else 
            {
                while(RemNode.getNext() != null) 
                {
                    RemNext = RemNode.getNext();
                    if(compare(remData, RemNext.getData()) == 0) 
                    {
                        RemNext = null;
                        RemNode.setNext(RemNode.getNext().getNext());
                        return true;
                    }

                    else 
                    {
                        RemNode = RemNext;
                        RemNext = RemNext.getNext();
                    }
                }
            }
        }
        if (firstNode == null) //error message if list is empty
        {
            System.out.println("The list is empty!\n");
            return false;
        }
        else 
        	if (firstNode.getNext() != null)//error message if the desired node is not found
        	{
        		System.out.printf("Value not found!\n");
        		return false;
        	}
        return false;
    }
}