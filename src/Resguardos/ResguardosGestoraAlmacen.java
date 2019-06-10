package Resguardos;

import java.util.GregorianCalendar;

import Enums.EnumPresentacion;
import clases.ProductoImpl;

public class ResguardosGestoraAlmacen {
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
		System.out.println("El m�todo listarProductosFabricante se encuentra en resguardo");
	}
	
	/*
	 * M�todo que lista por pantalla los productos con fecha de caducidad
	 * posterior a la fecha elegida por el usuario
	 * Signatura: public void listarProductosCaducidad(String rutaFichero, String fecha)
	 * Entradas:
	 * 		- String rutaFichero
	 * 		- String fecha
	 * Precondiciones:
	 * 		- rutaFichero debe apuntar correctamente al fichero deseado y no puede estar vac�o
	 * Salidas: No hay, solo imprime por pantalla
	 * Postcondiciones: Se mostrar� un listado de los productos que no est�n caducados en
	 * la fecha elegia por el usuario
	 */
	public void listarProductosCaducidad(String rutaFichero, String fecha)
	{
		System.out.println("El m�todo listarProductosCaducidad se encuentra en resguardo");
	}
	
	/*
	 * M�todo que muestra por pantalla el total (en euros) de todos los productos del almac�n
	 * Signatura: public void imprimirPrecioTotal(String rutaFichero)
	 * Entradas:
	 * 		- String rutaFichero
	 * Precondiciones:
	 * 		- rutaFichero debe apuntar correctamente al fichero deseado y no puede estar vac�o
	 * Salidas: No hay
	 * Postcondiciones: Se mostrar� por pantalla el total (en euros) de todos los productos del almac�n
	 */
	public void imprimirPrecioTotal(String rutaFichero)
	{
		System.out.println("El m�todo imprimirPrecioTotal se encuentra en resguardo");
	}
	
	/*
	 * M�todo que muestra por pantalla los productos seg�n su presentaci�n
	 * Signatura: public int mostrarProductosPresentacion(String rutaFichero, EnumPresentacion presentacion)
	 * Entradas:
	 * 		- String rutaFichero
	 * 		- EnumPresentacion presentacion
	 * Precondiciones:
	 * 		- rutaFichero debe apuntar correctamente al fichero deseado y no puede estar vac�o
	 * 		- presentacion debe haber sido validado anteriormente
	 * Salidas: 
	 * 		- int total
	 * Postcondiciones: Se devolver� el total de productos cuya presentacion ha elegido el usuario
	 * asociado al nombre
	 */
	public int mostrarProductosPresentacion(String rutaFichero, EnumPresentacion presentacion)
	{
		System.out.println("El m�todo mostrarProductosPresentacion se encuentra en resguardo");
		
		return 0;
	}
	
	/*
	 * M�todo que a�ade un objeto ProductoImpl en el fichero Almacen
	 * Signatura: public void anhadirProducto(ProductoImpl producto, String rutaFichero)
	 * Entradas:
	 * 		- ProductoImpl producto
	 * 		- String rutaFichero
	 * Precondiciones:
	 * 		- El objeto ProductoImpl producto debe ser v�lido
	 * Salidas: No hay
	 * Postcondiciones: Si el fichero que referencia rutaFichero existe se introducir� 
	 * 					un String con el registro del objeto pasado por par�metros, en 
	 * 					caso contrario se lanzar� una excepci�n FileNotFoundException
	 */
	public void anhadirProducto(ProductoImpl producto, String rutaFichero)
	{
		System.out.println("El m�todo anhadirProducto se encuentra en resguardo");
	}
}
