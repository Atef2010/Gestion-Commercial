package gestioncomm;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="commande")
public class Commande {
	@GeneratedValue
	@Id	
	private int idc  ;
	private String lib;
	private String ref;
	private int qteprod;
	private float prixht;
	private float prixttc;
	private String fournisseur;
	public Commande(){
		super();
		
	}
	public Commande (int idc,String lib, String ref, String etat, int qteprod,
			float prix_ht, float prix_ttc, String fournisseur) {
		super();
		this.idc=idc;
		this.lib = lib;
		this.ref = ref;
		this.qteprod = qteprod;
		this.prixht = prix_ht;
		this.prixttc = prixttc;
		this.fournisseur=fournisseur;
	}
	public int getIdc() {
		return idc;
	}
	public void setIdc(int idc) {
		this.idc = idc;
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
	public int getQteprod() {
		return qteprod;
	}
	public void setQteprod(int qteprod) {
		this.qteprod = qteprod;
	}
	public float getPrixht() {
		return prixht;
	}
	public void setPrixht(float prixht) {
		this.prixht = prixht;
	}
	public float getPrixttc() {
		return prixttc;
	}
	public void setPrixttc(float prixttc) {
		this.prixttc = prixttc;
	}
	public String getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}


}
