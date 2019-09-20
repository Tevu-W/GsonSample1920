package dad.persona;
import com.google.gson.*;
import java.util.Scanner;
public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String nombre,apellidos;
		int edad;
		
		System.out.println("------INTRODUCCIÓN DE DATOS---------");
		System.out.print("Escribe tu nombre: ");
		nombre = in.nextLine();
		System.out.print("Escribe tus apellidos: ");
		apellidos = in.nextLine();
		System.out.print("Escribe tu edad: ");
		edad = in.nextInt();
		
		Persona p = new Persona();
		p.setNombre(nombre);
		p.setApellidos(apellidos);
		p.setEdad(edad);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
		in.close();
	}

}
