package Gestoras;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GestoraAlmacen {
	/*
	 * M�todo que imprime por pantalla los productos de un mismo fabricante
	 * Signatura: public void listarProductosFabricante(String rutaFichero, String nombreFabricante)
	 * Entradas:
	 * 		- String rutaFichero
	 * Precondiciones:
	 * 		- rutaFichero debe apuntar correctamente al fichero deseado y no puede estar vac�o
	 * Salidas: No hay, solo imprime por pantalla
	 * Postcondiciones: Imprimir� por pantalla todos los producto del fabricante,
	 *  si no hay ning�n fabricante con alg�n producto no se imprimir� nada.
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
