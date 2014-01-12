package services;

import java.util.List;

import javax.ejb.Remote;

import persistance.Client;
import persistance.Contrat;
import persistance.Coutier;
import persistance.Expert;
import persistance.Personne;
import persistance.Redacteur;

@Remote
public interface GestionPersonneRemote {
public void createClient(Client p);
public void updateClient(Client p);
public void deleteClient(Client p);

public void createContrat(Contrat p);
public void updateContrat(Contrat p);
public void deleteContrat(Contrat p);

public void createRedacteur(Redacteur p);
public void updateRedacteur(Redacteur p);
public void deleteRedacteur(Redacteur p);

public void createExpert(Expert p);
public void updateExpert(Expert p);
public void deleteExpert(Expert p);

public void createCourtier(Coutier p);
public void updateCourtier(Coutier p);
public void deleteCourtier(Coutier p);

public Personne getPersonnebyID(int id);
public List<Contrat> getAllContrat();
public List<Expert> getAllExpert();
public List<Client> getAllClient();
public List<Redacteur> getAllRedacteur();
public List<Coutier> getAllCourtier();
}
