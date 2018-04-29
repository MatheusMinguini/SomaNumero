import java.util.List;

import br.com.s2.util.NumeroUtil;

public class Principal {

	public static void main(String[] args) {
		
		Integer numeroGerado;
		try{
			NumeroUtil util = new NumeroUtil();
			Integer numero1 = 5437;
			Integer numero2 = 34;
			
			List<Integer> primeiroNumero = util.separarNumeroEmDigitos(numero1);
			List<Integer> segundoNumero = util.separarNumeroEmDigitos(numero2);
			
			if(primeiroNumero.size() == segundoNumero.size()) 
				numeroGerado = util.gerarNumeroApartirDeDoisInteirosMesmoTamanho(primeiroNumero, segundoNumero);
			else
				numeroGerado = util.gerarNumerosApartirDeDoisInteirosTamanhoDiferente(primeiroNumero, segundoNumero);
		}catch(Exception e) {
			numeroGerado = -1;
		}
		
		System.out.println(numeroGerado);
	}

}
