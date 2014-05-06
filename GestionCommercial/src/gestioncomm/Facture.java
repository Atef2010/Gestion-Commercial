package gestioncomm;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;


@Entity
@Table(name="facture")
public class Facture {
	@GeneratedValue
	@Id	
	private int id;
	@Column
	private int numfact ;
	@Column
	private Date date ;
	@Column
	private double mnttot;
	@Column
	private int numpaiment;
	@Column
	private String type;
	
	public Facture()
	{
		super();
	}
	public Facture(int id,int numfact,Date date,String type,double mntot,int numpaiment){
		
		this.id=id;
		this.date=date;
		this.numfact=numfact;
		this.numpaiment=numpaiment;
		this.mnttot=mntot;
		this.type=type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumfact() {
		return numfact;
	}
	public void setNumfact(int numfact) {
		this.numfact = numfact;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getMnttot() {
		return mnttot;
	}
	public void setMnttot(double mnttot) {
		this.mnttot = mnttot;
	}
	public int getNumpaiment() {
		return numpaiment;
	}
	public void setNumpaiment(int numpaiment) {
		this.numpaiment = numpaiment;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
