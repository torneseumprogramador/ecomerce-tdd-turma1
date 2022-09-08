package com.didox.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProdutosTests {

	@Test
	void validarPropriedadesProduto() {
		var produto = new Produto();
		produto.setCodigo("mte333");
		produto.setNome("Peça para capa do carro");
		produto.setDescricao("Esta peça é fundamental para a capa");
		produto.setQuantidade(100);
		produto.setValor(5.80);
		
		assertEquals("MTE333", produto.getCodigo());
		assertEquals("Peça para capa do carro", produto.getNome());
		assertEquals("Esta peça é fundamental para a capa", produto.getDescricao());
		assertEquals(100, produto.getQuantidade());
		assertEquals(5.80, produto.getValor());
	}

	@Test
	void aoSetarNomeGeraCodigoCasoCodigoVazio() {
		var produto = new Produto();
		produto.setNome("Peça para capa do carro");
		assertEquals("PEÇ-23", produto.getCodigo());
	}

	@Test
	void aoSetarNomeGeraCodigoCasoCodigoVazio2() {
		var produto = new Produto();
		produto.setNome("Roda do carro");
		assertEquals("ROD-13", produto.getCodigo());
	}

	@Test
	void aoSetarNomeNaoGeraCodigoCasoCodigoPreenchido() {
		var produto = new Produto();
		produto.setCodigo("TTT-001");
		produto.setNome("Peça para capa do carro");
		assertEquals("TTT-001", produto.getCodigo());
	}
}
