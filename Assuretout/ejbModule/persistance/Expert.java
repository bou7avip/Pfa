package persistance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Expert extends Personne implements Serializable {

	private static final long serialVersionUID = 1L;

	public Expert() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Expert(String nomPersonne, String prePersonne, Date datenaiPersonne,
			String telPersonne, String adrPersonne, String villePersonne,
			String codePersonne, String mailPersonne, String pwdPersonne) {
		super(nomPersonne, prePersonne, datenaiPersonne, telPersonne, adrPersonne,
				villePersonne, codePersonne, mailPersonne, pwdPersonne);
		// TODO Auto-generated constructor stub
	}
	

}
