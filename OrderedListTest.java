import java.util.*;
public class OrderedListTest 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        IntegerList integerList = new IntegerList("Integer List");
        StringList stringList = new StringList("String List");
        int RemoveInteger;
        String RemoveString;
        int IntMenu = 0, StrMenu = 0, MenuNumbers = 0; 
        int x;
        int n = 0;
        program:
        {
            while (true)//continuous loop for initial menu
            {
                try 
                {
                    System.out.printf("What list do you want to manage?:\n1.Integer List  2.Strings List  3.Exit\n>");
                    MenuNumbers = Integer.parseInt(scanner.nextLine());
                } 
                catch (NumberFormatException e) 
                {
                    System.out.printf("Please choose a number from 1 to 3.\n");
                }
                switch (MenuNumbers)//cycles through the 4 cases and catches errors
                {
                    case 1: // Integer list case
                        try 
                        {
                            System.out.printf("Your selection was Integer List, Now what do you want to do?:\n1.Add Integer numbers  2.Remove an Integer number  3.Print the Integer List\n>");
                            IntMenu = Integer.parseInt(scanner.nextLine());
                        }
                        catch (NumberFormatException e) 
                        {
                            System.out.printf("Please enter a number.\n");
                        }
                        switch (IntMenu) 
                        {
                            case 1: // Add Integers
                                System.out.printf("Firstly, choose how many numbers do you want to input, afterwards input them.\n>");
                                try 
                                {
                                    int integers = Integer.parseInt(scanner.nextLine());
                                    for (int i = 0; i < integers; i++) 
                                    {//inputs the desired number of integers
                                    	System.out.printf("Integer number %d is: ",i+1);
                                        x = Integer.parseInt(scanner.nextLine());
                                        integerList.insert(x);
                                    }
                                } 
                                catch (NumberFormatException e)
                                {
                                    System.out.printf("Please enter an integer.\n");
                                }

                                break;
                            case 2: // case for removing integers
                            	try
                            	{
                            		System.out.printf("Which integer from the list do you want to remove?\n>");
                            		RemoveInteger = Integer.parseInt(scanner.nextLine());
                            		integerList.remove(RemoveInteger);
                            	}
                            	catch (NumberFormatException e) 
                                {
                                    System.out.printf("Please enter a number.\n");
                                }
                                break;
                            case 3: // case for printing integers
                            	System.out.printf("%s\n", integerList.toString());
                                break;
                            case 4: // Exit
                                break;
                        }
                        break;
                    case 2:// string list case
                        try 
                        {
                            System.out.printf("Your selection was Strings List, Now what do you want to do?:\n1. Add Strings  2. Remove a String  3. Print the Strings\n>");
                            StrMenu = Integer.parseInt(scanner.nextLine());
                        } 
                        catch (NumberFormatException e) 
                        {
                            System.out.printf("Please enter a number from 1 to 3.\n3");
                        }
                        switch (StrMenu) 
                        {
                            case 1://string inputting case
                                System.out.printf("Firstly, enter how many strings you want to add, afterwards add the strings\n>");
                                String string;
                                try 
                                {
                                    n = Integer.parseInt(scanner.nextLine());
                                } 
                                catch (NumberFormatException e) 
                                {
                                    System.out.printf("Please enter a number.\n");
                                }
                                for (int i = 0; i < n; i++) 
                                {
                                	System.out.printf("String number %d is: ",i+1);
                                    string = scanner.nextLine(); //prints the strings
                                    stringList.insert(string);
                                }
                                break;
                            case 2:
                                System.out.printf("Which string do you want to remove?");//removing strings
                                RemoveString = scanner.nextLine();
                                stringList.remove(RemoveString);
                                break;
                            case 3:
                            	System.out.printf("%s\n", stringList.toString());
                                break;
                            case 4:
                                break;
                        }
                        break;
                    case 3:
                        break program;
                }
            }
        }
    }
}
