public class Main {

	public static void main(String[] args) 
	{
		Student student1 = new Student(1, "Mert");
		Student student2 = new Student(2, "Osman");
		Student student3 = new Student(3, "Ali");
		
		Student[] students = {student1, student2, student3};
		
		Course course1 = new Course(1, "C# + ANGULAR", "Engin Demirog");
		Course course2 = new Course(2, "JAVA + REACT", "Engin Demirog");		
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.addStudentToTheCourse(student1, course1);
		courseManager.addStudentToTheCourse(student2, course1);
		courseManager.addStudentToTheCourse(student3, course2);
		
		for(Student student : students) 
			System.out.println(student.studentName + " listede");

		courseManager.deleteStudentFromCourse(student1, course1);
		courseManager.deleteStudentFromCourse(student2, course1);
		courseManager.deleteStudentFromCourse(student3, course2);
	}

}