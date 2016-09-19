package treino;


import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiPalindromoController {
	
	//Quando chama o / do local rost ele responde uma frase qualquer
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<String> index(){
		String temp = "Ola Milk te love";
		
		return new ResponseEntity<String>(temp, HttpStatus.OK);
	}
	
	//Teste passando algum tipo de valor
	@RequestMapping(value = "/{palavra}", method = RequestMethod.GET)
	public ResponseEntity<String> isPalindromo(@PathVariable("palavra") String palavra,
			@RequestHeader("user-agent") String userAgent,
			@RequestHeader("host") String host,
			@RequestHeader("accept-language") String acceptLanguage){
		String resp;
		
		Palindromo objPalidromo = new Palindromo();
		
		if( objPalidromo.validarPalindromo(palavra) )
			resp = palavra + " É um palindromo";
		else
			resp = palavra + " Não é um Palindromo";
		
		RequestDao dao = new RequestDao();
		
		String erro = "Resposta";
		LogAcesso objLog = new LogAcesso();
		
		objLog.setReposta(resp);
		objLog.setDataAtual( new Date( new java.util.Date().getTime() ) );
		objLog.setUserAgent(userAgent);
		objLog.setHost(host);
		objLog.setAcceptLanguage(acceptLanguage);
		
		dao.salvar(objLog);
		
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}
	
}
