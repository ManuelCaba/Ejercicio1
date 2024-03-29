package Utiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UtilesFicheros {
	/*
	 * M�todo que ordena un fichero seg�n ordenaci�n h�brida
	 * Signatura: public void ordenarFicheroHibrida(String fichero)
	 * Entradas: 
	 * 		- String fichero
	 * Precondiciones: No hay
	 * Salidas: No hay
	 * Postcondiciones: Si el fichero existe se ordenar�, en caso contrario 
	 * 					se lanzar� una excepci�n FileNotFoundException
	 */
	public void ordenarFicheroHibrida(String fichero)
	{
		String[] arrayFichero = volcarFicheroArray(fichero);
		ordenacionBurbuja(arrayFichero);
		volcarArrayFichero(fichero, arrayFichero);
	}
	
	/*
	 * M�todo que vuelca un fichero en un array
	 * Signatura: public String[] volcarFicheroArray(String fichero)
	 * Entradas: 
	 * 		- String fichero
	 * Precondiciones: No hay
	 * Salidas:
	 * 		- String[] fichero
	 * Postcondiciones: Si el fichero existe se devolver� asociado al nombre un array 
	 * 					de string con los registros, en caso contrario se lanzar� una 
	 * 					excepci�n FileNotFoundException
	 */
	public String[] volcarFicheroArray(String fichero)
	{
		BufferedReader br = null;
		String linea = null;
		String[] arrayFichero = null;
		ArrayList<String> ficheroList = new ArrayList<String>();
		
		try {
			br = new BufferedReader(new FileReader(fichero));
			
			linea = br.readLine();
			
			while(linea != null)
			{
				ficheroList.add(linea);
				
				linea = br.readLine();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		arrayFichero = new String[ficheroList.size()];
		
		for(int i = 0; i < arrayFichero.length; i++)
		{
			arrayFichero[i] = ficheroList.get(i);
		}
		
		return arrayFichero;
	}
	
	/*
	 * M�todo que ordena un array por burbuja
	 * Signatura: public void ordenacionBurbuja(String[] array)
	 * Entradas/Salidas: String[] array
	 * Precondiciones: No hay
	 * Postcondiciones: Se ordenar� el array, si el array est� vac�o se 
	 * 					quedar� igual 
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
	 * M�todo que vuelca un array de string en un fichero
	 * Signatura: public void volcarArrayFichero(String fichero)
	 * Entradas:
	 * 		- String[] array;
	 * 		- String fichero;
	 * Precondiciones: No hay
	 * Salidas: No hay
	 * Postcondciones: Si el fichero existe se volcar� el array en el fichero, 
	 * 				   en caso contrario se lanzar� una excepci�n 
	 * 				   FileNotFoundException
	 */
	public void volcarArrayFichero(String fichero, String[] array)
	{
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(fichero));
			
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
	 * M�todo que lista un fichero
	 * Signatura: public void listarFichero(String fichero)
	 * Entradas: - String fichero
	 * Precondiciones: No hay
	 * Salidas: No hay, solo imprime en pantalla
	 * Postcondiciones: Si el fichero existe se imprimir� por pantalla un listado
	 *					de todos los registros del fichero, en caso contrario se 
	 *					lanzar� una excepci�n FileNotFoundException
	 */
	public void listarFichero(String fichero)
	{
		BufferedReader br = null;
		String linea = null;
		
		try {
			br = new BufferedReader(new FileReader(fichero));
			
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
