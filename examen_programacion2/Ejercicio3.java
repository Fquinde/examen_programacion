package examen_programacion2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main (String[]args) {
		String fichero1="C:/Users/quind/Downloads/ventasVideojuegos.csv";
		informacion_videojuego(fichero1);
		
	}
	public static void informacion_videojuego(String fichero1) {
		File file = new File (fichero1);
		int contador = 0;
		try {
			Scanner f = new Scanner(file);
			int i=0;
			while(f.hasNextLine()) {
				String linea = f.nextLine();
				if(i !=0) {
					String[] lineaSep = linea.split(";");
					for(int x=0; x<lineaSep.length; x++) {
						System.out.println("entro");
						if(lineaSep[5].equalsIgnoreCase("Nintendo")) {
							contador ++;
							System.out.println(lineaSep[i]);
						}
					}	
				}i++;
			}
		}catch(FileNotFoundException e){
		}
	}

}
