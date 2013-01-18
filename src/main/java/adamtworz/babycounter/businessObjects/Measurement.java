package adamtworz.babycounter.businessObjects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Measurement {
	@Id
	private int ID;
	private String date;
	private double weight;
	private int length;	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double d) {
		this.weight = d;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
}
