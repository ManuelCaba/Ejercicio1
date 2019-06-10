package Resguardos;

import java.util.GregorianCalendar;

import Enums.EnumPresentacion;
import clases.ProductoImpl;

public class ResguardosGestoraAlmacen {
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
		System.out.println("El método listarProductosFabricante se encuentra en resguardo");
	}
	
	/*
	 * Método que lista por pantalla los productos con fecha de caducidad
	 * posterior a la fecha elegida por el usuario
	 * Signatura: public void listarProductosCaducidad(String rutaFichero, String fecha)
	 * Entradas:
	 * 		- String rutaFichero
	 * 		- String fecha
	 * Precondiciones:
	 * 		- rutaFichero debe apuntar correctamente al fichero deseado y no puede estar vacío
	 * Salidas: No hay, solo imprime por pantalla
	 * Postcondiciones: Se mostrará un listado de los productos que no estén caducados en
	 * la fecha elegia por el usuario
	 */
	public void listarProductosCaducidad(String rutaFichero, String fecha)
	{
		System.out.println("El método listarProductosCaducidad se encuentra en resguardo");
	}
	
	/*
	 * Método que muestra por pantalla el total (en euros) de todos los productos del almacén
	 * Signatura: public void imprimirPrecioTotal(String rutaFichero)
	 * Entradas:
	 * 		- String rutaFichero
	 * Precondiciones:
	 * 		- rutaFichero debe apuntar correctamente al fichero deseado y no puede estar vacío
	 * Salidas: No hay
	 * Postcondiciones: Se mostrará por pantalla el total (en euros) de todos los productos del almacén
	 */
	public void imprimirPrecioTotal(String rutaFichero)
	{
		System.out.println("El método imprimirPrecioTotal se encuentra en resguardo");
	}
	
	/*
	 * Método que muestra por pantalla los productos según su presentación
	 * Signatura: public int mostrarProductosPresentacion(String rutaFichero, EnumPresentacion presentacion)
	 * Entradas:
	 * 		- String rutaFichero
	 * 		- EnumPresentacion presentacion
	 * Precondiciones:
	 * 		- rutaFichero debe apuntar correctamente al fichero deseado y no puede estar vacío
	 * 		- presentacion debe haber sido validado anteriormente
	 * Salidas: 
	 * 		- int total
	 * Postcondiciones: Se devolverá el total de productos cuya presentacion ha elegido el usuario
	 * asociado al nombre
	 */
	public int mostrarProductosPresentacion(String rutaFichero, EnumPresentacion presentacion)
	{
		System.out.println("El método mostrarProductosPresentacion se encuentra en resguardo");
		
		return 0;
	}
	
	/*
	 * Método que añade un objeto ProductoImpl en el fichero Almacen
	 * Signatura: public void anhadirProducto(ProductoImpl producto, String rutaFichero)
	 * Entradas:
	 * 		- ProductoImpl producto
	 * 		- String rutaFichero
	 * Precondiciones:
	 * 		- El objeto ProductoImpl producto debe ser válido
	 * Salidas: No hay
	 * Postcondiciones: Si el fichero que referencia rutaFichero existe se introducirá 
	 * 					un String con el registro del objeto pasado por parámetros, en 
	 * 					caso contrario se lanzará una excepción FileNotFoundException
	 */
	public void anhadirProducto(ProductoImpl producto, String rutaFichero)
	{
		System.out.println("El método anhadirProducto se encuentra en resguardo");
	}
}
