package abstractFactory.fabricas;

import javax.swing.JOptionPane;

import abstractFactory.clases.Taxi;
import abstractFactory.interfaces.Vehiculo;
import abstractFactory.interfaces.VehiculoDeTransporte;

/**
 * si se implementa otra factoria nueva solo es crear 
 * la clase concreta como bus, buseta, taxi y crear la fatoria
 * que implemente la interfaz que tiene el metodo donde se define
 * el metodo del servicio 
 * @author mac
 *
 */
public class FabricaTaxis implements VehiculoDeTransporte{

	@Override
	public Vehiculo crearVehiculo() {
		Taxi taxi = new Taxi();
		taxi.setCodigo(taxi.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Taxi");
		return taxi;
	}

}
