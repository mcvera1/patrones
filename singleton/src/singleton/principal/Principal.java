package singleton.principal;

import singleton.classSingleton.Configurador;

public class Principal {
	public static void main(String arg[]) {
		Configurador c = Configurador.singleton("myUrl", "myDb");
		System.err.println(c.getUrl());
	}

}
