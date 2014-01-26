package persistance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Client extends Personne implements Serializable{
	private static final long serialVersionUID = 1L;
	
	int type;
	private java.util.Collection<Contrat> contrcli;
	private Coutier courtierclient;
	

	@ManyToOne
	public Coutier getCourtierclient() {
		return courtierclient;
	}

	public void setCourtierclient(Coutier courtierclient) {
		this.courtierclient = courtierclient;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	@OneToMany(mappedBy="cliContrat")
	public java.util.Collection<Contrat> getContr() {
		return contrcli;
	}

	public void setContr(java.util.Collection<Contrat> contr) {
		this.contrcli = contr;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nomPersonne, String prePersonne, Date datenaiPersonne,
			String telPersonne, String adrPersonne, String villePersonne,
			String codePersonne, String mailPersonne, String pwdPersonne ,int type) {
		super(nomPersonne, prePersonne, datenaiPersonne, telPersonne, adrPersonne,
				villePersonne, codePersonne, mailPersonne, pwdPersonne);
		this.type=type;
		
		// TODO Auto-generated constructor stub
	}

	
	

}
