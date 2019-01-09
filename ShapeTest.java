import java.util.Scanner;
public class ShapeTest
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int k, x = 1;
		while(true)
		{
			try
			{
				while(x == 1)
				{
					System.out.printf("How many arguments would you like to input? ");
					k = input.nextInt();
					while(k < 2 || k > 4)//this loop deals with the wrong number of inputs
					{
						System.out.printf("Please enter 2, 3 or 4 inputs: ");
						k = input.nextInt();
					}
					if(k == 2)//the case for point
					{
						System.out.printf("The output will be a point.\n");
						System.out.printf("Enter the x coordinate of the point: ");//here the coordinates are inputted
						int xpoint = input.nextInt();
						System.out.printf("Enter the y coordinate of the point: ");
						int ypoint = input.nextInt();
						Point point = new Point(xpoint, ypoint);//point is created and coordinates are printed
						System.out.println(point.getName() + ": " + point.toString());
						System.out.println();
					}
					if(k == 3)//the case for circle
					{
						System.out.printf("The output will be a circle.\n");
						System.out.printf("Enter the x coordinate of the center: ");//circle arguments are inputted
						int xcircle = input.nextInt();
						System.out.printf("Enter the y coordinate of the center: ");
						int ycircle = input.nextInt();
						System.out.printf("Enter the radius length: ");
						double radius = input.nextDouble();
						Circle circle = new Circle(xcircle, ycircle, radius);//circle is created and coordinates are printed
						System.out.println(circle.getName() + ": " + circle.toString());
						System.out.println("Area: " + circle.getArea());
						System.out.println();
					}
					if(k == 4)//the case for cylinder
					{
						System.out.printf("The output will be a cylinder.\n");
						System.out.printf("Enter the x coordinate of the base: ");//coordinates of the cylinder are inputted
						int xbase = input.nextInt();
						System.out.printf("Enter the y coordinate of the base: ");
						int ybase = input.nextInt();
						System.out.printf("Enter the base radius length: ");
						double rbase = input.nextDouble();
						System.out.printf("Enter the height of a cylinder: ");
						double height = input.nextDouble();
						Cylinder cylinder = new Cylinder(xbase, ybase, rbase, height);//cylinder is created and coords are printed
						System.out.println(cylinder.getName() + ": " + cylinder.toString());
						System.out.println("Area: " + cylinder.getArea());
						System.out.println("Volume: " + cylinder.getVolume());
						System.out.println();
					}
					System.out.printf("If you would like to create another shape, press 1 ");
					x = input.nextInt();//this  is used if the user wants to add another shape
				}
				break;
			}
			catch (Exception InputMismatchException)//exception if letters are inputted instead of integer numbers
			{
		        	System.out.println("A number is needed as an input. ");
		        	input.next();
		    	}
		}
		input.close();
	}
}
