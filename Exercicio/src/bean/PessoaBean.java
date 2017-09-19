package bean;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Pessoa;

@ManagedBean
public class PessoaBean {
	
	private Pessoa pessoa = new Pessoa();

    public Pessoa getPessoa() {
        return pessoa;
    }
	
	
	public void gravar() {
		System.out.println("Gravando pessoa " + this.pessoa.getNome());
				
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicio");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(this.pessoa);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
