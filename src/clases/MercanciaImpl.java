package clases;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

import Interfaces.Mercancia;

/*
 * Clase MercanciaImpl
 * 
 * Propiedades básicas:
 * 
 * 			- codigoBrarras --> String, Consultable
 * 			- nombreLaboratorio --> String, Consultable
 * 			- fechaCaducidad --> GregorianCalendar, Consultable
 * 			- precio --> double, Consultable y Modificable
 * 
 * Propiedades compartidas: No hay
 * 
 * Propiedades derivadas: No hay
 * 
 * Getters y Setters
 * 
 * 		public String getCodigoBarras();
 *
 *		public String getNombreLaboratorio();
 *
 *		public String getFechaCaducidad();
 *
 *		public int getDiaFechaCaducidad();
 *
 *		public int getMesFechaCaducidad();
 *
 *		public int getAnhoFechaCaducidad();
 *	
 *		public double getPrecio():
 *		public void setPrecio(double Precio);
 *
 * Restricciones:
 * 		- codigoBarras debe ser un String de 6 dígitos
 * 		- precio debe ser un numero real mayor o igual que 0
 * 		- la fecha de caducidad debe ser una fecha válida
 * 
 * Métodos añadidos: No hay
 */
public class MercanciaImpl implements Serializable, Mercancia, Cloneable, Comparable<MercanciaImpl> {
	//Declaración de las variables de la clase
	private String codigoBarras;
	private String nombreLaboratorio;
	private GregorianCalendar fechaCaducidad;
	private double precio;
	
	//Constructor por defecto
	public MercanciaImpl()
	{
		this.codigoBarras = "000000";
		this.nombreLaboratorio = "Defecto";
		this.fechaCaducidad = new GregorianCalendar();
		this.precio = 0.0;
	}
	
	//Constructor con parámetros
	public MercanciaImpl(String codigoBarras, String nombreLaboratorio, GregorianCalendar fechaCaducidad, double precio)
	{
		this.codigoBarras = codigoBarras;
		this.nombreLaboratorio = nombreLaboratorio;
		this.fechaCaducidad = fechaCaducidad;
		this.precio = precio;
	}
	
	//Constructor de copia
	public MercanciaImpl(MercanciaImpl copia)
	{
		this.codigoBarras = copia.getCodigoBarras();
		this.nombreLaboratorio = copia.getNombreLaboratorio();
		this.fechaCaducidad = new GregorianCalendar(copia.getAnhoFechaCaducidad(), copia.getMesFechaCaducidad() - 1, copia.getDiaFechaCaducidad());
		this.precio = copia.getPrecio();
	}

	//Getters y Setters
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public String getNombreLaboratorio() {
		return nombreLaboratorio;
	}
	
	public String getFechaCaducidad()
	{
		return this.getDiaFechaCaducidad()+"/"+this.getMesFechaCaducidad()+"/"+this.getAnhoFechaCaducidad();
	}

	public int getDiaFechaCaducidad() {
		return this.fechaCaducidad.get(Calendar.DATE);
	}

	@Override
	public int getMesFechaCaducidad() {
		return this.fechaCaducidad.get(Calendar.MONTH) + 1;
	}

	@Override
	public int getAnhoFechaCaducidad() {
		return this.fechaCaducidad.get(Calendar.YEAR);
	}
	
	//Métodos sobreescritos
	
	//hashCode
	@Override
	public int hashCode()
	{
		return (int) (this.getCodigoBarras().hashCode() * 5 / this.getPrecio());
	}
	
	//compareTo
	/*
	 * Criterio de igualdad: por codigoBarras
	 * Devuelve 1 si el objeto que realiza la llamada es mayor al que se le pasa por parámetros
	 * Devuelve 0 si ambos son iguales
	 * Devueleve -1 si el objeto que realiza la llamada es menor al que se le pasa por parámetros
	 */
	public int compareTo(MercanciaImpl otro)
	{
		int ret = -1;
		
		ret = this.getCodigoBarras().compareTo(otro.getCodigoBarras());
		
		return ret;
	}
	
	//equals
	/*
	 * Criterio de igualda: por codigoBarras
	 */
	@Override
	public boolean equals(Object obj)
	{
		boolean ret = false;
		
		if(this == obj)
		{
			ret = true;
		}
		else if(obj != null && obj instanceof MercanciaImpl)
		{
			MercanciaImpl otro = (MercanciaImpl) obj;
			
			if(this.getCodigoBarras() == otro.getCodigoBarras())
			{
				ret = true;
			}
		}
		
		return ret;
	}
	
	//clone
	public MercanciaImpl clone()
	{
		MercanciaImpl clon = null;
		
		try {
			clon = (MercanciaImpl) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clon;
	}
	
	//toString
	@Override
	public String toString()
	{
		return this.getCodigoBarras()+","+this.getNombreLaboratorio()+","+this.getFechaCaducidad()+","+this.getPrecio();
	}
	
}
