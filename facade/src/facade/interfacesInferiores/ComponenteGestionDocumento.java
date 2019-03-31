package facade.interfacesInferiores;

public class ComponenteGestionDocumento implements GestionDocumento {
	public String documento(int indice) {
		return "Documento número " + indice;
	}
}
