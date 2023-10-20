package com.telusko.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="alien_table")
public class Aliens {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private AlienName aname;
	@Column(name="alien_color")
	private String acolor;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	public String getAcolor() {
		return acolor;
	}
	public void setAcolor(String acolor) {
		this.acolor = acolor;
	}
	@Override
	public String toString() {
		return "Aliens [aid=" + aid + ", aname=" + aname + ", acolor=" + acolor + "]";
	}
	
	

}
