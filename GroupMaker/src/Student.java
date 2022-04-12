import java.util.ArrayList;

public class Student
	{
		String name;
		ArrayList<Integer> groups = new ArrayList<Integer>();
		
		public Student(String n, ArrayList g)
		{
			name = n;
			groups = g;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public ArrayList<Integer> getGroups()
			{
				return groups;
			}

		public void setGroups(ArrayList<Integer> groups)
			{
				this.groups = groups;
			}
	}
