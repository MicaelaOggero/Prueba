import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main (String[] ar) {
		
		List<Persona> list_persona = new ArrayList<>();
		Persona persona1=new Persona();
		persona1.setNombre("Mica");
		persona1.setFactor("RHNegativo");
		persona1.setEdad(21);
		
		list_persona.add(persona1);
		
		System.out.print("Nombre: "+list_persona.get(0).getNombre()+"	"
				+ "Edad: "+list_persona.get(0).getEdad()+"	Factor: "+list_persona.get(0).getFactor());
		
	
		
	}
}
