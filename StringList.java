public class StringList extends OrderedList
{
    public StringList(String listName) 
    {
        super(listName);
    }
    @Override
    protected int compare(Object obj1, Object obj2) 
    {
        return ((String)obj1).compareTo((String)obj2);
    }
}
