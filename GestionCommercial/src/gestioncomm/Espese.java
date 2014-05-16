package gestioncomm;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Espese {
	@GeneratedValue
	@Id	
	@Column(name="idEspese")
	private int idespse  ;
	@Column(name="Numero Paiment")
	private int  numpaiment;
	@Column(name="Remise")
	private String remise;
	@Column(name="Nom")
	private String nom;
	@Column(name="Prenom")
	private String prenom;
	public Espese(){
		super();
		
	}
	public Espese (int idesp,int  nump, String remise, String nom ,String pr) {
		super();
		
		this.remise=remise;
		this.idespse=idesp;
		this.numpaiment=nump;
		this.nom=nom;
		this.prenom=pr;
}
	public int getIdespse() {
		return idespse;
	}
	public void setIdespse(int idespse) {
		this.idespse = idespse;
	}
	public int getNumpaiment() {
		return numpaiment;
	}
	public void setNumpaiment(int numpaiment) {
		this.numpaiment = numpaiment;
	}
	public String getRemise() {
		return remise;
	}
	public void setRemise(String remise) {
		this.remise = remise;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
