package sbi.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Org {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="orgId")
	private int regNO;
	private String name;
	private String loc;
	public Org() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRegNO() {
		return regNO;
	}
	public void setRegNO(int regNO) {
		this.regNO = regNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}

}
