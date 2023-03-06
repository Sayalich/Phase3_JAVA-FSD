package com.onlyxcodes.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "tbl_book")
@EnableTransactionManagement
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id")
	private int id;
	
	@Column(name = "book_des")
	private String des;
	
	@Column(name = "book_published")
	private String published;
	
	@Column(name = "book_title")
	private String title;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDes() {
		return des;
	}
	
	public void setDes() {
		this.des = des;
	}

	public void setPublished(String published) {
		this.published = published;
	}
	
	public String getPublished() {
		return published;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}