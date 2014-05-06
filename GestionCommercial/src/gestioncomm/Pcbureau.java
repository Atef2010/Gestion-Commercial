package gestioncomm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.JComboBox;

@Entity
@Table(name="pcbureau")

public class Pcbureau {
	@GeneratedValue
	@Id	
	private int idpc;
	private String processeur ;
	private String systemex ;
	private String cartegr ;
	private String ecran ;
	
	public  Pcbureau ()
	{
		super();
	}
	public  Pcbureau (int idpc ,String pr ,String sys , String cart ,String ecran)
	{
		this.idpc=idpc;
		this.processeur=pr;
		this.systemex=sys;
		this.cartegr=cart;
		this.ecran=ecran;
	}
	public int getIdpc() {
		return idpc;
	}
	public void setIdpc(int idpc) {
		this.idpc = idpc;
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
	public String getCartegr() {
		return cartegr;
	}
	public void setCartegr(String cartegr) {
		this.cartegr = cartegr;
	}
	public String getEcran() {
		return ecran;
	}
	public void setEcran(String ecran) {
		this.ecran = ecran;
	}
	
}
