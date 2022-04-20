import java.util.ArrayList;

public class Filler
	{
		//here im going to take the students from the arraylist made from the text file
		//then im going to go through each student twice (nested for loop)
		//it will be on one person then check all other people to see if they have the same numbers
	
		public static void makeProjectOneGroups()
			{
				 
				int count =0;
			
				for(int j = 0; j < (fillingStudentNames.studentNames.size()/driver.medianSize); j++)
					{
		  			for(int i = 0; i < driver.medianSize; i++)
		  			{
		  					fillingStudentNames.studentNames.get(count).setProjectOneGroup(j+1);
		  					count++;
		  			}		
					}
				
			}
		
		public static void makeProjectTwoGroups()
			{

				 
				int count = fillingStudentNames.studentNames.size()/driver.medianSize;;
				
				int count2 = count;
				
				int studentCount  = 0;
				
			
				
				
				while(studentCount < fillingStudentNames.studentNames.size() )
					{
						fillingStudentNames.studentNames.get(studentCount).setProjectTwoGroup(count);
						
						count--;
						studentCount++;
						
						if(count == 0)
							{
								count = count2;
							}
						
					}
			
			}
		
		public static void makeProjectThreeGroups()
			{
				int count = fillingStudentNames.studentNames.size()/driver.medianSize;;
				
				int count2 = count;
				
				for(Student s: fillingStudentNames.studentNames)
					{
						int i = (int) (Math.random() + 1) * count2;
						
						s.setProjectThreeGroup(i);
					}
				
				
			}
		
		
	}


