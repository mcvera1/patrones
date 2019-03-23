package creacionales.principal;

import creacionales.concreteBuilder.RenaultBuilder;
import creacionales.director.AutoDirector;
import creacionales.dto.Auto;

public class Principal {
	public static void main(String arg[]) {
		AutoDirector autoDirector = new AutoDirector();
		autoDirector.setAutoBuilder(new RenaultBuilder());
		autoDirector.construirAuto();
		Auto auto = autoDirector.getAutoBuilder();
		
		System.err.println(auto.getMarca());
		System.err.println(auto.getModelo());
	}
}
