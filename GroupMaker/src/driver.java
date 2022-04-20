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
				Filler.makeProjectOneGroups();

				System.out.println("\n\n\n");

			}
		
		
		public static void printGroups()
		{
			int space = 0;
			
			System.out.println("Project 1");
			for(int i = 0; i < fillingStudentNames.studentNames.size(); i++)
				{
					System.out.println(fillingStudentNames.studentNames.get(i).getProjectOneGroup() + ". " + fillingStudentNames.studentNames.get(i).getName());
				}
			System.out.println();
			System.out.println("Project 2");
			for(int i = 0; i < fillingStudentNames.studentNames.size(); i++)
				{
					System.out.println(fillingStudentNames.studentNames.get(i).getProjectTwoGroup() + ". " + fillingStudentNames.studentNames.get(i).getName());
				}
			System.out.println();
			System.out.println("Project 3");
			for(int i = 0; i < fillingStudentNames.studentNames.size(); i++)
				{
					System.out.println(fillingStudentNames.studentNames.get(i).getProjectThreeGroup() + ". " + fillingStudentNames.studentNames.get(i).getName());
				}
		}
	}

