package ej4;

public class Anio {
	
	private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Dieciembre"};
	private int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public String getNombreDelMes(int numeroMes) {
		String ret;
		
		if(numeroMes<1 || numeroMes>12) {
			System.out.println("El número de mes ingresado es incorrecto");
			ret = null;
		} else {
			ret = meses[numeroMes-1];
		}
		return ret;
	}
	
	public int diasTranscurridos(int numeroMes) {
		int i = 0;
		int acum = 0;
		
		while(i<numeroMes-1){
			acum += dias[i];
			i++;
		}
		return acum;
	}
	
}


