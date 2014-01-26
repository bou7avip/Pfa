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
import persistance.Message;
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
		em.remove(em.contains(p) ? p : em.merge(p));
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
		em.remove(em.contains(p) ? p : em.merge(p));
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
		em.remove(em.contains(p) ? p : em.merge(p));
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
		em.remove(em.contains(p) ? p : em.merge(p));
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
		em.remove(em.contains(p) ? p : em.merge(p));
	}



	@Override
	public List<Contrat> getAllContrat() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("select e from Contrat e");
		return query.getResultList();
	}



	public Personne getUser(String log, String pwd) {
		// TODO Auto-generated method stub
		String queryt="select r from Client r where ((r.mailPersonne= :login) and (r.pwdPersonne= :pwd))";
		Query query=em.createQuery(queryt).setParameter("login",log);
		query.setParameter("pwd", pwd);
	if(query != null)
	
			return (Personne) query.getSingleResult();
	else
		return null;
	}



	@Override
	public List<Contrat> getContratuser(Client cl) {
		String queryt="select e from Contrat e where e.cliContrat= :client) ";
		Query query=em.createQuery(queryt).setParameter("client",cl);
		
		return query.getResultList();
	}



	@Override
	public void addcourtierclient(Coutier p, Client cl) {
		// TODO Auto-generated method stub
		cl.setCourtierclient(p);
		em.merge(cl);
	}



	@Override
	public void createMessage(Message p) {
		// TODO Auto-generated method stub
		em.persist(p);
	}



	@Override
	public List<Message> getMessage(Personne cl) {
		// TODO Auto-generated method stub
		String queryt="select e from Message e where ((e.pera= :client) or (e.perb=:client)) ";
		Query query=em.createQuery(queryt).setParameter("client",cl);
		
		return query.getResultList();
	}

}
