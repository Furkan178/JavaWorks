
public class Instructor {
	
	int ınstructorId;
	String ınstructorName;
	String ınstructorCategory;
	boolean active;
	
	public Instructor() {
		System.out.println("Boş olan Instructor constructor'ı çalıştı...");
	}
	public Instructor(int id,String name,String category,boolean active) {
		this();
		ınstructorId=id;
		ınstructorName=name;
		ınstructorCategory=category;
		this.active=active;
		
	}
	
}
