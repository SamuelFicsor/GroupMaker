import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class fillingStudentNames 
	{
		static Scanner file;
		static ArrayList <Student> studentNames = new ArrayList <Student>();

		public static void fillingStudentNames() throws IOException
		{
			file = new Scanner(new File("StudentList.txt"));
			
			int counter = 0;
			
			while(file.hasNext())
				{
					counter++;
					String name = file.nextLine();
					studentNames.add(new Student(name, 0, 0, 0));
				}
		}
		
	}
