package vehiculos;

import java.util.ArrayList;
public class Fabricante{
  private String nombre;
  private Pais pais;
  static ArrayList<Pais> listaPaises= new ArrayList<Pais>();
  public Fabricante(String nombre, Pais pais){
    this.nombre=nombre;
    this.pais=pais;
    listaPaises.add(pais);
  }
  public void setPais(Pais pais){
    this.pais=pais;
  }
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public String getNombre(){
    return nombre;
  }
  public Pais getPais(){
    return pais;
  }
  public static Fabricante fabricaMayorVentas(){
    return Vehiculo.checkFabricantes();
  }
  public static Pais checkPaises(){
    int contador1=0;
    Pais p1=null;
    for(Pais i:listaPaises){
      int contador2=0;
      for(Pais x:listaPaises){
        if(i.getNombre()==x.getNombre()){
          contador2+=1;
        }
      }
      if (contador2>contador1){
        contador1=contador2;
        p1=i;
      }   
    }
    return p1;
  }
}
