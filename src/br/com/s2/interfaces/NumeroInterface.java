package br.com.s2.interfaces;

import java.util.List;

public interface NumeroInterface {

	Integer gerarNumero(Integer numero1, Integer numero2);
	
	List<Integer> separarNumeroEmDigitos(Integer numero);
	
	Integer gerarNumeroApartirDeDoisInteirosMesmoTamanho(List<Integer> numero1, List<Integer> numero2);
	
	Integer gerarNumerosApartirDeDoisInteirosTamanhoDiferente(List<Integer> numero1, List<Integer> numero2) throws Exception;
}
