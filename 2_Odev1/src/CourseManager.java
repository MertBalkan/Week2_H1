public class CourseManager 
{
	public void addStudentToTheCourse(Student student, Course course) 
	{
		System.out.println(student.studentName + " has been added to the " + course.courseName);
	}
	public void deleteStudentFromCourse(Student student, Course course) 
	{
		System.out.println(student.studentName + " has been deleted from the " + course.courseName);
	}
}
