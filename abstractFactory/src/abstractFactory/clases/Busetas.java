package abstractFactory.clases;

import javax.swing.JOptionPane;

import abstractFactory.interfaces.Vehiculo;

public class Busetas implements Vehiculo{
	private int codigo;
	
	 public int generarCodigo()
	 {
	  int codigoBuseta=(int) (Math.random()*9999);
	  return codigoBuseta;
	 }
	 public int getCodigo() {
	  return codigo;
	 }
	 public void setCodigo(int codigo) {
	  this.codigo = codigo;
	 }
	 public void codigoDeVehiculo() {
	  JOptionPane.showMessageDialog(null,"El Codigo del Buseta es : "+getCodigo());
	 }
}
