package Covid19;

public class Recuperado extends Paciente {
	private int ID; 
	private String estado_salud;
	private String fecha_salida;
	
	public Recuperado(String nombre, String apellido, int edad, int ID, String estado_salud, String fecha_salida) {
		super(nombre, apellido, edad);
		this.ID = ID;
		this.estado_salud = estado_salud;
		this.fecha_salida = fecha_salida;
 }

	@Override
	public void imprimirDatos() {
		System.out.println("Identificación: "+ ID);
		System.out.println("Estado de salud: "+ estado_salud);
		System.out.println("Fecha de salida del hospital: "+ fecha_salida);
		
	}
}