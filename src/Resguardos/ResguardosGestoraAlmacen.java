package Resguardos;

import Enums.EnumPresentacion;
import clases.ProductoImpl;

public class ResguardosGestoraAlmacen {
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
		System.out.println("El m�todo listarProductosFabricante se encuentra en resguardo");
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
		System.out.println("El m�todo listarProductosCaducidad se encuentra en resguardo");
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
		System.out.println("El m�todo imprimirPrecioTotal se encuentra en resguardo");
	}
	
	/*
	 * M�todo que muestra por pantalla el total de productos seg�n su presentaci�n
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
		System.out.println("El m�todo mostrarProductosPresentacion se encuentra en resguardo");
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
		System.out.println("El m�todo anhadirProducto se encuentra en resguardo");
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
		System.out.println("El m�todo eliminarProducto se encuentra en resguardo");
	}
}
