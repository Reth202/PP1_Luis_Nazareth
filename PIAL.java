package Créditos;
public class  Corriente {
}



package Créditos;
public class Especial {	
}



package Créditos;
public class Vivienda {
}



package Controlador;
public abstract class Cliente {

public static String Nombre="";
public static String DNI="";
public static float Salario=0;
}



package Controlador;
public class Docentes extends Cliente{

public static String Lugar de trabajo="";
public static String Categoría=""; //Prof. Adjunto, Asociado o Catedrático
public static String Estado=""; //Interino o Propiedad
	
public Docentes (String Nombre, String DNI, float Salario);
super(Nombre, DNI, Salario);
}



package Controlador;
public class Administrativos extends Cliente {

public static String Sitio_Tra="";
public static String Puesto="";
	
public Administrativos (String Nombre, String DNI, float Salario);
super(Nombre, DNI, Salario);
}



package Controlador;
public class Pensionados extends Cliente{

public static int Años_Jubi=0; //Años de jubilación
public static String Tipo de empleado=""; //Docente ó Administrativo

public Pensionados (String Nombre, String DNI, float Salario);
super(Nombre, DNI, Salario);
}



package Vista;
public class PIAL {

	public static void main(String[] args) {
		Cliente Cl= new Cliente();
		System.exit(0);
	}
}
