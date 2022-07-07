import java.util.Scanner;

public class Persona {
	private String nombre;
	private int edad;
	private String factor;
	
	
	public String getNombre() {
		return(nombre);
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getFactor() {
		return(factor);
	}
	
	public void setFactor(String factor) {
		this.factor=factor;
	}
	
	public int getEdad() {
		return(edad);
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public String toString() {
		return "Nombre: "+nombre+"\n"+"Edad: "+edad+"\n"+"Factor: "+factor; 
	}
	

}
