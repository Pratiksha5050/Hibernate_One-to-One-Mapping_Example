
	

import net.hibernate.map.InstuctorDao.InstructorDao;
import net.hibernate.map.instructor.Instructor;
import net.hibernate.map.instructor.InstructorDetail;
	

	public class App {
	    public static void main(String[] args) {


			Instructor instructor = new Instructor("Madhu", "Patel", "madhu@luv2code.com");

			InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "Guitar");

			// associate the objects
			instructor.setInstructorDetail(instructorDetail);

			InstructorDao instructorDao = new InstructorDao();
			instructorDao.saveInstructor(instructor);
	    }
	}
