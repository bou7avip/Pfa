package persistance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Message implements Serializable{
		private static final long serialVersionUID = 1L;
		private int id;
		private Date dat;
		private int pera;
		private int perb;
		private String text;
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		@Temporal(TemporalType.DATE)
		public Date getDat() {
			return dat;
		}
		public void setDat(Date dat) {
			this.dat = dat;
		}
		public int  getPera() {
			return pera;
		}
		public void setPera(int pera) {
			this.pera = pera;
		}
		public int  getPerb() {
			return perb;
		}
		public void setPerb(int perb) {
			this.perb = perb;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public Message(int id, Date dat, int pera, int perb,
				String text) {
			super();
			this.id = id;
			this.dat = dat;
			this.pera = pera;
			this.perb = perb;
			this.text = text;
		}
		
		public Message() {
			super();
		}

}
