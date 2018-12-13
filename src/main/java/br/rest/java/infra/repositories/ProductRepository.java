package br.rest.java.infra.repositories;

public class ProductRepository {
	public String URL = "";
	public String URL1 = "";
	public String URL2 = "";
	
	private final String DB = "warehouse";
	private final String USER = "admin";
	private final String PASS = "admin";
	private final String SERVER = "127.0.0.1";
	private final String PORT = "5432";

	@SuppressWarnings("unused")	
	public ProductRepository() {
		
		URL1 = String.format("jdbc:postgresql://%ip:%port/%db", SERVER, PORT, DB);
		String template = String.format("jdbc:postgresql://{0}:{1}/{2}");
		URL2 = String.format(template, SERVER, PORT, DB);
		

	}

	String test = String.format("test goes here %s more text", "Testing");

}
