package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import persistance.Client;
import persistance.Contrat;
import persistance.Coutier;
import persistance.Expert;
import persistance.Personne;
import persistance.Redacteur;

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
	public Personne getPersonnebyID(int id) {
		Personne pers=em.find(Personne.class, id);	
		
		return pers;
	}

	@Override

	public void createClient(Client p) {
		// TODO Auto-generated method stub
		em.persist(p);
	}

	@Override
	public void updateClient(Client p) {
		// TODO Auto-generated method stub
		em.merge(p);
	}

	@Override
	public void deleteClient(Client p) {
		// TODO Auto-generated method stub
		em.remove(p);
	}

	@Override
	public void createRedacteur(Redacteur p) {
		// TODO Auto-generated method stub
		em.persist(p);
	}

	@Override
	public void updateRedacteur(Redacteur p) {
		// TODO Auto-generated method stub
		em.merge(p);
	}

	@Override
	public void deleteRedacteur(Redacteur p) {
		// TODO Auto-generated method stub
		em.remove(p);
	}

	@Override
	public void createExpert(Expert p) {
		// TODO Auto-generated method stub
		em.persist(p);
	}

	@Override
	public void updateExpert(Expert p) {
		// TODO Auto-generated method stub
		em.merge(p);
	}

	@Override
	public void deleteExpert(Expert p) {
		// TODO Auto-generated method stub
		em.remove(p);
	}

	@Override
	public void createCourtier(Coutier p) {
		// TODO Auto-generated method stub
		em.persist(p);
	}

	@Override
	public void updateCourtier(Coutier p) {
		// TODO Auto-generated method stub
		em.merge(p);
	}

	@Override
	public void deleteCourtier(Coutier p) {
		// TODO Auto-generated method stub
		em.remove(p);
	}



	@Override
	public List<Expert> getAllExpert() {
		Query query=em.createQuery("select e from Expert e");
		return query.getResultList();
	}



	@Override
	public List<Client> getAllClient() {
		Query query=em.createQuery("select e from Client e");
		return query.getResultList();
	}



	@Override
	public List<Redacteur> getAllRedacteur() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("select e from Redacteur e");
		return query.getResultList();
	}



	@Override
	public List<Coutier> getAllCourtier() {
		Query query=em.createQuery("select e from Coutier e");
		return query.getResultList();
	}



	@Override
	public void createContrat(Contrat p) {
		// TODO Auto-generated method stub
		em.persist(p);
	

	
			
		
			
	}



	@Override
	public void updateContrat(Contrat p) {
		// TODO Auto-generated method stub
		em.merge(p);
	}



	@Override
	public void deleteContrat(Contrat p) {
		// TODO Auto-generated method stub
		em.remove(p);
	}



	@Override
	public List<Contrat> getAllContrat() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("select e from Contrat e");
		return query.getResultList();
	}

}
