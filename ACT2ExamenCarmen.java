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
		System.out.println("5. Volumen esfera.");
		System.out.println("6. Salir");
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
		else if (opc == 2) {
			System.out.print("Radio: ");
			int radio = sc.nextInt();
			double areaCirculo = 3.1416 * radio*radio;
			System.out.print("El área del círculo es: "+ areaCirculo);
			
			
		}
		else if (opc == 3) {
			System.out.print("Radio: ");
            double r = sc.nextDouble();

            System.out.print("Generatriz: ");
            double g = sc.nextDouble();

            System.out.println("El área del cono es: " + (3.1416 * r * (r + g)));
            
        }
		else if (opc == 4) {
			System.out.print("Radio: ");
            double rc = sc.nextDouble();

            System.out.print("Altura: ");
            double h = sc.nextDouble();

            System.out.println("El área del cilindro es: " + (2 * 3.1416 * rc * (rc + h)));
        }
		
		else if (opc == 5) {
			System.out.print("Radio: ");
            double re = sc.nextDouble();
            double volumen = (4 / 3) * 3.1416 * Math.pow(re, 3);

            System.out.println("El volumen de la esfera es: " + volumen);

		} 
		else if (opc == 6) {
            System.out.println("Hasta pronto!");
            

		} else {
            System.out.println("Introduce una opcón válida (1-6)");

		}
		
		sc.close();
	}
}

