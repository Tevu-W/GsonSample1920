package dad.persona;

import java.util.Scanner;

public class Persona {
	String nombre;
	String apellidos;
	int edad;
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int _edad) {
		this.edad = _edad;
	}
	
	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}
	
	public void setApellidos(String _apellidos) {
		this.apellidos = _apellidos;
	}
}
