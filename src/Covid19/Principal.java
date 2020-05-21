package Covid19;

public class Principal {

	public static void main(String[] args) {
		Recuperado R = new Recuperado("Pedro","Perez", 23, 23895897, "Recuperado", "23 de Mayo"); 
		R.imprimir_info();  
		R.imprimirDatos();
	     
        
        Enfermo E = new Enfermo("Rodrigo","Rodriguez", 56, 51654985, "Enfermo", "15 de Abril"); 
        E.imprimir_info();  
        E.imprimirDatos();
        
        Muerto M = new Muerto("Martin","Martinez", 87, 24765654, "Muerto", "22 de Febrero"); 
        M.imprimir_info(); 
        M.imprimirDatos();
          
       
	}

}
