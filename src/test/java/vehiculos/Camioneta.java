package vehiculos;

public class Camioneta extends Vehiculo{
	private boolean volco;
	
	public Camioneta(String placa,int puertas, String nombre, double precio, double peso, Fabricante fabricante, boolean volco) {
		super( placa,  puertas, 90,  nombre,  precio, peso,"4X4", fabricante);
		this.volco = volco;
		aumentarCamioneta();
		listaDePaises.add(fabricante.getPais().getNombre());
		listaDeFabricantes.add(fabricante.getNombre());
	}
	
	public void aumentarCamioneta() {
		cantCamioneta +=1;
	}
	
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}

}
