package gestioncomm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="smartphone")

public class Smartphone {
	@GeneratedValue
	@Id	
	private int idsmartephone;
	private String dimension ;
	private String alimentation ;
	private String memoire ;
	
	
	public  Smartphone ()
	{
		super();
	}
	public  Smartphone (String dimension ,String alimentation , String memoire)
	{
		
		this.dimension=dimension;
		this.alimentation=alimentation;
		this.memoire=memoire ;
		
	}
	public int getIdsmartephone() {
		return idsmartephone;
	}
	public void setIdsmartephone(int idsmartephone) {
		this.idsmartephone = idsmartephone;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getAlimentation() {
		return alimentation;
	}
	public void setAlimentation(String alimentation) {
		this.alimentation = alimentation;
	}
	public String getMemoire() {
		return memoire;
	}
	public void setMemoire(String memoire) {
		this.memoire = memoire;
	}
	
}
