import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PruebaMenu {
	
	String nombreyApellido;
	int dni;
	public static List<PruebaMenu> list_socios =new ArrayList<>();
	Scanner teclado = new Scanner(System.in);
	
	public void menu() {
					
		System.out.println("Ingrese nombre y apellido: ");
		nombreyApellido = teclado.nextLine();
		System.out.println("Ingrese DNI: ");
		dni = teclado.nextInt();
		teclado.nextLine();
					
					
	}
	
	public void sumar () {
		int suma = dni + 10;
		System.out.print(suma);
	}
	
	public static void main (String[] ar) {
		
		Scanner teclado = new Scanner(System.in);
		int opcion;
		
		boolean salir = false;
		//mientras que yo no le diga salir que siga funcionando
		while(!salir) {
		
		System.out.println("-----Menú-----");
		System.out.println("1. Registrarse");
		System.out.println("2. Ingresar: ");
		System.out.print("Opción: ");
		opcion=teclado.nextInt();
		
		
		
		switch(opcion){
			case 1:
				PruebaMenu menu1 = new PruebaMenu();
				menu1.menu();
				menu1.sumar();
				list_socios.add(menu1);
				break;
				
			case 2: 
				System.out.print("Proximamente");
				break;
				
			case 3:
				salir=true;
				break;
				
			default:
				System.out.print("La opcion no es valida");
			}
		}
		
		
		System.out.println("Datos: ");
		for(int i=0;i<=1;i++) {
			System.out.println("Nombre: "+list_socios.get(i).nombreyApellido+"	DNI: "+
					list_socios.get(i).dni);
			System.out.println();
			
		}
		
	}
	
}
