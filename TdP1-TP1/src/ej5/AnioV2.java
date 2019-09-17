package ej5;

public class AnioV2 {

	public enum Mes {Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre};
	private int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Mes getNombreDelMes(int numeroMes) {
		Mes ret;
		
		if(numeroMes<1 || numeroMes>12) {
			System.out.println("El numero de mes ingresado es incorrecto");
			ret = null;
		} else {
			ret = Mes.values()[numeroMes-1];
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
