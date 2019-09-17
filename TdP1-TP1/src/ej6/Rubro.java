package ej6;

public class Rubro {

	final static int TOTAL_MESES = 12;

	private String nombre;
	private double[] gastosPorMes;

	public Rubro(String nombre) {
		this.nombre = nombre;
		gastosPorMes = new double[TOTAL_MESES];
	}

	private void inicializarGastos() {
		gastosPorMes = new double[TOTAL_MESES];
	}

	public void agregarGasto(Mes mes, double importe) {
		gastosPorMes[mes.ordinal()] += importe;
	}

	public String getNombre() {
		return nombre;
	}

	public double getTotalGastos(Mes mes) {
		return gastosPorMes[mes.ordinal()];
	}

}
