import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class driver
	{

		static Scanner intInput = new Scanner(System.in);
		static Scanner stringInput = new Scanner(System.in);
		static int medianSize;
		static String enter;
		
		public static void main(String[] args) throws IOException
			{
				//this fills the original arraylist to start
				fillingStudentNames.fillingStudentNames();
				
				System.out.println("What is the median group size that you want? (About how many people do you want in each group?)");
				medianSize = intInput.nextInt();
				System.out.println("Ok, you want groups of around " + medianSize);
				System.out.println("Press enter to generate the groups");
				enter = stringInput.nextLine();
				
				//the method that will generate groups goes here 
			}
	}

