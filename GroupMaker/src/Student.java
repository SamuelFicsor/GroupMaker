import java.util.ArrayList;

public class Student
	{
		String name;
	// ArrayList<Integer> groups = new ArrayList<Integer>();
		int projectOneGroup;
		int projectTwoGroup;
		int projectThreeGroup;
		
		public Student(String n, int one, int two, int three)
		{
			name = n;
			// groups = g;
			projectOneGroup = one;
			projectTwoGroup = two;
			projectThreeGroup = three;
			
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getProjectOneGroup()
			{
				return projectOneGroup;
			}

		public void setProjectOneGroup(int projectOneGroup)
			{
				this.projectOneGroup = projectOneGroup;
			}

		public int getProjectTwoGroup()
			{
				return projectTwoGroup;
			}

		public void setProjectTwoGroup(int projectTwoGroup)
			{
				this.projectTwoGroup = projectTwoGroup;
			}

		public int getProjectThreeGroup()
			{
				return projectThreeGroup;
			}

		public void setProjectThreeGroup(int projectThreeGroup)
			{
				this.projectThreeGroup = projectThreeGroup;
			}

//		public ArrayList<Integer> getGroups()
//			{
//				return groups;
//			}
//
//		public void setGroups(ArrayList<Integer> groups)
//			{
//				this.groups = groups;
//			}
	}
