package abstractFactory.fabricas;

import javax.swing.JOptionPane;

import abstractFactory.clases.Busetas;
import abstractFactory.interfaces.Vehiculo;
import abstractFactory.interfaces.VehiculoDeTransporte;

public class FabricaBusetas implements VehiculoDeTransporte{
	 
	@Override
	 public Vehiculo crearVehiculo() {
	  Busetas miBuseta=new Busetas();
	  miBuseta.setCodigo(miBuseta.generarCodigo());
	  JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Buseta");
	  return miBuseta;
	} 
}
