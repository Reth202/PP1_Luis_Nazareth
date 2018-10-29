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

	public static String Nombre = "";
	public static String DNI = "";
	public static float Salario = 0;

	public Cliente(String nombre, String dni, float salario) {
	Nombre=nombre;
	DNI=dni;
	Salario=salario;
	}
}


package Controlador;
public class Docentes extends Cliente{

public static String Sitio_Tra="";
public static String Categoría=""; //Prof. Adjunto, Asociado o Catedrático
public static String Estado=""; //Interino o Propiedad
	
public Docentes (String nombre, String dni, float salario, String Sitio_tra, String categoría, String estado);
super(nombre, dni, salario);
Sitio_Tra=Sitio_tra;
Categoría=categoría;
Estado=estado;
}
}


package Controlador;
public class Administrativos extends Cliente {

public static String Sitio_Tra="";
public static String Puesto="";
	
public Administrativos (String nombre, String dni, float salario, String Sitio_tra, String puesto);
super(nombre, dni, salario);
Sitio_Tra=Sitio_tra;
Puesto=puesto;
}
}


package Controlador;
public class Pensionados extends Cliente{

public static int Años_Jubi=0; //Años de jubilación
public static String Tipo de empleado=""; //Docente ó Administrativo

public Pensionados (String nombre, String dni, float salario);
super(nombre, dni, salario);
}
}



package Vista;
public class PIAL {

	public static void main(String[] args) {
		Cliente Cl= new Cliente();
		System.exit(0);
	}
}
