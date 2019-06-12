package Interfaces;

/*
 * Clase MercanciaImpl
 * 
 * Propiedades b�sicas:
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
 *		public getAnhoFechaCaducidad();
 *	
 *		public double getPrecio():
 *		public void setPrecio(double Precio);
 *
 * Restricciones:
 * 		- codigoBarras debe ser un String de 6 d�gitos
 * 		- precio debe ser un numero real mayor o igual que 0
 * 		- la fecha de caducidad debe ser una fecha v�lida
 * 
 * M�todos a�adidos: No hay
 */
public interface Mercancia {
	
	public String getCodigoBarras();
	
	public String getNombreLaboratorio();
	
	public String getFechaCaducidad();
	
	public int getDiaFechaCaducidad();
	
	public int getMesFechaCaducidad();
	
	public int getAnhoFechaCaducidad();
	
	public double getPrecio();
	public void setPrecio(double Precio);
	
}
