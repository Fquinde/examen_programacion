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
	/**
	 * pree:--
	 * post: crearemos un metodo que con el numero entero que yo le de me saque las palabras con esa longuitud o mayor.
	 * 		primero remplazo las cosas que me puedan molestar con el replaceAll, luego agarro cada bloque de espacio en espacio,
	 * 		luego creo un for que me recorra de bloque en bloque hasta completar la linea y comparar si es mayor o menor que la longuitud enviada 
	 * 		si es mayor lo mostraremos por pantalla y nos aparecera un contador diciendo cuantas palabras a sido posible encontrar.
	 */
	public static void palabrasMasLargasQue(int longitud) {
		String fichero1="C:/Users/quind/Downloads/textoExamen.txt";
		File file = new File (fichero1);
		int contador = 0;
		try {
			Scanner f = new Scanner(file);
			while(f.hasNextLine()) {
				String linea = f.nextLine();
				linea = linea.replaceAll("\\(","").replaceAll("\\.", "").replaceAll("\"", "").replaceAll(",", "")
                        .replaceAll("\\)", "").replaceAll(",", "").replaceAll("\"", "");
				String[] lineaSep = linea.split(" ");
				for(int i=0; i<lineaSep.length; i++) {
					if(lineaSep[i].length() >=longitud) {
						contador++;
						System.out.println(lineaSep[i]);
					}
				}
			}
			System.out.println("Palabras encontradas:" + contador);
		}catch(FileNotFoundException e){
		}
	}

}
