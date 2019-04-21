package abstractFactory.principal;

import javax.swing.JOptionPane;

import abstractFactory.fabricas.FabricaBus;
import abstractFactory.fabricas.FabricaBusetas;
import abstractFactory.fabricas.FabricaTaxis;
import abstractFactory.fabricas.FabricaVehiculo;

/**
 * clase principal del aplicativo donde se establecen las instancias de las
 * fabricas
 * 
 * @author chenao
 *
 */
public class Principal {

	public static void main(String[] args) {
		FabricaBusetas busetas = new FabricaBusetas();
		FabricaTaxis taxi = new FabricaTaxis();
		FabricaBus buses = new FabricaBus();
		String cad = "", salida;
		cad += "Ingrese la opción correspondiente para obtener el codigo del servicio\n";
		cad += "1. Codigo servicio de Taxis\n";
		cad += "2. Codigo servicio de Buses\n";
		cad += "3. Codigo servicio de Busetas\n\n";
		try {
			do {
				try {
					int opcion = Integer.parseInt(JOptionPane.showInputDialog(cad));
					switch (opcion) {
					case 1:
						FabricaVehiculo.crearFabricaVehiculo(taxi);// el llama el metodo estatico
						break;
					case 2:
						FabricaVehiculo.crearFabricaVehiculo(buses);
						break;
					case 3:
						FabricaVehiculo.crearFabricaVehiculo(busetas);
						break;
					default:
						JOptionPane.showMessageDialog(null, "No es un valor de consultavalido");
						break;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No es un parametro de consulta valido");
				}
				salida = JOptionPane.showInputDialog("Desea consultar otro codigo? S/N");

			} while (salida.toUpperCase().equals("S"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Bye!!!");
		}
	}
}
