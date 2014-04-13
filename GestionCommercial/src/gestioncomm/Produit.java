package gestioncomm;

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
	private float prixht;
	private float prixttc;
	private String fournisseur;

	public Produit() {
		super();
	}

	public Produit(int idp,String lib, String ref, String etat, int qteprod,
			float prix_ht, float prix_ttc, String fournisseur) {
		super();
		this.idp=idp;
		this.lib = lib;
		this.ref = ref;
		this.etat = etat;
		this.qteprod = qteprod;
		this.prixht = prix_ht;
		this.prixttc = prixttc;
		this.fournisseur=fournisseur;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
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
		return prixht;
	}

	public void setPrix_ht(float prixht) {
		this.prixht = prixht;
	}

	public float getPrixttc() {
		return prixttc;
	}

	public void setPrix_ttc(float prixttc) {
		this.prixttc = prixttc;
	}

}
