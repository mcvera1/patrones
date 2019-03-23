package creacionales.director;

import creacionales.builder.AutoBuilder;
import creacionales.dto.Auto;

public class AutoDirector {
	private AutoBuilder autoBuilder;
	
	public void construirAuto() {
		autoBuilder.crearAuto();
		autoBuilder.buildMarca();
		autoBuilder.buildModelo();
		autoBuilder.buildMotor();
		autoBuilder.buildPuertas();
	}

	public Auto getAutoBuilder() {
		return autoBuilder.getAuto();
	}

	public void setAutoBuilder(AutoBuilder autoBuilder) {
		this.autoBuilder = autoBuilder;
	}
	
	
}
