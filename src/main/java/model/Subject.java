package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "subject")
@NamedQuery(name ="Subject.findAll" , query = "Select r from Subject r")
public class Subject {
	
	@Id
	@Column(name = "idsubject")
	private int idsubject;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "teacher")
	private String teacher;
	
	@Column(name = "level")
	private String level;

	
	public Subject() {
		super();
	}


	public int getIdsubject() {
		return idsubject;
	}


	public void setIdsubject(int idsubject) {
		this.idsubject = idsubject;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getTeacher() {
		return teacher;
	}


	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}


	public String getLevel() {
		return level;
	}


	public void setLevel(String level) {
		this.level = level;
	}
	
	
}
