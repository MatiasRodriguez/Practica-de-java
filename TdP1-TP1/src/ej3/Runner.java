package ej3;

import ej2.Carrera;
import ej2.Atleta;
import java.util.Scanner;

public class Runner {
	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);

		String nombre, salir;
		float tiempo;
		Carrera c = new Carrera();
		do {
			System.out.println("ingrese el nombre del atleta: ");
			nombre = input.next();
			System.out.println("ingrese el tiempo del atleta: ");
			tiempo = input.nextFloat();
			Atleta b = new Atleta(nombre, tiempo);
			c.agregarAtleta(b);
			System.out.println("ingrese f para salir, cualquier letra para continuar");
			salir = input.next();
		} while (salir.equals("f") == false);
	
		
		int cont = 0;
	
		Atleta [] a= new Atleta[c.calcularGanadores().length];

		do {
			if (cont == 0) {
				System.out.println("los ganadores de la carrera fueron: ");
				
				Recorrer(c.calcularGanadores());
				}
			 else if (cont == 1) {
				System.out.println("los que salieron segundos de la carrera fueron: ");
				Recorrer(c.obtenerSegundo());
				}
			 else {
				System.out.println("los que salieron terceros de la carrera fueron: ");
				Recorrer(c.sacarTercero());
				}
			 cont++;

		} while (cont < 3);
		input.close();
		}
public static  void Recorrer(Atleta[] a ){
		Atleta a1=new Atleta();
			 for(int i=0;i<a.length;i++){
				 a1=a[i];
				 if (a1 != null) {
						System.out.println(a1.getNombre() + "  con su tiempo de " + a1.getTiempo());
			
				 }
			 }
	}
}
