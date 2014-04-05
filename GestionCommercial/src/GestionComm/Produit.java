package GestionComm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produit")
public class Produit {
	@GeneratedValue
	@Id	
	private int idp  ;
	private String lib;
	private String ref;
	private String etat;
	private int qteprod;
	private float prix_ht;
	private float prix_ttc;

	public Produit() {
		super();
	}

	public Produit(int idp,String lib, String ref, String etat, int qteprod,
			float prix_ht, float prix_ttc) {
		super();
		this.idp=idp;
		this.lib = lib;
		this.ref = ref;
		this.etat = etat;
		this.qteprod = qteprod;
		this.prix_ht = prix_ht;
		this.prix_ttc = prix_ttc;
	}

	public int getIdp() {
		return idp;
	}

	

	public String getLib() {
		return lib;
	}

	public void setLib(String lib) {
		this.lib = lib;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public int getQteprod() {
		return qteprod;
	}

	public void setQteprod(int qteprod) {
		this.qteprod = qteprod;
	}

	public float getPrix_ht() {
		return prix_ht;
	}

	public void setPrix_ht(float prix_ht) {
		this.prix_ht = prix_ht;
	}

	public float getPrix_ttc() {
		return prix_ttc;
	}

	public void setPrix_ttc(float prix_ttc) {
		this.prix_ttc = prix_ttc;
	}

}
