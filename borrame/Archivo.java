import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Archivo {
	//Nombre|apat|amat|edad|saldo
	public static void main(String[] args) {
		
		Scanner lector;
		String salida;
		
		System.out.println("\n***\n");

		try {
			lector = new Scanner(new File("cuentas.txt"));
			lector.useDelimiter("\\|");
			lector.nextLine();
			while (lector.hasNext()) {
				salida = "Nombre: " + lector.next() + " " + lector.next() + " " + lector.next()
						+ "\nEdad: " + lector.nextInt() + " años"
						+ "\nSaldo: $" + lector.nextInt();
				System.out.println(salida + "\n");
			}
			lector.close();
		} catch(FileNotFoundException fnfe) {
			System.out.println("El archivo no existe. Bye");
		}
		
		System.out.println("\n***\n");
	}
}