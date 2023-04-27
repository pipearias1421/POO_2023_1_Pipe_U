package gradebook;

public class gradeBook {
	
	
	private String courseName;
	
	public gradeBook() {	
	}
	
	
	public gradeBook(String courseName) {
		this.courseName = courseName;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public void displayMessage() {
		System.out.println("Bienvenido a la planilla de notas " + getCourseName());
		System.out.println("imprimir numero de estudiantes ");
	}
		
	


}
