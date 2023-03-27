package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;

	public Automovil(String placa, String nombre, double precio, double peso, Fabricante fabricante,int puestos) {
		super(placa, 4, 100, nombre, precio,  peso,"FWD", fabricante);
		this.puestos = puestos;
		aumentarAutomovil();
		this.getFabricante().getPais();
	}

	public void aumentarAutomovil() {
		cantAutomovil +=1;
	}
	
	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	 
	
}
