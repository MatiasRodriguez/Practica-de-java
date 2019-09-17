package ej3;

import ej2.Atleta;
import ej2.Carrera;

public class Carrera_terna {

	private static Atleta[][] terna;
	// no entiendo como utilizar la matriz
	//ya que  creo que al hacer esto estoy creando un vector dentro de otro dentro de otro osea una matriz de 3
	public Carrera_terna(){
		Carrera c = new Carrera();
		terna= new Atleta[c.calcularGanadores().length][c.calcularGanadores().length];
	}
			
	public Atleta[][] terna(){
		Carrera c=new Carrera();
		Atleta[] primero= c.calcularGanadores();
		int cont=0;
		Recorrer(primero ,cont);
		cont++;
		Atleta[] segundo=c.obtenerSegundo();
		Recorrer(segundo,cont);
		cont++;
		Atleta[] tercero=c.sacarTercero();
		Recorrer(tercero ,cont);
		cont++;
		return terna;
	}
		
public static  void Recorrer(Atleta[] a  , int cont){
		Atleta a1=new Atleta();
		Atleta a2=new Atleta();
		int i=0;
		boolean fin=false;
		while(i<terna[cont].length&&fin == false){
				 a1=terna[cont][i];
				 a2=a[i];
				 if (a2 != null) {
						a1=a2;
				 }else{
					 fin=true;
				 }
				 i++;
			 }
		}
	}	
	
	
	
	

