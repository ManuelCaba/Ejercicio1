package Gestoras;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GestoraAlmacen {
	/*
	 * Método que imprime por pantalla los productos de un mismo fabricante
	 * Signatura: public void listarProductosFabricante(String rutaFichero, String nombreFabricante)
	 * Entradas:
	 * 		- String rutaFichero
	 * Precondiciones:
	 * 		- rutaFichero debe apuntar correctamente al fichero deseado y no puede estar vacío
	 * Salidas: No hay, solo imprime por pantalla
	 * Postcondiciones: Imprimirá por pantalla todos los producto del fabricante,
	 *  si no hay ningún fabricante con algún producto no se imprimirá nada.
	 */
	public void listarProductosFabricante(String rutaFichero, String nombreFabricante)
	{
		BufferedReader br = null;
		String linea = null;
		String camposProducto[];		
		try {
			br = new BufferedReader(new FileReader(rutaFichero));
			
			linea = br.readLine();
			
			while(linea != null)
			{
				camposProducto = linea.split(",");
				
				if(camposProducto[1].equals(nombreFabricante))
				{
					System.out.println(linea);
				}
				
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
