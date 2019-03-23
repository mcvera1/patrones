package abstractFactory.clases;

import javax.swing.JOptionPane;

import abstractFactory.interfaces.Vehiculo;

public class Taxi implements Vehiculo{
	private int codigo;
	
	 public int generarCodigo()
	 {
	  int codigoTaxi=(int) (Math.random()*9999);
	  return codigoTaxi;
	 }
	 public int getCodigo() {
	  return codigo;
	 }
	 public void setCodigo(int codigo) {
	  this.codigo = codigo;
	 }
	 public void codigoDeVehiculo() {
	  JOptionPane.showMessageDialog(null,"El Codigo del Taxi es : "+getCodigo());
	 }
}
