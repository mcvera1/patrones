package abstractFactory.fabricas;

import javax.swing.JOptionPane;

import abstractFactory.clases.Bus;
import abstractFactory.interfaces.Vehiculo;
import abstractFactory.interfaces.VehiculoDeTransporte;

public class FabricaBus implements VehiculoDeTransporte{

	@Override
	public Vehiculo crearVehiculo() {
		Bus bus = new Bus();
		bus.setCodigo(bus.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Bus  ");
		return bus;
	}
	
	
}
