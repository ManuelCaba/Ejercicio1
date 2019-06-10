package Tests;

import Enums.EnumPresentacion;

public class TestEnum {

	public static void main(String[] args) 
	{
		System.out.println("EnumPresentacion C = EnumPresentacion.C;");
		EnumPresentacion C = EnumPresentacion.C;
		System.out.println("EnumPresentacion G = EnumPresentacion.G;");
		EnumPresentacion G = EnumPresentacion.G;
		System.out.println("EnumPresentacion S = EnumPresentacion.S;");
		EnumPresentacion S = EnumPresentacion.S;
		
		System.out.println();
		
		System.out.println("C.name(): "+C.name());
		System.out.println("G.ordinal(): "+G.ordinal());
		System.out.println("S.toString(): "+S.toString());
		System.out.println("C.compareTo(G): "+C.compareTo(G));
	}

}
