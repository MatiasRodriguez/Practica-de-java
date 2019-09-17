package ej2;

public class Atleta {
	
	//Atributos
	private String nombre;
	private float tiempo;
	
	
	//Constructores
	public Atleta(){
		nombre = "sin nombre";
		tiempo = 0;
	}
	
	public Atleta(String nom, float t){
		nombre = nom;
		tiempo = t;
	}
	
	
	//Getters y setters
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTiempo(float tiempo) {
		this.tiempo = tiempo;
	}

	public float getTiempo(){
		return tiempo;
	}
	
}
