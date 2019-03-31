package facade.principal;

import java.util.List;

import facade.interfacesFachada.WebServiceAuto;
import facade.interfacesFachada.WebServiceAutoImpl;

public class Principal {
	public static void main(String[] args) {
		WebServiceAuto webServiceAuto = new WebServiceAutoImpl();
		System.out.println(webServiceAuto.documento(0));
		System.out.println(webServiceAuto.documento(1));
		List<String> resultados = webServiceAuto.buscaVehiculos(6000, 1000);
		if (resultados.size() > 0) {
			System.out.println("Vehículo(s) cuyo precio está comprendido " + "entre 5000 y 7000");
			for (String resultado : resultados)
				System.out.println("   " + resultado);
		}
	}
}
