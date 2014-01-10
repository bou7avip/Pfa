package services;

import java.util.List;

import javax.ejb.Remote;

import persistance.Personne;

@Remote
public interface GestionPersonneRemote {
public void createPersonne(Personne p);
public void updatePersonne(Personne p);
public void deletePersonne(Personne p);
public Personne getPersonnebyID(int id);
public List<Personne> getAllPersonne();
}
