public class IntegerList extends OrderedList
{

    // Constructor
    public IntegerList(String listName) 
    {
        super(listName);
    }
    @Override
    protected int compare(Object obj1, Object obj2)//redefines the compare method
    {//it is made protected and int
        int a = (Integer) obj1;
        int b = (Integer) obj2;
        if (a < b) 
        {//same functionality as compare
            return -1;
        } 
        else if (a > b)
        {
            return 1;
        } 
        else 
        {
            return 0;
        }
    }
}