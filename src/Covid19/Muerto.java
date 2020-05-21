package Covid19;

public class Muerto extends Paciente {
	private int ID; 
	private String estado_salud;
	private String fecha_muerte;
	
	public Muerto(String nombre, String apellido, int edad, int ID, String estado_salud,String fecha_muerte) {
		super(nombre, apellido, edad);
		 this.ID = ID;
	     this.estado_salud = estado_salud;
	     this.fecha_muerte = fecha_muerte; 
}

	@Override
	public void imprimirDatos() {
		System.out.println("Identificación: "+ ID);
		System.out.println("Estado de salud: "+ estado_salud);
		System.out.println("Fecha del fallecimiento: "+ fecha_muerte);
		
	}
}