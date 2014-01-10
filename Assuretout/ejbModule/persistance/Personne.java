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
public class Personne implements Serializable{

	public Personne() {
		// TODO Auto-generated constructor stub
	}
private int idPersonne;
private String nomPersonne;
private String prePersonne;
private Date datenaiPersonne;
private String telPersonne;
private String adrPersonne;
private String villePersonne;
private String codePersonne;
private String mailPersonne;
private String pwdPersonne;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getIdPersonne() {
	return idPersonne;
}
public void setIdPersonne(int idPersonne) {
	this.idPersonne = idPersonne;
}
public String getNomPersonne() {
	return nomPersonne;
}
public void setNomPersonne(String nomPersonne) {
	this.nomPersonne = nomPersonne;
}
public String getPrePersonne() {
	return prePersonne;
}
public void setPrePersonne(String prePersonne) {
	this.prePersonne = prePersonne;
}
@Temporal(TemporalType.DATE)
public Date getDatenaiPersonne() {
	return datenaiPersonne;
}
public void setDatenaiPersonne(Date datenaiPersonne) {
	this.datenaiPersonne = datenaiPersonne;
}
public String getTelPersonne() {
	return telPersonne;
}
public void setTelPersonne(String telPersonne) {
	this.telPersonne = telPersonne;
}
public String getAdrPersonne() {
	return adrPersonne;
}
public void setAdrPersonne(String adrPersonne) {
	this.adrPersonne = adrPersonne;
}
public String getVillePersonne() {
	return villePersonne;
}
public void setVillePersonne(String villePersonne) {
	this.villePersonne = villePersonne;
}
public String getCodePersonne() {
	return codePersonne;
}
public void setCodePersonne(String codePersonne) {
	this.codePersonne = codePersonne;
}
public String getMailPersonne() {
	return mailPersonne;
}
public void setMailPersonne(String mailPersonne) {
	this.mailPersonne = mailPersonne;
}
public String getPwdPersonne() {
	return pwdPersonne;
}
public void setPwdPersonne(String pwdPersonne) {
	this.pwdPersonne = pwdPersonne;
}
public Personne(String nomPersonne, String prePersonne, Date datenaiPersonne,
		String telPersonne, String adrPersonne, String villePersonne,
		String codePersonne, String mailPersonne, String pwdPersonne) {
	super();
	this.nomPersonne = nomPersonne;
	this.prePersonne = prePersonne;
	this.datenaiPersonne = datenaiPersonne;
	this.telPersonne = telPersonne;
	this.adrPersonne = adrPersonne;
	this.villePersonne = villePersonne;
	this.codePersonne = codePersonne;
	this.mailPersonne = mailPersonne;
	this.pwdPersonne = pwdPersonne;
}

}
