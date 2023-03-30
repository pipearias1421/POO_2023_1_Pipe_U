
import java.util.Scanner;

public class gradeBooktTest_ {

	public static void main(String[] args) {
		

		Scanner nombreCurso = new Scanner(System.in);
			
		gradeBook planillaNotas = new gradeBook();
		
		//System.out.println("El nombre del curso (antes de la asignacion) es : /n" + planillaNotas.getCourseName());
		
		System.out.println("Por favor ingrese el nombre del curso /n: ");	
		String nombreEntradaCurso = nombreCurso.nextLine();
		planillaNotas.setCourseName(nombreEntradaCurso);
		
		//System.out.println("El nuevo mobre del curso es : " + planillaNotas.getCourseName());
		planillaNotas.displayMessage();
		
		
		
		
		//planillaNotas.displayMessage("POO ucaldas 2023-1");
	}


}
