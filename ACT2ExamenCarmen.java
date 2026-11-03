package EXAMENGIT2;
import java.util.Scanner;

public class ACT2ExamenCarmen {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		
		System.out.println("\n===== MENÚ DE OPCIONES =====");
		System.out.println("1. Área triángulo.");
		System.out.println("2. Área círculo.");
		System.out.println("3. Área del cono.");
		System.out.println("4. Área del cilindro.");
		System.out.println("5. Salir");
		System.out.println("=============================");
		System.out.print("Elige una opción: ");
		int opc = sc.nextInt();
		sc.nextLine();
			
			
		if (opc == 1) {
			System.out.print("Base: ");
            double base = sc.nextDouble();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            System.out.println("El área del triángulo es: " + (base * altura / 2));
            

			}
		sc.close();
	}
}

