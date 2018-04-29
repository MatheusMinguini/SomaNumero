package br.com.s2.util;

import java.util.ArrayList;
import java.util.List;

import br.com.s2.interfaces.NumeroInterface;

public class NumeroUtil implements NumeroInterface{

	@Override
	public Integer gerarNumero(Integer numero1, Integer numero2) {
		
		
		return null;
	}

	@Override
	public List<Integer> separarNumeroEmDigitos(Integer numero) {
		
		List<Integer> digitos = new ArrayList<Integer>();

		while (numero > 0) {
			digitos.add(0, numero % 10);
		    numero = numero/10;
		}
		
		return digitos;
	}

	@Override
	public Integer gerarNumeroApartirDeDoisInteirosMesmoTamanho(List<Integer> numero1, List<Integer> numero2) {
		StringBuilder numero = new StringBuilder();
		for(int i = 0; i < numero1.size(); i++) {
			numero.append(numero1.get(i));
			numero.append(numero2.get(i));
		}
		
	    Integer numeroRetorno = Integer.parseInt(numero.toString());
	    
	    return numeroRetorno;
	}

	@Override
	public Integer gerarNumerosApartirDeDoisInteirosTamanhoDiferente(List<Integer> numero1, List<Integer> numero2) throws Exception {
		
		List<Integer> listaMaior = new ArrayList<>();
		int diferencaTamanho = numero1.size() - numero2.size();
		
		if(diferencaTamanho < 0) diferencaTamanho = diferencaTamanho * - 1;
		
		int limitador;
		if(numero1.size() > numero2.size()) {
			listaMaior = numero1;
			limitador = numero1.size() - diferencaTamanho;
		}else {
			listaMaior = numero2;
			limitador = numero2.size() - diferencaTamanho;
		}
		
		StringBuilder numero = new StringBuilder();
		for(int i = 0; i < limitador; i++) {
			numero.append(numero1.get(i));
			numero.append(numero2.get(i));
		}
		
		for(int i = limitador; i < listaMaior.size() ; i++) {
			numero.append(listaMaior.get(i));	
		}
		
		Integer numeroRetorno = Integer.parseInt(numero.toString());
		
		if(numeroRetorno > 1000000) throw new NumberFormatException();
	    
	    return numeroRetorno;
	}


}
