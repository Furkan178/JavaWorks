
public class InstructorManager {
	Instructor instructor1;
	Instructor instructor2;
	
	public void addInstructor() {
		
		
		instructor1=new Instructor(1,"Engin Demirog","Programlama",true);
		instructor2=new Instructor(2,"Muhammed Furkan AVCI","Programlama",false);
		
	}
	
	
	public void listInstructor() {
		Instructor[] instructors= {instructor1,instructor2} ;
		
		System.out.println("\nAKTİF EĞİTMENLER");
		for (Instructor instructor:instructors) {
			if (instructor.active == true) {
				System.out.println("Instructor ID :"+instructor.ınstructorId+"\nInstructor Name :"+instructor.ınstructorName
						+"\nInstructor Category :"+instructor.ınstructorCategory+"\nInstructor active :True");
			}
		}
		
		System.out.println("\nPASİF EĞİTMENLER");
		for (Instructor instructor:instructors) {
			if (instructor.active == false) {
				System.out.println("Instructor ID :"+instructor.ınstructorId+"\nInstructor Name :"+instructor.ınstructorName
						+"\nInstructor Category :"+instructor.ınstructorCategory+"\nInstructor active :False");
			}
		}
	}
}

