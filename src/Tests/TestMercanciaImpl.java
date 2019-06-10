package Tests;

import java.util.GregorianCalendar;

import Enums.EnumPresentacion;
import clases.MercanciaImpl;
import clases.ProductoImpl;

public class TestMercanciaImpl {

	public static void main(String[] args) {
		System.out.println("Constructor por defecto");
		System.out.println("MercanciaImpl porDefecto = new MercanciaImpl();");
		MercanciaImpl porDefecto = new MercanciaImpl();
		
		System.out.println("Constructor con pametros1");
		System.out.println("MercanciaImpl conParametros1 = new MercanciaImpl(\"123456\", \"LaboratorioManuel\", new GregorianCalendar(), 20.0)");
		MercanciaImpl conParametros1 = new MercanciaImpl("123456", "LaboratorioManuel", new GregorianCalendar(), 20.0);
		
		System.out.println("Constructor con pametros2");
		System.out.println("MercanciaImpl conParametros2 = new MercanciaImpl(\"123456\", \"ManuelRepetido\", new GregorianCalendar(), 1.99);");
		MercanciaImpl conParametros2 = new MercanciaImpl("123456", "ManuelRepetido", new GregorianCalendar(), 1.99);
		
		System.out.println("Constructor de copia");
		System.out.println("MercanciaImpl deCopia = new MercanciaImpl(conParametros1);");
		MercanciaImpl deCopia = new MercanciaImpl(conParametros1);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Getters y Setters");
		
		System.out.println();
		
		System.out.println("codigoBarras");
		System.out.println("porDefecto.getCodigoBarras(): "+porDefecto.getCodigoBarras());
		
		System.out.println();
		
		System.out.println("nombreLaboratorio");
		System.out.println("conParametros.getNombreLaboratorio(): "+conParametros2.getNombreLaboratorio());
		
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
		System.out.println("conParametros.getPrecio(): "+conParametros1.getPrecio());
		System.out.println("porDefecto.setPrecio(55.99);");
		porDefecto.setPrecio(55.99);
		System.out.println("conParametros.setPrecio(-1); --> La interfaz no lo permite");
		conParametros1.setPrecio(-1);
		System.out.println("DESPUES");
		System.out.println("porDefecto.getPrecio(): "+porDefecto.getPrecio());
		System.out.println("conParametros.getPrecio(): "+conParametros1.getPrecio());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Metodos sobreescritos");
		
		System.out.println("conParametros.hashCode(): "+conParametros2.hashCode());
		System.out.println("deCopia.compareTo(porDefecto): "+deCopia.compareTo(porDefecto));
		System.out.println("porDefecto.equals(conParametros): "+porDefecto.equals(conParametros1));
		System.out.println("conParametros.clone().toString(): "+conParametros2.clone().toString());
	
		
		
		
	}

}
