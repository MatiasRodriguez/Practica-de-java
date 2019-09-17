package ej6;

import java.util.ArrayList;

public class GastoAnual {

	final static int TOTAL_MESES = 12;

	private ArrayList<Rubro> rubros;

	public GastoAnual() {
		rubros = new ArrayList<Rubro>();
	}

	public void agregarGasto(Mes mes, String nombreRubro, double importe) {
		Rubro mi_rubro = obtenerRubro(nombreRubro);

		if (importe > 0) {
			mi_rubro.agregarGasto(mes, importe);
		} else {
			System.out.println("No se puede agregar un importe menor o igual a 0. ");
		}
	}

	private Rubro obtenerRubro(String nombreRubro) {
		int i = 0;
		boolean enc = false;

		while (i < rubros.size() && enc == false) {
			if (rubros.get(i).getNombre().equals(nombreRubro)) {
				enc = true;
			} else {
				i++;
			}
		}
		if (enc == true) {
			return rubros.get(i);
		} else {
			Rubro mi_rubro = new Rubro(nombreRubro);
			rubros.add(mi_rubro);
			return mi_rubro;
		}
	}

	private Rubro buscarRubro(String nombreRubro) {
		int i = 0;
		boolean enc = false;

		while (i < rubros.size() && enc == false) {
			if (rubros.get(i).getNombre().equals(nombreRubro)) {
				enc = true;
			} else {
				i++;
			}
		}
		if (enc == true) {
			return rubros.get(i);
		} else {
			return null;
		}
	}

	private double[][] consolidadodDeGastos() {
		double[][] matriz = new double[TOTAL_MESES][rubros.size()];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = rubros.get(j).getTotalGastos(Mes.values()[i]);
			}
		}
		return matriz;
	}

	public double gastoAcumulado(Mes mes) {
		double acum = 0;

		for (int i = 0; i < rubros.size(); i++) {
			acum += rubros.get(i).getTotalGastos(mes);
		}
		return acum;
	}

	public double gastoAcumulado(String nombreRubro) {
		double acum = 0;
		Rubro mi_rubro = buscarRubro(nombreRubro);

		if (mi_rubro == null) {
			acum = -1;
			return acum;
		} else {
			for (int i = 0; i < rubros.size(); i++) {
				for (int j = 0; j < TOTAL_MESES; j++) {
					acum += rubros.get(i).getTotalGastos(Mes.values()[j]);
				}
			}
			return acum;
		}
	}

	public void informarConsumosPorMes() {
		double acum = 0;
		int j = 0;
		
		for(int i=0;i<TOTAL_MESES;i++) {
			System.out.println("Mes: " + Mes.values()[i]);
			while(j<rubros.size()) {
				acum += rubros.get(j).getTotalGastos(Mes.values()[i]);
				j++;
			}
			System.out.println("Rubro: " + rubros.get(j).getNombre());
			System.out.println("Acumulado: " + acum);
			j = 0;
		}
	}
	
	public void informarPromedioMensualPorRubro() {
		
		for(int i=0;i<rubros.size(); i++) {
			System.out.println("Rubro: " + rubros.get(i).getNombre());
			for(int j=0;j<TOTAL_MESES;j++) {
				System.out.println("Consumo: " + rubros.get(i).getTotalGastos(Mes.values()[i])); //muestra directamente el mes... cómo se saca el promedio de un mes? no se puede, directamente tira el contenido del mes...
			}
		}
	}
	
	public void informarMesMayorConsumo() {
		
		for(int i=0;i<rubros.size(); i++) {
			double max_consumo = 0;
			Mes max_nombre = Mes.values()[0];
			double gastoMes;
			
			for(int j=0;j<TOTAL_MESES;j++) {
				gastoMes = rubros.get(i).getTotalGastos(Mes.values()[j]);
				if(gastoMes > max_consumo) {
					max_consumo = gastoMes;
					max_nombre = Mes.values()[j];
				}
			}
			System.out.println("Rubro: " + rubros.get(i).getNombre());
			System.out.println("Mes de mayor consumo: " + max_nombre); //aca tampoco entendí bien, recorrí todos los rubros y saqué el nombre e importe del mes con mayor importe de cada rubro...
			System.out.println("Importe: " + max_consumo);
		}
	}

}
