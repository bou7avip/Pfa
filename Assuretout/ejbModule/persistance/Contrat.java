package persistance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contrat  implements Serializable {

		private static final long serialVersionUID = 1L;
		private int idContrat;
		private Date datContrat;
		private String libContrat;
		private String etatContrat;
		private Client cliContrat;

		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public int getIdContrat() {
			return idContrat;
		}
		public void setIdContrat(int idContrat) {
			this.idContrat = idContrat;
		}
		@Temporal(TemporalType.DATE)
		public Date getDatContrat() {
			return datContrat;
		}
		public void setDatContrat(Date datContrat) {
			this.datContrat = datContrat;
		}
		public String getLibContrat() {
			return libContrat;
		}
		public void setLibContrat(String libContrat) {
			this.libContrat = libContrat;
		}
		public String getEtatContrat() {
			return etatContrat;
		}
		public void setEtatContrat(String etatContrat) {
			this.etatContrat = etatContrat;
		}
		@ManyToOne(cascade=CascadeType.ALL)
		public Client getCliContrat() {
			return cliContrat;
		}
		public void setCliContrat(Client cliContrat) {
			this.cliContrat = cliContrat;
		}

		public Contrat() {
			super();
		}
		public Contrat(Date datContrat, String libContrat, String etatContrat,
				Client cliContrat) {
			super();
			this.datContrat = datContrat;
			this.libContrat = libContrat;
			this.etatContrat = etatContrat;
			this.cliContrat = cliContrat;

		}
		
		
		
		
		

}
