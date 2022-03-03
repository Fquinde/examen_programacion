package examen_programacion2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main (String[]args) {
		Scanner  entrada= new Scanner(System.in);
		System.out.println("Introduzca un numero entero: ");
		int numero=entrada.nextInt();
		palabrasMasLargasQue(numero);
		
	}
	public static void palabrasMasLargasQue(int longitud) {
		String fichero1="C:/Users/quind/Downloads/textoExamen.txt";
		File file = new File (fichero1);
		try {
			Scanner f = new Scanner(file);
			while(f.hasNextLine()) {
				String linea = f.nextLine();
				linea = linea.replaceAll(",","").replaceAll(".", "").replaceFirst("''", "");
				String[] lineaSep = linea.split(" ");
				for(int x=0; x<linea.length(); x++)
				if(lineaSep[x].length()<=longitud) {
					System.out.println(lineaSep[x]);
				}
			}
		}catch(FileNotFoundException e){
		}
	}

}
