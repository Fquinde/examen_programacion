package examen_programacion2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main (String[]args) {
		String fichero1="C:/Users/quind/Downloads/ventasVideojuegos.csv";
		informacion_videojuego(fichero1);
		
	}
	/**
	 * pree: --
	 * post: creo un metodo llamado informacion_videojuego, donde creare un arraylist y almacenare las consolas,
	 * 		le paso el fichero por donde lo leeremos y revisaremos, pero me salto a primera linea que no me da
	 * 		 nada de datos necesarios con un if, luego almaceno  cada bloque en un String que me agarre de coma hasta comas.
	 * 		en la siguiente condicion digo si en el arraylist de tipoconsolas no tienen ninguna lista que cree una con el 
	 * 		parametro que yo le doy en este caso el parametro es la consola si en tipo consolosa no existe nada se crea uno
	 * 		 y se le añade, en el siguiente if comparamos la lista de tipoconsolas con una consola y si esta no entramos
	 * 		 y no esta se crea.
	 */
	public static void informacion_videojuego(String fichero1) {
		ArrayList <String> tipoconsolas = new ArrayList <String>();
		File file = new File (fichero1);
		try {
			Scanner f = new Scanner(file);
			int i=0;
			while(f.hasNextLine()) {
				String linea = f.nextLine();
				if(i !=0){
					String[] lineaSep = linea.split(",");
						if(tipoconsolas.isEmpty()) {
							tipoconsolas.add(lineaSep[2]);
						}else if (!tipoconsolas.contains(lineaSep[2])){
							tipoconsolas.add(lineaSep[2]);
	                    }
				}i++;
			}
			System.out.println(tipoconsolas);
			}
			catch(FileNotFoundException e){
		}
	}

}
