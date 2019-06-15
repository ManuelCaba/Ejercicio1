package Resguardos;

import Enums.EnumPresentacion;
import clases.ProductoImpl;

public class ResguardosGestoraAlmacen {
	/*
	 * Método que imprime por pantalla los productos de un mismo fabricante
	 * Signatura: public void listarProductosFabricante(String fichero, String nombreFabricante)
	 * Entradas:
	 * 		- String fichero
	 * 		- String nombreFabricante
	 * Precondiciones: No hay
	 * Salidas: No hay, solo imprime por pantalla
	 * Postcondiciones: Si el fichero existe se imprimirá por pantalla todos los producto del fabricante 
	 * 					cuyo nombre se ha pasado por parámetros, en caso contrario se lanzará una 
	 *					excepción FileNotFoundException
	 */
	public void listarProductosFabricante(String fichero, String nombreFabricante)
	{
		System.out.println("El método listarProductosFabricante se encuentra en resguardo");
	}
	
	/*
	 * Método que lista por pantalla los productos con fecha de caducidad posterior a 
	 * la fecha elegida por el usuario
	 * Signatura: public void listarProductosCaducidad(String fichero, String fecha)
	 * Entradas:
	 * 		- String fichero
	 * 		- String fecha
	 * Precondiciones:
	 * 		- fecha debe ser una fecha válida
	 * Salidas: No hay, solo imprime por pantalla
	 * Postcondiciones: Si el fichero existe se mostrará un listado de los productos que no 
	 * 					estén caducados en la fecha elegida por el usuario, en caso 
	 * 					contrario se lanzará una excepción FileNotFoundException
	 */
	public void listarProductosCaducidad(String fichero, String fecha)
	{
		System.out.println("El método listarProductosCaducidad se encuentra en resguardo");
	}
	
	/*
	 * Método que muestra por pantalla el total (en euros) de todos los productos del almacén
	 * Signatura: public void imprimirPrecioTotal(String fichero)
	 * Entradas:
	 * 		- String fichero
	 * Precondiciones: No hay
	 * Salidas: No hay
	 * Postcondiciones: Si el fichero existe se mostrará por pantalla el total (en euros) de todos 
	 * 					los productos del almacén, en caso contrario se lanzará una excepción 
	 * 					FileNotFoundException
	 */
	public void imprimirPrecioTotal(String fichero)
	{
		System.out.println("El método imprimirPrecioTotal se encuentra en resguardo");
	}
	
	/*
	 * Método que muestra por pantalla el total de productos según su presentación
	 * Signatura: public void mostrarTotalProductosPresentacion(String fichero, EnumPresentacion presentacion)
	 * Entradas:
	 * 		- String fichero
	 * 		- EnumPresentacion presentacion
	 * Precondiciones:
	 * 		- presentacion debe haber sido validado anteriormente
	 * Salidas: 
	 * 		- int total
	 * Postcondiciones: Si el fichero existe se mostrará el total de productos cuya presentacion ha elegido 
	 * 					el usuario asociado al nombre, en caso contrario se lanzará una excepción 
	 * 					FileNotFoundException
	 */
	public void mostrarTotalProductosPresentacion(String fichero, EnumPresentacion presentacion)
	{
		System.out.println("El método mostrarProductosPresentacion se encuentra en resguardo");
	}
	
	/*
	 * Método que añade un objeto ProductoImpl en el fichero Almacen
	 * Signatura: public void anhadirProducto(ProductoImpl producto, String fichero)
	 * Entradas:
	 * 		- ProductoImpl producto
	 * 		- String fichero
	 * Precondiciones:
	 * 		- El objeto ProductoImpl producto debe ser válido
	 * Salidas: No hay
	 * Postcondiciones: Si el fichero existe se introducirá un String con el registro del 
	 * 					objeto pasado por parámetros, en caso contrario se lanzará una 
	 * 					excepción FileNotFoundException
	 */
	public void anhadirProducto(ProductoImpl producto, String fichero)
	{
		System.out.println("El método anhadirProducto se encuentra en resguardo");
	}
	
	/*
	 * Método que elimina un registro de un Producto del fichero Productos según su código de barras
	 * Signatura: public void eliminarProducto(String codigoBarras, String fichero)
	 * Entradas: 
	 * 		- String codigoBarras
	 * 		- String fichero
	 * Precondiciones:
	 * 		- codigoBarras debe ser un código de barras válido
	 * Salidas: No hay
	 * Postcondiciones: Si el fichero existe se eliminará el registro de Producto cuyo código de barras
	 * 					coincida con el que se ha pasado por parámetros, en caso contrario se lanzará 
	 * 					una excepción FileNotFoundException
	 */
	public void eliminarProducto(String codigoBarras, String fichero)
	{
		System.out.println("El método eliminarProducto se encuentra en resguardo");
	}
}
