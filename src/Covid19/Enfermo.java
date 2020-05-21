package Covid19;

public class Enfermo extends Paciente {
	private int ID; 
	private String estado_salud;
	private String fecha_ingreso;
	
public Enfermo(String nombre, String apellido, int edad, int ID, String estado_salud, String fecha_ingreso) {
		super(nombre, apellido, edad);
     this.ID = ID;
     this.estado_salud = estado_salud;
     this.fecha_ingreso = fecha_ingreso; 
}

@Override
public void imprimirDatos() {
	System.out.println("Identificación: "+ ID);
	System.out.println("Estado de salud: "+ estado_salud);
	System.out.println("Fecha de ingreso al hospital: "+ fecha_ingreso);
} 
 

}
