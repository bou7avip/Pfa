package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import persistance.Personne;

/**
 * Session Bean implementation class GestionPersonne
 */
@Stateless
@LocalBean
public class GestionPersonne implements GestionPersonneRemote, GestionPersonneLocal {
@PersistenceContext
EntityManager em;
    /**
     * Default constructor. 
     */
    public GestionPersonne() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void createPersonne(Personne p) {
		// TODO Auto-generated method stub
		em.persist(p);
	}

	@Override
	public void updatePersonne(Personne p) {
		// TODO Auto-generated method stub
		em.merge(p);
	}

	@Override
	public void deletePersonne(Personne p) {
		// TODO Auto-generated method stub
		em.remove(p);
	}

	@Override
	public Personne getPersonnebyID(int id) {
		Personne pers=em.find(Personne.class, id);	
		
		return pers;
	}

	@Override
	public List<Personne> getAllPersonne() {
		Query query=em.createQuery("select e from Personne e");
		return query.getResultList();
	}

}
