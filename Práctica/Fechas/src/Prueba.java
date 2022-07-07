import java.time.*;
import java.time.temporal.*;
import java.util.Scanner;

public class Prueba {
	
	public static void main(String[] ar) {
		
		System.out.println("Fecha del dia de hoy: "+ LocalDate.now());
		System.out.println("Hora actual: "+ LocalTime.now());
		System.out.println("Fecha y hora actual: "+ LocalDateTime.now());
		System.out.println("El momento actual: "+ Instant.now());
		
		// uso de of
		System.out.println("Fecha de mi cumpleaños: "+LocalDate.of(2000, 7, 5));
		System.out.println("Hora exacta: "+LocalTime.of(14, 40));
		
		// puedo extraer una parte de la fecha
		System.out.println("Dia actual: " + LocalDate.now().getDayOfMonth());
		System.out.println("Mes actual: " + LocalDate.now().getMonthValue());	//El mes con numero	
		System.out.println("Mes actual: " + LocalDate.now().getMonth());		
		System.out.println("Año actual: " + LocalDate.now().getYear());
		
		// tiempo transcurrido entre fechas
		
		
		Scanner teclado = new Scanner (System.in);
		int i, j, k;
		System.out.println("Ingrese fecha de nacimiento: ");
		System.out.print("Día: ");
		k=teclado.nextInt();
		System.out.print("Mes: ");
		j=teclado.nextInt();
		System.out.print("Año: ");
		i=teclado.nextInt();
		
		LocalDate fechaNacimiento = LocalDate.of(i, j, k);
		
		System.out.println("Fecha de nacimiento es: " + fechaNacimiento);
		
		System.out.println("La edad que tienes es: " + 
				ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now()));
		
		if(ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now())>18) {
			System.out.print("Es mayor de edad");
		}
		
		//encapsulamiento: se encarga de ocultar tanto los atributos como los metodos para que 
		//solamente puedan ser accedidos desde la misma clase (private)
		
		//metodos accesores: 
		//setters -> signifca establecer 
		//getters -> significa mostrar
		
		
	}
}
