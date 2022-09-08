package com.didox.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientesTests {

	@Test
	void validarPropriedadesCliente() {
		var cliente = new Cliente();
		
		cliente.setNome("Danilo");
		cliente.setEmail("danilo@teste.com");
		cliente.setSenha("123456");
		cliente.setEndereco("Rua teste123");
		cliente.setNumero("a133");
		cliente.setBairro("Um Bairro");
		cliente.setCidade("Uma Cidade");
		cliente.setEstado("Um Estado");
		cliente.setCep("00000-000");
		cliente.setComplemento("Casa 1");
		
		assertEquals("Danilo", cliente.getNome());
		assertEquals("danilo@teste.com", cliente.getEmail());
		assertEquals("123456", cliente.getSenha());
		assertEquals("Rua teste123", cliente.getEndereco());
		assertEquals("A133", cliente.getNumero());
		assertEquals("Um Bairro", cliente.getBairro());
		assertEquals("Uma Cidade", cliente.getCidade());
		assertEquals("Um Estado", cliente.getEstado());
		assertEquals("00000-000", cliente.getCep());
		assertEquals("Casa 1", cliente.getComplemento());
	}

}
