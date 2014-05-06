package gestioncomm;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table(name="commande")
public class Commande {
	@GeneratedValue
	@Id	
	private int idc  ;
	private int  numdcmd;
	//private String lib;
	private String ref;
	private int qte;
	private String fr;
	private Date date ;
	public Commande(){
		super();
		
	}
	public Commande (int idc,int  numdcmd,Date date, String ref, String fr ,int qte) {
		super();
		
		this.idc=idc;
		this.numdcmd=numdcmd;
		this.date = date;
		this.ref = ref;
		this.fr = fr;
		this.qte=qte;
		
	}
	public int getIdc() {
		return idc;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setIdc(int idc) {
		this.idc = idc;
	}
	public int getNumdcmd() {
		return numdcmd;
	}
	public void setNumdcmd(int numdcmd) {
		this.numdcmd = numdcmd;
	}
	/*public String getLib() {
		return lib;
	}
	public void setLib(String lib) {
		this.lib = lib;
	}*/
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public String getFr() {
		return fr;
	}
	public void setFr(String fr) {
		this.fr = fr;
	}
	
	
}
