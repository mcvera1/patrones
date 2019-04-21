package singleton.classSingleton;

public class Configurador {
	private String url;
	private String db;
	private static Configurador configurador;
	
	public static Configurador singleton(String url, String db) {
		if(configurador == null) {
			configurador = new Configurador(url, db);
		}
		return configurador;
	}
	
	private Configurador(String url, String db) {
		this.url = url;
		this.db = db;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

}
