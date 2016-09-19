package treino;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LogAcesso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String Ip;
	private String UserAgent;
	private String Host;
	private Date DataAtual;
	private String AcceptLanguage;
	private String Reposta;
	
	public LogAcesso(){
		
	}
	
	public String getIp() {
		return Ip;
	}
	public void setIp(String ip) {
		Ip = ip;
	}
	public String getUserAgent() {
		return UserAgent;
	}
	public void setUserAgent(String userAgent) {
		UserAgent = userAgent;
	}
	public String getHost() {
		return Host;
	}
	public void setHost(String host) {
		Host = host;
	}
	public Date getDataAtual() {
		return DataAtual;
	}
	public void setDataAtual(Date dataAtual) {
		DataAtual = dataAtual;
	}
	public String getAcceptLanguage() {
		return AcceptLanguage;
	}
	public void setAcceptLanguage(String acceptLanguage) {
		AcceptLanguage = acceptLanguage;
	}

	public String getReposta() {
		return Reposta;
	}

	public void setReposta(String reposta) {
		Reposta = reposta;
	}
	
	
	
}
