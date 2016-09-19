package treino;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RequestDao {
	public EntityManager getEM(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("API_Palindromo");
		return factory.createEntityManager();
	}
	
	public LogAcesso salvar(LogAcesso logAcesso){
		EntityManager em = getEM();

		em.getTransaction().begin();
		em.persist(logAcesso);
		em.getTransaction().commit();
		
		return logAcesso;
		
	}
	
}
