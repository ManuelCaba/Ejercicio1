package main;

import java.util.Scanner;

import Enums.EnumPresentacion;
import Gestoras.GestoraAlmacen;
import Resguardos.ResguardosGestoraAlmacen;
import Resguardos.ResguardosUtilesFicheros;
import Utiles.UtilesFicheros;
import Validaciones.Validaciones;
import clases.ProductoImpl;

/*
 * Programa GestionAlmacen
 * 
 * Programa que gestiona un almacen de productos farmacéuticos
 * 
 * Entradas: Opciones del menu principal y opciones de menus impresion, calculos y gestion
 * 			 Objeto ProdcutoImpl
 * 
 * Salidas: Mensajes de ayuda al usuario, Menus, listados de productos
 * 
 * Restricciones: la opcion del menú principal debe ser un número entre 0 y 3
 * 				  la opcion del menú calculos debe ser un número entre 0 y 3
 * 				  la opcion del menú impresion debe ser un número entre 0 y 3
 * 				  la opcion del menú gestion debe ser un número entre 0 y 2
 * 				  el objeto ProductoImpl debe ser válido
 * 
 * PG
 * Inicio
 * 	mostrarMenuPrincipalYLeerYValidarOpcion*
 * 	mientras opcion sea un numero entre 1 y 3
 * 	 	Segun opcion
 * 			caso 1
 * 				menuImpresion
 * 			caso 2
 * 				menuCalculos
 * 			caso 3
 * 				menuGestion
 * 		Fin_Segun
 * 		mostrarMenuPrincipalYLeerYValidarOpcion*
 * 	Fin_Mientras
 * Fin
 * 
 * menuImpresion
 * Inicio
 * 	mostrarMenuImpresionYLeerYValidarOpcion*
 *  mientras opcion sea un numero entre 1 y 3
 *  	Segun opcion
 *  		caso 1
 *  			listarProductosFabricante
 *  		caso 2
 *  			listarProductosCaducidad
 *  		caso 3
 *  			imprimirPrecioTotal*
 *  	Fin_Segun
 *  	mostrarMenuImpresionYLeerYValidarOpcion*
 *  Fin_Mientras			
 * Fin
 * 
 * menuCalculos
 * Inicio
 * 	mostrarMenuCalculosYLeerYValidarOpcion*
 * 	mientras opcion sea un numero entre 1 y 3
 *  	Segun opcion
 *  		caso 1
 *  			mostrarProductosComprimidos*
 *  		caso 2
 *  			mostrarProductosGotas*
 *  		caso 3
 *  			mostrarProductosSuspension
 *  	Fin_Segun
 *  	mostrarMenuCalculosYLeerYValidarOpcion*
 *  Fin_Mientras
 * Fin
 * 
 * menuGestion
 * Inicio
 * 	mostrarMenuGestionYLeerYValidarOpcion*
 * 	mientras opcion sea un numero entre 1 y 2
 *  	Segun opcion
 *  		caso 1
 *  			anhadirProducto
 *  		caso 2
 *  			eliminarProducto
 *  	Fin_Segun
 *  	mostrarMenuGestionYLeerYValidarOpcion*
 *  Fin_Mientras
 * Fin
 */
public class GestionAlmacen {
	public static void main(String[] args) {
		Validaciones validaciones = new Validaciones();
		ResguardosGestoraAlmacen rga = new ResguardosGestoraAlmacen();
		ResguardosUtilesFicheros ruf = new ResguardosUtilesFicheros();
		GestoraAlmacen ga = new GestoraAlmacen();
		UtilesFicheros uf = new UtilesFicheros();
		
		Scanner teclado = new Scanner(System.in);
		
		String fichero = ".\\src\\archivos\\Almacen.txt";
		String ficheroAux = ".\\src\\archivos\\AlmacenAux.txt";
		
		int opcion;
		String nombreFabricante;
		String fecha;
		String codigoBarras;
		ProductoImpl producto;
		
		opcion = validaciones.mostrarMenuPrincipalYLeerYValidarOpcion();
		
		while(opcion > 0 && opcion <= 3)
		{
			switch(opcion)
			{
				case 1:
					opcion = validaciones.mostrarMenuImpresionYLeerYValidarOpcion();
					
					while(opcion > 0 && opcion <= 3)
					{
						switch(opcion)
						{
							case 1:
								System.out.println("Introduce el nombre del fabricante: ");
								nombreFabricante = teclado.nextLine();
							
								//rga.listarProductosFabricante(fichero, nombreFabricante);
								ga.listarProductosFabricante(fichero, nombreFabricante);
							break;
							case 2:
								System.out.println("Escribe la fecha en la que deseas saber que productos no estan caducados: ");
								fecha = validaciones.leerYValidarFecha();
								
								//rga.listarProductosCaducidad(fichero, fecha);
								ga.listarProductosCaducidad(fichero, fecha);
							break;
							case 3:
								//rga.imprimirPrecioTotal(fichero);
								ga.imprimirPrecioTotal(fichero);
						}
						
						opcion = validaciones.mostrarMenuImpresionYLeerYValidarOpcion();
					}		
				break;
				case 2:
					opcion = validaciones.mostrarMenuCalculosYLeerYValidarOpcion();
					
					while(opcion > 0 && opcion <= 3)
					{
						switch(opcion)
						{
							case 1:
								//rga.mostrarTotalProductosPresentacion(fichero, EnumPresentacion.C);
								ga.mostrarTotalProductosPresentacion(fichero, EnumPresentacion.C);

							break;
							case 2:
								//rga.mostrarTotalProductosPresentacion(fichero, EnumPresentacion.G);
								ga.mostrarTotalProductosPresentacion(fichero, EnumPresentacion.G);

							break;
							case 3:
								//rga.mostrarTotalProductosPresentacion(fichero, EnumPresentacion.S);
								ga.mostrarTotalProductosPresentacion(fichero, EnumPresentacion.S);

						}
						
						opcion = validaciones.mostrarMenuCalculosYLeerYValidarOpcion();
					}
				break;
				case 3:
					opcion = validaciones.mostrarMenuGestionYLeerYValidarOpcion();
					
					while(opcion > 0 && opcion <= 2)
					{
						switch(opcion)
						{
							case 1:
								producto = validaciones.leerYValidarProductoImpl();
								
								//rga.anhadirProducto(producto, fichero);
								ga.anhadirProducto(producto, fichero);
								
								//ruf.ordenarFicheroHibrida(fichero);
								uf.ordenarFicheroHibrida(fichero);
								
								System.out.println("Producto anhadido con exito");
							break;
							case 2:
								codigoBarras = validaciones.leerYValidarCodigoBarras();
								
								//rga.eliminarProducto(codigoBarras, fichero, ficheroAux);
								ga.eliminarProducto(codigoBarras, fichero, ficheroAux);
								
								System.out.println("Producto eliminado con exito");
						}
						
						opcion = validaciones.mostrarMenuGestionYLeerYValidarOpcion();
					}	
			}
			
			opcion = validaciones.mostrarMenuPrincipalYLeerYValidarOpcion();
		}
		
		
	}

}
