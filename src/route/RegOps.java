package route;

public class RegOps
{
	public static Course lookupCourseByName(Course[] catalog, String courseName)
	{
		int index = -1;
        for(int i = 0; i < catalog.length; i++)
        {               
        	if(catalog[i].getName().equals(courseName))
        	{
        		index = i;
        	}
        }

        if(index != -1)
        {
        	Course newCourse = catalog[index];
            return newCourse;
        }
        else
        {
            return null;
        }
		
	}
	
	public static Course[] lookupCoursesByDept(Course[] catalog, int dept)
	{
                
        int index = -1;
        int d = 0;
        for(int j = 0; j < catalog.length; j++)
        {
                if(catalog[j].getDepartment()==dept)
                {
                        d = d + 1;
                       
                }
        }

       
        int c = 0;
        Course[] arrayc = new Course[d];
        for(int i = 0; i < catalog.length; i++)
        {
        	if(catalog[i].getDepartment() == dept)
        	{
            index = i;
            arrayc[c]=catalog[index];
            c++;
        	}
                   
        }

        if(index != -1)
        {
                return arrayc;   
        }else
        {
                return null;
        }
       
	}
	
	
	public static void sortByNumber(Course[] catalog)
	{
		return; // replace this line with your code




	}
	
	public static void sortByTime(Course[] catalog)
	{
		return; // replace this line with your code




	}
	
	
	public static boolean addCourse(Course[] catalog, Course[] mySchedule, int myNumCourses,
			int dept, 
			int courseNum)
		{
			for (int i=0; i < myNumCourses; i++)
	        {
				 if (mySchedule[i].getDepartment() == dept
                         && mySchedule[i].getCourseNumber() == courseNum) 
				 {
	                               if (mySchedule[i]==null)
	                               {
	                                    mySchedule[i]=catalog[i];
													                                            
	                               }
	              }
	                   
	        }
			return true;
	        
		}

	
	public static boolean dropCourse(Course[] mySchedule, int myNumCourses, int dept, int courseNum)
	{
		 for (int i = 0; i < myNumCourses; i++) 
		 {
             if (mySchedule[i].getDepartment() == dept
                             && mySchedule[i].getCourseNumber() == courseNum) 
             {
                     mySchedule[i] = null;
                     Course[] sub;
                     int count = myNumCourses;
                     sub = new Course[count - 1];
                     int add = 0;
                     for (int a = 0; a < sub.length; a++) 
                     {
                             if (mySchedule[add] == null) 
                             {

                                     add++;
                                     a--;
                             } 
                             else 
                             {
                                     sub[a] = mySchedule[add];
                                     add++;

                             }
                     }
                     for (int j = 0; j < sub.length; j++) 
                     {
                             mySchedule[j] = sub[j];
                     }

                     return true;
             }

     }

     return false;




	}

	public static int countCredits(Course[] mySchedule, int myNumCourses)
	{
		int counter = 0;
		
		for (int i = 0; i < mySchedule.length; i++)
		{
			counter += mySchedule[i].getCredits();
		}
		
		if (counter >= 0)
		return counter;
		else
		return 0; 




	}
}
