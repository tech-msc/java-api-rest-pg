package br.rest.java.infra.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.rest.java.infra.repositories.ProductRepository;
import br.rest.java.shared.Strings;

class ProductRepositoryTests {

	@Test
	void UrlDatabaseIsNull() {

		ProductRepository p = new ProductRepository();

		assertTrue(Strings.IsNullOrEmpty(p.URL1));

	}

}
