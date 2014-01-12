package persistance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
@Entity
public class Coutier extends Personne implements Serializable{

	private static final long serialVersionUID = 1L;

	private java.util.Collection<Client> clientcourtier;
	
	@OneToMany(mappedBy="courtierclient",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	public java.util.Collection<Client> getClientcourtier() {
		return clientcourtier;
	}

	public void setClientcourtier(java.util.Collection<Client> clientcourtier) {
		this.clientcourtier = clientcourtier;
	}

	

	public Coutier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coutier(String nomPersonne, String prePersonne,
			Date datenaiPersonne, String telPersonne, String adrPersonne,
			String villePersonne, String codePersonne, String mailPersonne,
			String pwdPersonne) {
		super(nomPersonne, prePersonne, datenaiPersonne, telPersonne, adrPersonne,
				villePersonne, codePersonne, mailPersonne, pwdPersonne);
		// TODO Auto-generated constructor stub
	}
	
	
}
