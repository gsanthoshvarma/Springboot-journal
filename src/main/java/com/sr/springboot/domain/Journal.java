package com.sr.springboot.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * @author USER1
 *
 */
@Entity
public class Journal {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private Date created;
	private String summary;
	@Transient
	private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Journal(String summary ,String title, String date) throws ParseException {
		super();
		this.summary = summary;
		this.title = title;
		this.created = dateFormat.parse(date);
		
	}
	public Journal() {
		super();
	}
	
	
	
}
