package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SorteioDoNumero {

	@Test
	void geracaoDeNumeroPositivo() {
		int numeroMaiorQueZero = MegasenaUltilitario.sortearNumero(); 
		assertTrue(numeroMaiorQueZero > 0);
	} 
	@Test 
	void geracaoDeNumeroMenorOuIgualASessenta() { 
		int numeroMenorIgualSessenta = MegasenaUltilitario.sortearNumero(); 
		assertTrue(numeroMenorIgualSessenta <= 60);
	}

}
