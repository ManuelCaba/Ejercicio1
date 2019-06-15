package Gestoras;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Enums.EnumPresentacion;
import clases.ProductoImpl;

public class GestoraAlmacen {
	/*
	 * M�todo que imprime por pantalla los productos de un mismo fabricante
	 * Signatura: public void listarProductosFabricante(String fichero, String nombreFabricante)
	 * Entradas:
	 * 		- String fichero
	 * 		- String nombreFabricante
	 * Precondiciones: No hay
	 * Salidas: No hay, solo imprime por pantalla
	 * Postcondiciones: Si el fichero existe se imprimir� por pantalla todos los producto del fabricante 
	 * 					cuyo nombre se ha pasado por par�metros, en caso contrario se lanzar� una 
	 *					excepci�n FileNotFoundException
	 */
	public void listarProductosFabricante(String fichero, String nombreFabricante)
	{
		BufferedReader br = null;
		String linea = null;
		String camposProducto[];		
		try {
			br = new BufferedReader(new FileReader(fichero));
			
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
	
	/*
	 * M�todo que lista por pantalla los productos con fecha de caducidad posterior a 
	 * la fecha elegida por el usuario
	 * Signatura: public void listarProductosCaducidad(String fichero, String fecha)
	 * Entradas:
	 * 		- String fichero
	 * 		- String fecha
	 * Precondiciones:
	 * 		- fecha debe ser una fecha v�lida
	 * Salidas: No hay, solo imprime por pantalla
	 * Postcondiciones: Si el fichero existe se mostrar� un listado de los productos que no 
	 * 					est�n caducados en la fecha elegida por el usuario, en caso 
	 * 					contrario se lanzar� una excepci�n FileNotFoundException
	 */
	public void listarProductosCaducidad(String fichero, String fecha)
	{
		BufferedReader br = null;
		String linea = null;
		String camposProducto[];
		String[] camposFechaLeido;
		String[] camposFecha;
		int dia;
		int mes;
		int anho;
		int diaLeido;
		int mesLeido;
		int anhoLeido;
		
		camposFecha = fecha.split("/");
		dia = Integer.parseInt(camposFecha[0]);
		mes = Integer.parseInt(camposFecha[1]);
		anho = Integer.parseInt(camposFecha[2]);
		
		try {
			br = new BufferedReader(new FileReader(fichero));
			
			linea = br.readLine();
			
			while(linea != null)
			{
				camposProducto = linea.split(",");
				
				camposFechaLeido = camposProducto[2].split("/");
				
				diaLeido = Integer.parseInt(camposFechaLeido[0]);
				mesLeido = Integer.parseInt(camposFechaLeido[1]);
				anhoLeido = Integer.parseInt(camposFechaLeido[2]);

				
				if(anhoLeido > anho)
				{
					System.out.println(linea);
				}
				else if(anhoLeido == anho)
				{
					if(mesLeido > mes)
					{
						System.out.println(linea);
					}
					else if(mesLeido == mes)
					{
						if(diaLeido >= dia)
						{
							System.out.println(linea);
						}
					}
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
	
	/*
	 * M�todo que muestra por pantalla el total (en euros) de todos los productos del almac�n
	 * Signatura: public void imprimirPrecioTotal(String fichero)
	 * Entradas:
	 * 		- String fichero
	 * Precondiciones: No hay
	 * Salidas: No hay
	 * Postcondiciones: Si el fichero existe se mostrar� por pantalla el total (en euros) de todos 
	 * 					los productos del almac�n, en caso contrario se lanzar� una excepci�n 
	 * 					FileNotFoundException
	 */
	public void imprimirPrecioTotal(String fichero)
	{
		BufferedReader br = null;
		String linea = null;
		String camposProducto[];
		double precioLeido;
		double precioTotal = 0;
		
		try {
			br = new BufferedReader(new FileReader(fichero));
			
			linea = br.readLine();
			
			while(linea != null)
			{
				camposProducto = linea.split(",");
				
				precioLeido = Double.parseDouble(camposProducto[3]);
				
				precioTotal += precioLeido;
				
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
		
		System.out.println("El precio total es: "+precioTotal);
	}
	
	/*
	 * M�todo que muestra por pantalla los productos seg�n su presentaci�n
	 * Signatura: public void mostrarTotalProductosPresentacion(String fichero, EnumPresentacion presentacion)
	 * Entradas:
	 * 		- String fichero
	 * 		- EnumPresentacion presentacion
	 * Precondiciones:
	 * 		- presentacion debe haber sido validado anteriormente
	 * Salidas: 
	 * 		- int total
	 * Postcondiciones: Si el fichero existe se mostrar� el total de productos cuya presentacion ha elegido 
	 * 					el usuario asociado al nombre, en caso contrario se lanzar� una excepci�n 
	 * 					FileNotFoundException
	 */
	public void mostrarTotalProductosPresentacion(String fichero, EnumPresentacion presentacion)
	{
		BufferedReader br = null;
		String linea = null;
		String camposProducto[];
		String presentacionLeido;
		int contador = 0;
		
		try {
			br = new BufferedReader(new FileReader(fichero));
			
			linea = br.readLine();
			
			while(linea != null)
			{
				camposProducto = linea.split(",");
				
				presentacionLeido = camposProducto[4];
				
				if(presentacionLeido.equals(presentacion.toString()))
				{
					contador++;
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
		
		System.out.println("Total de productos con presentacion "+presentacion.toString()+": "+contador);
	}
	
	/*
	 * M�todo que a�ade un objeto ProductoImpl en el fichero Almacen
	 * Signatura: public void anhadirProducto(ProductoImpl producto, String fichero)
	 * Entradas:
	 * 		- ProductoImpl producto
	 * 		- String fichero
	 * Precondiciones:
	 * 		- El objeto ProductoImpl producto debe ser v�lido
	 * Salidas: No hay
	 * Postcondiciones: Si el fichero existe se introducir� un String con el registro del 
	 * 					objeto pasado por par�metros, en caso contrario se lanzar� una 
	 * 					excepci�n FileNotFoundException
	 */
	public void anhadirProducto(ProductoImpl producto, String fichero)
	{
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(fichero, true));
			
			bw.write(producto.toString());
			
			bw.newLine();
			
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
	 * M�todo que elimina un registro de un Producto del fichero Productos seg�n su c�digo de barras
	 * Signatura: public void eliminarProducto(String codigoBarras, String fichero)
	 * Entradas: 
	 * 		- String codigoBarras
	 * 		- String fichero
	 * Precondiciones:
	 * 		- codigoBarras debe ser un c�digo de barras v�lido
	 * Salidas: No hay
	 * Postcondiciones: Si el fichero existe se eliminar� el registro de Producto cuyo c�digo de barras
	 * 					coincida con el que se ha pasado por par�metros, en caso contrario se lanzar� 
	 * 					una excepci�n FileNotFoundException
	 */
	public void eliminarProducto(String codigoBarras, String fichero)
	{
		BufferedReader br = null;
		BufferedWriter bw = null;
		String linea = null;
		String camposProducto[];
		String codigoBararsLeido;
		
		try {
			br = new BufferedReader(new FileReader(fichero));
			bw = new BufferedWriter(new FileWriter())
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
			
	
}
