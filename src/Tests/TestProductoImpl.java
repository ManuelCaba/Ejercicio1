package Tests;

import java.util.GregorianCalendar;

import Enums.EnumPresentacion;
import clases.ProductoImpl;

public class TestProductoImpl {

	public static void main(String[] args) {
		System.out.println("Constructor por defecto");
		System.out.println("ProductoImpl porDefecto = new ProductoImpl();");
		ProductoImpl porDefecto = new ProductoImpl();
		
		System.out.println("Constructor con pametros1");
		System.out.println("ProductoImpl conParametros1 = new ProductoImpl(\"123456\", \"LaboratorioManuel\", new GregorianCalendar(), 20.0)");
		ProductoImpl conParametros1 = new ProductoImpl("123456", "LaboratorioManuel", new GregorianCalendar(), 20.0, EnumPresentacion.D, "etiniliestradiol");
		
		System.out.println("Constructor con pametros2");
		System.out.println("ProductoImpl conParametros2 = new ProductoImpl(\"123456\", \"ManuelRepetido\", new GregorianCalendar(), 1.99, EnumPresentacion.C, \"tolueno\");");
		ProductoImpl conParametros2 = new ProductoImpl("123456", "ManuelRepetido", new GregorianCalendar(), 1.99, EnumPresentacion.C, "tolueno");
		
		System.out.println("Constructor de copia");
		System.out.println("ProductoImpl deCopia = new ProductoImpl(conParametros1);");
		ProductoImpl deCopia = new ProductoImpl(conParametros1);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Getters y Setters");
		
		System.out.println();
		
		System.out.println("codigoBarras");
		System.out.println("porDefecto.getCodigoBarras(): "+porDefecto.getCodigoBarras());
		
		System.out.println();
		
		System.out.println("nombreLaboratorio");
		System.out.println("conParametros2.getNombreLaboratorio(): "+conParametros2.getNombreLaboratorio());
		
		System.out.println();
		
		System.out.println("fechaCaducidad");
		System.out.println("deCopia.getFechaCaducidad(): "+deCopia.getFechaCaducidad());
		
		System.out.println();
		
		System.out.println("diaFechaCaducidad");
		System.out.println("porDefecto.getDiaFechaCaducidad(): "+porDefecto.getDiaFechaCaducidad());
		
		System.out.println();
		
		System.out.println("mesFechaCaducidad");
		System.out.println("porDefecto.getMesFechaCaducidad(): "+porDefecto.getMesFechaCaducidad());
		
		System.out.println();
		
		System.out.println("anhoFechaCaducidad");
		System.out.println("porDefecto.getAnhoFechaCaducidad(): "+porDefecto.getAnhoFechaCaducidad());
		
		System.out.println();
		
		System.out.println("precio");
		System.out.println("ANTES");
		System.out.println("porDefecto.getPrecio(): "+porDefecto.getPrecio());
		System.out.println("conParametros1.getPrecio(): "+conParametros1.getPrecio());
		System.out.println("porDefecto.setPrecio(55.99);");
		porDefecto.setPrecio(55.99);
		System.out.println("conParametros.setPrecio(-1); --> La interfaz no lo permite");
		conParametros1.setPrecio(-1);
		System.out.println("DESPUES");
		System.out.println("porDefecto.getPrecio(): "+porDefecto.getPrecio());
		System.out.println("conParametros1.getPrecio(): "+conParametros1.getPrecio());
		
		System.out.println();
		
		System.out.println("presentacion");
		System.out.println("conParametros2.getPresentacion().toString(): "+conParametros2.getPresentacion().toString());
		
		System.out.println();
		
		System.out.println("principioActivo");
		System.out.println("deCopia.getPrincipioActivo(): "+deCopia.getPrincipioActivo());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Metodos sobreescritos");
		
		System.out.println("conParametros1.hashCode(): "+conParametros1.hashCode());
		System.out.println("deCopia.compareTo(porDefecto): "+deCopia.compareTo(porDefecto));
		System.out.println("porDefecto.equals(conParametros2): "+porDefecto.equals(conParametros2));
		System.out.println("conParametros1.clone().toString(): "+conParametros1.clone().toString());
	
		

	}

}
