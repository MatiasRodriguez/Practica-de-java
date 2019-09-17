package ej1;
import java.util.Scanner;
import java.util.ArrayList;
public class Runner {
private static Scanner input;
	public static void main(String[] args) {
		
		String mi_cond= "", integrante = "";
		String cond_fin= "Salir";
		String NombreGrupo = "nombre";
		input=new Scanner (System.in);
 		Grupo miGrupo = new Grupo();
 		System.out.println("Introduzca el nombre del grupo");
        NombreGrupo = input.nextLine();
        miGrupo.setNombre(NombreGrupo);
        
        while (!cond_fin.equals(mi_cond)) {
        	 System.out.println("Ingrese los integrantes del grupo");
        	integrante = input.nextLine();
        	miGrupo.agregarIntegrante(integrante);
        	System.out.println(integrante + " fue asignado al grupo" + NombreGrupo);
        	System.out.println("Desea terminar la carga? ponga salir para terminar, de lo contrario ponga seguir");
        	mi_cond = input.nextLine();
		}
        System.out.println(miGrupo.toString());
        System.out.println("Ingrese el nombre a buscar:");
        integrante=input.nextLine();
        System.out.println(miGrupo.buscarIntegrante(integrante));
        System.out.println("Elija el integrante a eliminar");
        integrante=input.nextLine();
        miGrupo.removerIntegrante(integrante);
        System.out.println(miGrupo.toString());
        input.nextLine();
        miGrupo.vaciar();
        System.out.println(miGrupo.toString());

		

	}

}
