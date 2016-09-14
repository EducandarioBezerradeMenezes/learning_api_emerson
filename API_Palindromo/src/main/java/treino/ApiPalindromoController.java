package treino;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiPalindromoController {
		
	//Quando chama o / do local rost ele responde uma frase qualquer
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<String> palindromo(){
		String temp = "Ola Milk te love";
		return new ResponseEntity<String>(temp, HttpStatus.OK);
	}
	
	//Teste passando algum tipo de valor
	@RequestMapping(value = "/{palavra}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> RecebeNumero(@PathVariable("palavra") String palavra){
		String resp;
		
		Palindromo objPalidromo = new Palindromo();
		
		//System.out.println( String.valueOf( request.getProtocol() ) );
		
		if( objPalidromo.validarPalindromo(palavra) )
			resp = palavra + " É um palindromo";
		else
			resp = palavra + " Não é um Palindromo";
		
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}
	
}
