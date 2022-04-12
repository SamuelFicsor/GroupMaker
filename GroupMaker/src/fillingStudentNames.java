import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class fillingStudentNames 
	{
		static Scanner file;
		static ArrayList <String> studentNames = new ArrayList <String>();
		
		public static void fillStudentNames() throws IOException
		{
			file = new Scanner(new File("StudentList.txt"));
			
			while(file.hasNext())
				{
					String name = file.nextLine();
				}
			
		}
		

		
	}
