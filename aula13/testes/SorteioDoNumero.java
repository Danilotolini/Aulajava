package aula13.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import aula13.MegasenaUtilitario;

class SorteioDoNumero {
	@Test
	void geracaoDeNumeroPositivo() {
		int numeroMaiorQueZero = MegasenaUtilitario.sortearNumero();
		assertTrue(numeroMaiorQueZero > 0);
	}
	@Test
	void geracaoDeNumeroMenorOuIgualASessenta() {
		int numeroMenorIgualSessenta = MegasenaUtilitario.sortearNumero();
		assertTrue(numeroMenorIgualSessenta <= 60);
	}	
}