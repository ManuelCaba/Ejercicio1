package Validaciones;

import java.util.GregorianCalendar;
import java.util.Scanner;

import Enums.EnumPresentacion;
import clases.ProductoImpl;

public class Validaciones {
	/*
	 * Método que lee y valida un objeto ProductoImpl
	 * Signatura: public ProductoImpl leerYValidarProductoImpl()
	 * Entradas: No hay
	 * Precondiciones: No hay
	 * Salidas:
	 * 		- ProductoImpl producto
	 * Postcondiciones: Se devolverá un objeto ProductoImpl asociado al nobre validado
	 */
	public ProductoImpl leerYValidarProductoImpl()
	{
		Scanner teclado = new Scanner(System.in);
		
		ProductoImpl producto = null;
		String codigoBarras;
		String nombreLaboratorio;
		GregorianCalendar fechaCaducidad;
		int dia;
		int mes;
		int anho;
		double precio;
		EnumPresentacion presentacion = null;
		String principioActivo;
		
		String fecha;
		
		codigoBarras = leerYValidarCodigoBarras();
		
		System.out.println("Escribe el nombre del laboratorio:");
		nombreLaboratorio = teclado.nextLine();
		
		System.out.println("Introduce la fecha de caducidad: ");
		fecha = leerYValidarFecha();
		
		fechaCaducidad = new GregorianCalendar(Integer.parseInt(fecha.split("/")[0]), Integer.parseInt(fecha.split("/")[1]) + 1, Integer.parseInt(fecha.split("/")[2]));
		
		precio = leerYValidarPrecio();
		
		presentacion = leerYValidarPresentacion();
		
		System.out.println("Introduce el principio activo: ");
		principioActivo = teclado.nextLine();
		
		producto = new ProductoImpl(codigoBarras, nombreLaboratorio, fechaCaducidad, precio, presentacion, principioActivo);
		
		return producto;
	}
	
	/*
	 * Metodo que lee y valida un codigoBarras
	 * Signatura: public String leerYValidarCodigoBarras()
	 * Entradas: No hay
	 * Precondiciones; No hay
	 * Salidas: 
	 * 		- String codigoBarras
	 * Postcondiciones: Se devuelve asociado al nombre un String con un codigoBarras validado
	 */
	 public String leerYValidarCodigoBarras()
	 {
		 Scanner teclado = new Scanner(System.in);
		 
		 String codigoBarras;
		 
		 do
		 {
			 System.out.println("Introduce el codigo de barras (6 digitos)");
			 codigoBarras = teclado.nextLine();
		 }
		 while (codigoBarras.length() != 6);
		 
		 return codigoBarras;
	 }
	 
	/*
	 * Metodo que lee y valida un precio
	 * Signatura: public double leerYValidarPrecio()
	 * Entradas: No hay
	 * Precondiciones; No hay
	 * Salidas: 
	 * 		- double precio
	 * Postcondiciones: Se devuelve asociado al nombre un double con un precio validado
	 */
	 public double leerYValidarPrecio()
	 {
		 Scanner teclado = new Scanner(System.in);
		 
		 double precio;
		 
		 do
		 {
			 System.out.println("Introduce el precio de barras:");
			 precio = teclado.nextDouble();
		 }
		 while (precio < 0);
		 
		 return precio;
	 }
	 
	/*
	 * Metodo que lee y valida una presentacion
	 * Signatura: public EnumPresentacion leerYValidarPresentacion()
	 * Entradas: No hay
	 * Precondiciones; No hay
	 * Salidas: 
	 * 		- double precio
	 * Postcondiciones: Se devuelve asociado al nombre un EnumPrsentaciom con una presentacion validada
	 */
	 public EnumPresentacion leerYValidarPresentacion()
	 {
		 Scanner teclado = new Scanner(System.in);
		 
		 String nombrePresentacion;
		 EnumPresentacion presentacion;
		 
		 do
		 {
			 System.out.println("Escribe la presentacion (comprimidos, gotas o suspension: ");
			 nombrePresentacion = teclado.nextLine();
		 }
		 while (!nombrePresentacion.equals("comprimidos") && 
				!nombrePresentacion.equals("gotas") && 
				!nombrePresentacion.equals("suspension"));
		 
		 switch(nombrePresentacion)
		 {
		 	case "comprimidos":
		 		presentacion = EnumPresentacion.C;
		 	break;
		 	case "gotas":
		 		presentacion = EnumPresentacion.G;
		 	break;
		 	default:
		 		presentacion = EnumPresentacion.S;
		 	break;
		 }
		 
		 return presentacion;
	 }
	 
	 /*
	  * Método que lee y Valida una fecha
	  *	Signatura: public String leerYValidarFecha()
	  *	Entradas: No hay
	  *	Precondiciones: No hay
	  *	Salidas:
	  *		- String fecha
	  *	Postcondiciones: Se devolverá asociado al nombre un String con una fecha
	  *					 válida asociada al nombre
	  */
	 public String leerYValidarFecha()
	 {
	        Scanner teclado = new Scanner(System.in);
	        Validaciones validaciones = new Validaciones();

	        int dia;
	        int mes;
	        int anho;
	        String fecha;

	        boolean valido = false;

	        do
	        {
	            System.out.print("Introduce el dia: ");
	            dia = teclado.nextInt();

	            System.out.println();

	            System.out.print("Introduce el mes: ");
	            mes = teclado.nextInt();

	            System.out.println();

	            do
	            {
	                System.out.print("Introduce el anho: ");
	                anho = teclado.nextInt();
	            }
	            while(anho < 1582);

	            if(mes >= 1 && mes <= 12)
	            {
	                switch(mes)
	                {
	                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	                    if(dia >= 1 && dia <= 31)
	                    {
	                        valido = true;
	                    }
	                    break;
	                    case 4: case 6: case 9: case 11:
	                    if(dia >= 1 && dia <= 30)
	                    {
	                        valido = true;
	                    }
	                    break;
	                    case 2:
	                        //Si el a?o es bisiesto +1 d?a.
	                        if(validaciones.esBisiesto(anho) == true)
	                        {
	                            if( dia >= 1 && dia <= 29 )
	                            {
	                                valido = true;
	                            }
	                        }
	                        else if( dia >= 1 && dia <= 28 )
	                        {
	                            valido = true;
	                        }
	                        break;
	                }
	            }
	        }
	        while(valido == false);

	        fecha = dia+"/"+mes+"/"+anho;

	        return fecha;		 
	 }
	 
    /*
     * Método que comprueba si un a?o es bisiesto o no
     * Signatura: public boolean esBisiesto(int anho)
     * Entradas:
     * 		- int anho
     * Precondiciones:
     * 		- el anho debe ser mayor o igual que 1582
     * Salidas:
     * 		- boolean bisiesto
     * Postcondiciones: Se devuelve true si el año es bisiesto o por lo contrario false
     */
	 public boolean esBisiesto(int anho)
	 {
		 boolean valido = false;

	     if((anho%4 == 0) && (anho%100 != 0) || (anho%400 == 0))
	     {
	    	 valido = true;
	     }

	     return valido;
	 }
	 
	 /*
	  * Método que muestra un menú principal del programa y lee y valida su opcion:
	  * - 1 --> Menu Impresion
	  * - 2 --> Menu Calculos
	  * - 3 --> Menu Gestion
	  * - 0 --> Salir
	  * Signatura: public int mostrarMenuPrincipalYLeerYValidarOpcion()
	  * Entradas: No hay
	  * Precondiciones: No hay
	  * Salidas:
	  * 	- int opcion
	  * Postcondiciones: Se muestra el menu por pantalla y devuelve la opcion elegida por el usuario validada
	  */
	 public int mostrarMenuPrincipalYLeerYValidarOpcion()
	 {
		 Scanner teclado = new Scanner(System.in);
		 int opcion;
		 
		 do
		 {
			 System.out.println("Menu Impresion (1)");
			 System.out.println("Menu Calculos (2)");
			 System.out.println("Menu Gestion (3)");
			 System.out.println("Salir (0)");
			 System.out.println("Elige la opcion: ");
			 opcion = teclado.nextInt();
		 }
		 while(opcion < 0 || opcion > 3);
		 
		 return opcion;
	 }
	 
	 /*
	  * Método que muestra un menú de impresión del programa y lee y valida su opcion:
	  * - 1 --> Imprimir listado de productos de un fabricante
	  * - 2 --> Imprimir productos segun fecha de caducidad
	  * - 3 --> Imprimir total en euros de productos (3)
	  * - 0 --> Salir
	  * Signatura: public int mostrarMenuImpresionYLeerYValidarOpcion()
	  * Entradas: No hay
	  * Precondiciones: No hay
	  * Salidas:
	  * 	- int opcion
	  * Postcondiciones: Se muestra el menu por pantalla y devuelve la opcion elgida por el usuario validada
	  */
	 public int mostrarMenuImpresionYLeerYValidarOpcion()
	 {
		 Scanner teclado = new Scanner(System.in);
		 int opcion;
		 
		 do
		 {
			 System.out.println("Imprimir listado de productos de un fabricante (1)");
			 System.out.println("Imprimir productos segun fecha de caducidad (2)");
			 System.out.println("Imprimir total en euros de productos (3)");
			 System.out.println("Salir (0)");
			 System.out.println("Elige la opcion: ");
			 opcion = teclado.nextInt();
		 }
		 while(opcion < 0 || opcion > 3);
		 
		 return opcion; 
	 }
	 
	 /*
	  * Método que muestra un menú de cálculos del programa y lee y valida sus opciones:
	  * 1 --> Total de productos en comprimidos
	  * 2 --> Total de productos en gotas
	  * 3 --> Total de productos en suspension
	  * 0 --> Salir
	  * Signatura: public int mostrarMenuCalculosYLeerYValidarOpcion()
	  * Entradas: No hay
	  * Precondiciones: No hay
	  * Salidas:
	  * 	- int opcion
	  * Postcondiciones: Se muestra el menu por pantalla y devuelve la opcion elgida por el usuario validada
	  */
	 public int mostrarMenuCalculosYLeerYValidarOpcion()
	 {
		 Scanner teclado = new Scanner(System.in);
		 int opcion;
		 
		 do
		 {
			 System.out.println("Total de productos en comprimidos (1)");
			 System.out.println("Total de productos en gotas (2)");
			 System.out.println("Total de productos en suspension (3)");
			 System.out.println("Salir (0)");
			 System.out.println("Elige la opcion: ");
			 opcion = teclado.nextInt();
		 }
		 while(opcion < 0 || opcion > 3);
		 
		 return opcion; 
	 }
	 
	 /*
	  * Método que muestra un menú de gestion del programa y lee y valida sus opciones:
	  * 1 --> Anhadir producto
	  * 2 --> Eliminar producto
	  * 0 --> Salir
	  * Signatura: public int mostrarMenuGestionYLeerYValidarOpcion()
	  * Entradas: No hay
	  * Precondiciones: No hay
	  * Salidas:
	  * 	- int opcion
	  * Postcondiciones: Se muestra el menu por pantalla y devuelve la opcion elgida por el usuario validada
	  */
	 public int mostrarMenuGestionYLeerYValidarOpcion()
	 {
		 Scanner teclado = new Scanner(System.in);
		 int opcion;
		 
		 do
		 {
			 System.out.println("Anhadir producto (1)");
			 System.out.println("Eliminar producto (2)");
			 System.out.println("Salir (0)");
			 System.out.println("Elige la opcion: ");
			 opcion = teclado.nextInt();
		 }
		 while(opcion < 0 || opcion > 2);
		 
		 return opcion; 
	 }
}
