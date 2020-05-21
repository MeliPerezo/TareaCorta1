package Covid19;

public abstract class Paciente {
protected String nombre, apellido;
protected int edad; 

public Paciente(String nombre, String apellido, int edad) {
	this.nombre = nombre;
	this.apellido = apellido; 
	this.edad = edad; 
}
public void imprimir_info() {
System.out.println("Nombre del paciente: " + nombre);
System.out.println("Apellido: "+ apellido);
System.out.println("Edad: "+ edad);
}
public abstract void imprimirDatos();
 
}
