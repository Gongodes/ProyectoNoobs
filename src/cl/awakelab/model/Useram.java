package cl.awakelab.model;

public class Useram {
	
	private int run;
	
	private String nombre;
	
	private int edad;
	
	private String mensaje;
	
	public Useram() {
		
	}

	
	
	
	
	public Useram(int run, String nombre, int edad, String mensaje) {
		super();
		this.run = run;
		this.nombre = nombre;
		this.edad = edad;
		this.mensaje = mensaje;
	}





	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

	

}
