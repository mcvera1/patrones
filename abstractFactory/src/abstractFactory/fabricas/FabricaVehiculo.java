package abstractFactory.fabricas;

import abstractFactory.interfaces.Vehiculo;
import abstractFactory.interfaces.VehiculoDeTransporte;
/**
 * esta es la fabrica principal la que llama la interfaz
 * para la creacion de fabricas(bus buseta y taxi)
 * @author mac
 *
 */
public class FabricaVehiculo {
	
	public static void crearFabricaVehiculo(VehiculoDeTransporte fabrica) {
		Vehiculo objetoVehiculo = fabrica.crearVehiculo();//crear vehiculo es un metodo de la interfaz vehiculo de transporte que es de tipo vehiculo
		objetoVehiculo.codigoDeVehiculo();
	}

}
