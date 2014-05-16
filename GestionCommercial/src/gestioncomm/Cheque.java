package gestioncomm;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table(name="cheque")
public class Cheque {
	@GeneratedValue
	@Id	
	private int idcheque  ;
	
	private int  numpaiment;

	private double  mont;
	
	private String banque;
	
	private String nom;
	
	private String prenom;
	public Cheque(){
		super();
		
	}
	public Cheque (int idcheque,int  nump,double mnt, String bq, String nom ,String pr) {
		super();
		
		
		this.idcheque=idcheque;
		this.numpaiment=nump;
		this.mont=mnt;
		this.banque=bq;
		this.nom=nom;
		this.prenom=pr;
		
}
	
	public double getMont() {
		return mont;
	}
	public void setMont(double mont) {
		this.mont = mont;
	}
	public int getIdcheque() {
		return idcheque;
	}
	public void setIdcheque(int idcheque) {
		this.idcheque = idcheque;
	}
	public int getNumpaiment() {
		return numpaiment;
	}
	public void setNumpaiment(int numpaiment) {
		this.numpaiment = numpaiment;
	}
	public String getBanque() {
		return banque;
	}
	public void setBanque(String banque) {
		this.banque = banque;
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