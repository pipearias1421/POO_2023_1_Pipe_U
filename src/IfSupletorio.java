import java.util.Scanner;

public class IfSupletorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1=0;
		int nota2=0;
		int definitiva=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor ingrese la nota del primer timestre \n");
		nota1=entrada.nextInt();
		
		System.out.println("Por favor ingrese la nota del segundo trimestre \n");
		nota2=entrada.nextInt();
		
		definitiva=nota1 + nota2;
		if(definitiva>=7) {
			System.out.println("Aprueba la materia");
		}else if(definitiva>=5 && definitiva<7) {
			System.out.println("Supletorio");
			}else {
				System.out.println("no apruebas");
			}
	}

}
