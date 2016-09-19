package treino;

public class Palindromo {
	String palavra;
	
	public boolean validarPalindromo(String palavra){
		int fim = palavra.length() - 1;
		int i;
		
		for(i = 0; i < palavra.length() / 2; i++, fim--){
			if( palavra.charAt(i) != palavra.charAt(fim) )
				break;
		}
		
		if( i == palavra.length() / 2 )
			return true;
		else
			return false;		
	}
	
}
