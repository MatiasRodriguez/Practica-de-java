package ej1;

import java.util.ArrayList;

public class Grupo {

	private String nombre;
	private ArrayList<String> integrantes;

	// Constructores
	public Grupo() {
		nombre = "Sin nombre";
		integrantes = new ArrayList<String>();
	}

	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", integrantes=" + integrantes + "]";
	}

	public Grupo(String nombre) {
		this.nombre = nombre;
		integrantes = new ArrayList<String>();
	}

	// Getters
	public String getNombre() {
		return this.nombre;
	}

	// Setters

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Métodos
	public int getCantidadIntegrantes() {
		return integrantes.size();
	}

	public void agregarIntegrante(String nombre) {
		integrantes.add(nombre);
	}

	private int obtenerPosicionIntegrante(String nombre) {

		int i = 0;
		boolean enc = false;

		while (i < this.integrantes.size() && enc == false) {

			if (integrantes.get(i) == nombre) {
				enc = true;
			} else {
				i++;
			}

		}

		if (enc == false) {
			i = -1;
		}

		return i;

	}

	public String obtenerIntegrante(int pos) {

		String ret = null;

		if (pos < 1) {
			System.out.println("El número de posición ingresado debe ser mayor o igual que uno. ");
		} else {
			ret = integrantes.get(pos - 1);
		}

		return ret;

	}

	public String buscarIntegrante(String nombre) {

		int i = 0;
		String ret = null;

		while (i < integrantes.size() && ret == null) {

			if (integrantes.get(i).equals(nombre)) {

				ret = nombre;

			} else {
				i++;
			}

		}

		return ret;

	}

	public String removerIntegrante(String nombre) {

		int i = 0;
		String ret = null;

		while (i < integrantes.size() && ret == null) {

			if (integrantes.get(i).equals(nombre)) {

				ret = nombre;
				integrantes.remove(i);

			} else {
				i++;
			}

		}

		return ret;

	}

	private void mostrarIntegrantes() {

		System.out.println("La cantidad de integrantes es: " + integrantes.size());

		for (int i = 0; i < integrantes.size(); i++) {

			System.out.println(integrantes.get(i));

		}

	}

	public void mostrar() {

		System.out.println("El nombre del grupo es: " + nombre);

		mostrarIntegrantes();

	}

	public void vaciar() {

		integrantes.removeAll(integrantes);

	}

}
