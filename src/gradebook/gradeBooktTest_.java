package gradebook;

import java.util.Scanner;

public class gradeBooktTest_ {

	public static void main(String[] args) {
		

		Scanner nombreCurso = new Scanner(System.in);
			
		gradeBook planillaNotasPoo = new gradeBook("Programacion orientada a objetos");
		gradeBook planillaNotasEstructuras = new gradeBook("Estructuras");
		gradeBook planillaNotasPoo2 = new gradeBook("Programacion orientada a objetos 2");
		//System.out.println("El nombre del curso (antes de la asignacion) es : /n" + planillaNotas.getCourseName());
		
		/*
		System.out.println("Por favor ingrese el nombre del curso /n: ");	
		String nombreEntradaCurso = nombreCurso.nextLine();
		planillaNotas.setCourseName(nombreEntradaCurso);
		planillaNotas.displayMessage();
		
		
		System.out.println("ingrese nuevo nombre de curso");
		String nombreEntradaCurso2 = nombreCurso.nextLine();
		planillaNotas.setCourseName(nombreEntradaCurso2);
		
		
		//System.out.println("El nuevo mobre del curso es : " + planillaNotas.getCourseName());
		planillaNotas.displayMessage();
		
		*/
		
		//planillaNotas.displayMessage("POO ucaldas 2023-1");
		planillaNotasPoo.displayMessage();
		
	}


}
