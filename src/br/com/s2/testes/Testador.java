package br.com.s2.testes;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.s2.util.NumeroUtil;

public class Testador {
	
	private NumeroUtil util;
	private Integer numeroGerado;
	
	@Before
	public void criaUtilNumero() {
		this.util = new NumeroUtil();
	}
	
	@Test
	public void deveRetornarInteiroSeNumerosTiveremMesmoTamanho(){
		Integer numero1 = 5437;
		Integer numero2 = 3445;
		
		List<Integer> primeiroNumero = util.separarNumeroEmDigitos(numero1);
		List<Integer> segundoNumero = util.separarNumeroEmDigitos(numero2);
		
		try {
			numeroGerado = util.gerarNumeroApartirDeDoisInteirosMesmoTamanho(primeiroNumero, segundoNumero);
		}catch(Exception e) {
			numeroGerado = -1;
		}
		
		Assert.assertEquals(Integer.valueOf(53443475), numeroGerado);
	}
	
	@Test
	public void deveRetornarInteiroSeNumerosTiveremTamanhoDiferente(){
		Integer numero1 = 5437;
		Integer numero2 = 34;
		
		List<Integer> primeiroNumero = util.separarNumeroEmDigitos(numero1);
		List<Integer> segundoNumero = util.separarNumeroEmDigitos(numero2);
		
		try {
			numeroGerado = util.gerarNumerosApartirDeDoisInteirosTamanhoDiferente(primeiroNumero, segundoNumero);
		}catch(Exception e) {
			numeroGerado = -1;
		}
		
		Assert.assertEquals(Integer.valueOf(534437), numeroGerado);
	}
	
	@Test
	public void naoDeveAceitarNumeroMaiorQueUmMilhao(){
		Integer numero1 = 54378975;
		Integer numero2 = 34;
		
		List<Integer> primeiroNumero = util.separarNumeroEmDigitos(numero1);
		List<Integer> segundoNumero = util.separarNumeroEmDigitos(numero2);
		
		try {
			numeroGerado = util.gerarNumerosApartirDeDoisInteirosTamanhoDiferente(primeiroNumero, segundoNumero);
		}catch(Exception e) {
			numeroGerado = -1;
		}
		
		Assert.assertEquals(Integer.valueOf(-1), numeroGerado);
	}
	
}
