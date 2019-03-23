package creacionales.concreteBuilder;

import creacionales.builder.AutoBuilder;
import creacionales.dto.Motor;

public class RenaultBuilder extends AutoBuilder{

	@Override
	public void buildMotor() {
		Motor motor = new Motor();
		motor.setNumero(2000);
		motor.setPotencia("1600");
		auto.setMotor(motor);
	}

	@Override
	public void buildModelo() {
		auto.setModelo("2016");
		
	}

	@Override
	public void buildMarca() {
		auto.setMarca("Renault");
		
	}

	@Override
	public void buildPuertas() {
		auto.setCantidadDePuertas(5);
		
	}

}
