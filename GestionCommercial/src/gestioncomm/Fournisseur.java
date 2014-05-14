package gestioncomm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fournisseur")
public class Fournisseur {
	@GeneratedValue
	@Id	
	private int idf  ;
	private String code ;
	private String nom;
	private String prenom;
	private String tel;
	private String ville;
	private String adresse;
	private String codepostal;
	public Fournisseur()
	{
		super();
	}
	public Fournisseur(String code,String nom,String tel,String ville,String adresse,String codepostal)
	{
		this.idf=idf;
		this.code=code;
		this.nom=nom;
		this.tel=tel;
		this.ville=ville;
		this.adresse=adresse;
		this.codepostal=codepostal;
	}
	
	public int getIdp() {
		return idf;
	}
	public void setIdp(int idf) {
		this.idf = idf;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	

}

