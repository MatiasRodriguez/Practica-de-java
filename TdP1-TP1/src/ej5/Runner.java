package ej5;
import java.util.Scanner;

import ej5.AnioV2.Mes;

public class Runner {
public static Scanner input;
	public static void main(String[] args) {
		input = new Scanner (System.in);
		
		int mes, dias;
		Mes nombre;

		AnioV2 an = new AnioV2();
		System.out.println("Ingrese un numero de mes: ");
		mes = input.nextInt();
		nombre=an.getNombreDelMes(mes);
		System.out.println("El nombre es: " + nombre);
		dias=an.diasTranscurridos(mes);
		System.out.println("La cantidad de meses transcurridos en el año fue de: " + dias);
		

	}

}
