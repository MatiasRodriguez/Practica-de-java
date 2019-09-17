package ej2;

import java.util.ArrayList;

public class Carrera {
	private ArrayList<Atleta> atletas;

	public Carrera() {
		atletas = new ArrayList<Atleta>();
	}

	public void agregarAtleta(Atleta a) {
		atletas.add(a);
	}
	public Atleta mejorTiempo() {
		Atleta mejor = new Atleta();
		mejor = atletas.get(0);
		float max = atletas.get(0).getTiempo();
		for (int i = 0; i < atletas.size(); i++) {
			if (atletas.get(i).getTiempo() < max) {
				mejor = atletas.get(i);
			}
		}
		return mejor;
	}
	public Atleta[] calcularGanadores() {
		Atleta mejor = new Atleta();
		Atleta[] ganadores = new Atleta[atletas.size()];
		mejor = mejorTiempo();
		int j = 0;
		
		ganadores[j] = mejor;
		j++;
		for (int i = 0; i < atletas.size(); i++) {
			if (atletas.get(i).getTiempo() == mejor.getTiempo()) {
				if(atletas.get(i).equals(mejor)==false){
				ganadores[j] = atletas.get(i);
				j++;
				}
			}
		}
		return ganadores;
	}

	public Atleta sacarSegundo(Atleta a) {
		Atleta segundo = new Atleta();
		segundo.setTiempo(9999);
		float max = a.getTiempo();
		for (int i = 0; i < atletas.size(); i++) {
			if (atletas.get(i).getTiempo() > max) {
				if (atletas.get(i).getTiempo() < segundo.getTiempo()){
					segundo = atletas.get(i);
				}
			}
		}
			return segundo;
		}
		public Atleta[] obtenerSegundo() {
		Atleta[] segundos = new Atleta[atletas.size()];
		int j = 0;
		Atleta segundo=sacarSegundo(mejorTiempo());
		segundos[j] = segundo;
		j++;
		for (int i = 0; i < atletas.size(); i++) {
			if (atletas.get(i).getTiempo() == segundo.getTiempo()) {
				if(atletas.get(i).equals(segundo)==false){
				segundos[j] = atletas.get(i);
				j++;
				}
			}
		}
		return segundos;
	}
	
	public  Atleta [] sacarTercero() {
		
		Atleta b=sacarSegundo(mejorTiempo());
		Atleta tercero = new Atleta();
		tercero.setTiempo(9998);
		
		float seg = b.getTiempo();
		for (int i = 0; i < atletas.size(); i++) {
				if(atletas.get(i).getTiempo() > seg) {
				if (atletas.get(i).getTiempo() < tercero.getTiempo()){
					tercero = atletas.get(i);		
				}	
			}
		}
		Atleta[] terceros = new Atleta[atletas.size()];
		int j = 0;
		terceros[j] = tercero;
		j++;
		for (int k = 0; k < atletas.size(); k++) {
			if (atletas.get(k).getTiempo() == tercero.getTiempo()) {
				if(atletas.get(k).equals(tercero)==false){
				terceros[j] = atletas.get(k);
				j++;
				}
			}
		}
		return terceros;
	}
}
