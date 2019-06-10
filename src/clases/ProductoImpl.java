package clases;

import java.io.Serializable;
import java.util.GregorianCalendar;

import Enums.EnumPresentacion;

/*
 * Clase ProductoImpl
 * 
 * Propiedades básicas:
 * 
 * 		- presentacion --> EnumPresentacion, Consultable
 * 		- principoActivo --> String, Consultable
 * 
 * Propiedades compartidas: No hay
 * 
 * Propiedades derivadas: No hay
 * 
 * Getters y Setters
 * 	
 *		public EnumPresentacion getPresentacion();
 *
 *		public String getPrincioActivo();
 *
 * Restricciones:
 * 	
 * 		- presentacion debe ser comprimidos(C), gotas(G) o suspensión(S)
 * 
 * Métodos añadidos: No hay
 */
public class ProductoImpl extends MercanciaImpl implements Serializable {
	//Declaración de los atributos de la clase
	private EnumPresentacion presentacion;
	private String principioActivo;
	
	//Constructor por defecto
	public ProductoImpl()
	{
		super();
		presentacion = EnumPresentacion.D;
		principioActivo = "Defecto";
	}
	
	//Constructor con parámetros
	public ProductoImpl(String codigoBarras, String nombreLaboratorio, GregorianCalendar fechaCaducidad, double precio, EnumPresentacion presentacion, String principioActivo)
	{
		super(codigoBarras, nombreLaboratorio, fechaCaducidad, precio);
		this.presentacion = presentacion;
		this.principioActivo = principioActivo;
	}
	
	//Constructor de copia
	public ProductoImpl(ProductoImpl copia)
	{
		super(copia);
		this.presentacion = copia.getPresentacion();
		this.principioActivo = copia.getPrincipioActivo();
	}
	
	//Getters y Setters
	
	public EnumPresentacion getPresentacion() {
		return presentacion;
	}

	public String getPrincipioActivo() {
		return principioActivo;
	}
	
	//Metodos sobreesritos
	
	//toString
	@Override
	public String toString()
	{
		return super.toString()+","+this.getPresentacion().toString()+","+this.getPrincipioActivo();
	}
	
	
}
