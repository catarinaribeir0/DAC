package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Pereirao");
		pessoa.setEmail("teste@teste");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicio");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(pessoa);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
