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
				
				for(Student s: fillingStudentNames.studentNames)
					{
						System.out.println(s.getProjectOneGroup());
						System.out.println(s.getName() + "\n");
					}	
				
			
			}
		
		public static void makeProjectTwoGroups()
			{

				 
				int count =0;
				
				int count2  = 0;
				
				int groupCount = fillingStudentNames.studentNames.size()/driver.medianSize;
				
				
				
				
				for(int i =0; i<fillingStudentNames.studentNames.size(); i++)
					{
						fillingStudentNames.studentNames.get(groupCount).setProjectTwoGroup(count2);
						
						count ++;
						
						if(count == 4)
							{
								count =0;
								count2++;
								groupCount--;
							}
					}
			

				
				for(Student s: fillingStudentNames.studentNames)
					{
						System.out.println(s.getProjectTwoGroup());
						System.out.println(s.getName() + "\n");
					}	
			}
		
		
	}


