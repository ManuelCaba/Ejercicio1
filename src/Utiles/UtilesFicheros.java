package Utiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UtilesFicheros {
	/*
	 * Método que ordena un fichero según ordenación híbrida
	 * Signatura: public void ordenarFicheroHibrida(String rutaFichero)
	 * Entradas: 
	 * 		- String rutaFichero
	 * Precondiciones: No hay
	 * Salidas: No hay
	 * Postcondiciones: Si el fichero que referencia rutaFichero existe se ordenará, en 
	 * 					caso contrario se lanzará una excepción FileNotFoundException
	 */
	public void ordenarFicheroHibrida(String rutaFichero)
	{
		String[] arrayFichero = volcarFicheroArray(rutaFichero);
		ordenacionBurbuja(arrayFichero);
		volcarArrayFichero(rutaFichero, arrayFichero);
	}
	
	/*
	 * Método que vuelca un fichero en un array
	 * Signatura: public String[] volcarFicheroArray(String rutaFichero)
	 * Entradas: 
	 * 		- String rutaFichero
	 * Precondiciones: No hay
	 * Salidas:
	 * 		- String[] fichero
	 * Postcondiciones: Si el fichero que referencia rutaFichero existe se devolverá 
	 * 					asociado al nombre un array de string con los registros, en 
	 * 					caso contrario se lanzará una excepción FileNotFoundException
	 */
	public String[] volcarFicheroArray(String rutaFichero)
	{
		BufferedReader br = null;
		String linea = null;
		String[] fichero = null;
		ArrayList<String> ficheroList = new ArrayList<String>();
		
		try {
			br = new BufferedReader(new FileReader(rutaFichero));
			
			linea = br.readLine();
			
			while(linea != null)
			{
				ficheroList.add(linea);
				
				linea = br.readLine();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		fichero = new String[ficheroList.size()];
		
		for(int i = 0; i < fichero.length; i++)
		{
			fichero[i] = ficheroList.get(i);
		}
		
		return fichero;
	}
	
	/*
	 * Método que ordena un array por burbuja
	 * Signatura: public void ordenacionBurbuja(String[] array)
	 * Entradas/Salidas: String[] array
	 * Precondiciones: No hay
	 * Postcondiciones: Se ordenará el array, si el array está vacío se 
	 * 					quedará igual 
	 */
	public void ordenacionBurbuja(String[] array)
	{
		String[] camposRegistro1;
		String[] camposRegistro2;
		String aux;
		
		for(int i = 0; i < array.length - 1; i++)
		{
			for(int j = 0; j < array.length - 1; j++)
			{
				camposRegistro1 = array[j].split(",");
				camposRegistro2 = array[j+1].split(",");
				
				if(camposRegistro1[0].compareTo(camposRegistro2[0]) > 0)
				{
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}	
			}
		}
	}
	
	/*
	 * Método que vuelca un array de string en un fichero
	 * Signatura: public void volcarArrayFichero(String rutaFichero)
	 * Entradas:
	 * 		- String[] array;
	 * 		- String rutaFichero;
	 * Precondiciones: No hay
	 * Salidas: No hay
	 * Postcondciones: Si el fichero que referencia rutaFichero existe se volcará el 
	 * 				   array en el fichero, en caso contrario se lanzará una 
	 * 				   excepción FileNotFoundException
	 */
	public void volcarArrayFichero(String rutaFichero, String[] array)
	{
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(rutaFichero));
			
			for(int i = 0; i < array.length; i++)
			{
				bw.write(array[i]+"\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * Método que lista un fichero
	 * Signatura: public void listarFichero(String rutaFichero)
	 * Entradas: - String rutaFichero
	 * Precondiciones: No hay
	 * Salidas: No hay, solo imprime en pantalla
	 * Postcondiciones: Si el fichero que referencia rutaFichero existe se imprimirá 
	 * 					por pantalla un listado de todos los registros del fichero, 
	 * 					en caso contrario se lanzará una excepción 
	 * 					FileNotFoundException
	 */
	public void listarFichero(String rutaFichero)
	{
		BufferedReader br = null;
		String linea = null;
		
		try {
			br = new BufferedReader(new FileReader(rutaFichero));
			
			linea = br.readLine();
			
			while(linea != null)
			{
				System.out.println(linea);
				
				linea = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
