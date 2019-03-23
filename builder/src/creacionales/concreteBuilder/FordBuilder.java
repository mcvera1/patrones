package creacionales.concreteBuilder;

import creacionales.builder.AutoBuilder;
import creacionales.dto.Motor;

public class FordBuilder extends AutoBuilder{

	@Override
	public void buildMotor() {
		Motor motor = new Motor();
		motor.setNumero(2019);
		motor.setPotencia("2000");
		auto.setMotor(motor);
	}

	@Override
	public void buildModelo() {
		auto.setModelo("2019");
		
	}

	@Override
	public void buildMarca() {
		auto.setMarca("Ford");
		
	}

	@Override
	public void buildPuertas() {
		auto.setCantidadDePuertas(5);
		
	}

}
