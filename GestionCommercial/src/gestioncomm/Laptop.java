package gestioncomm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="laptop")

public class Laptop {
	@GeneratedValue
	@Id	
	private int idla;
	private String processeur ;
	private String systemex ;
	private String marque ;
	private String disque ;
	
	public  Laptop ()
	{
		super();
	}
	public Laptop (String pr ,String sys , String marque ,String disque)
	{
		
		this.processeur=pr;
		this.systemex=sys;
		this.marque=marque;
		this.disque=disque;
	}
	public int getIdla() {
		return idla;
	}
	public void setIdla(int idla) {
		this.idla = idla;
	}
	public String getProcesseur() {
		return processeur;
	}
	public void setProcesseur(String processeur) {
		this.processeur = processeur;
	}
	public String getSystemex() {
		return systemex;
	}
	public void setSystemex(String systemex) {
		this.systemex = systemex;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getDisque() {
		return disque;
	}
	public void setDisque(String disque) {
		this.disque = disque;
	}
	
}
