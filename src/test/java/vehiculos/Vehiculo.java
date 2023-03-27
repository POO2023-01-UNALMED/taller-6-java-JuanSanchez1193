package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private double precio;
	private double peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;
	//-------------------------------------//
	protected static int cantAutomovil= 0;
	protected static int cantCamion = 0;
	protected static int cantCamioneta = 0;
	static List<String> listaDePaises = new ArrayList<>();
	static List<String> listaDeFabricantes = new ArrayList<>();
	//------------------------------------//
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso,
			String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}

	public static void vehiculosPorTipo() {
		System.out.println("Automoviles:" + cantAutomovil+ "\n" + "Camionetas:" + cantCamioneta +"\n"+"Camiones:" + cantCamion);
	}
	public static void paisMasVendedor() {
		String masVendedor = null;
		int conteo= 0;
		
		for (int i = 0; i < listaDePaises.size(); i++) {
			String pais = listaDePaises.get(i);
			int repeticion = 0;
			
			for (int j = 0; j < listaDePaises.size(); j++) {
				if (listaDePaises.get(j).equals(pais)) {
			          repeticion++;
			        }

			}
		      if (repeticion > conteo) {
		    	  conteo = repeticion;
		          masVendedor = pais;
		        }
		}
		System.out.println(masVendedor);
	}
	public static void fabricaMayorVentas() {
		String masVendedor = null;
		int conteo= 0;
		
		for (int i = 0; i < listaDeFabricantes.size(); i++) {
			String pais = listaDeFabricantes.get(i);
			int repeticion = 0;
			
			for (int j = 0; j < listaDeFabricantes.size(); j++) {
				if (listaDeFabricantes.get(j).equals(pais)) {
			          repeticion++;
			        }

			}
		      if (repeticion > conteo) {
		    	  conteo = repeticion;
		          masVendedor = pais;
		        }
		}
		System.out.println(masVendedor);
	}
	

}

