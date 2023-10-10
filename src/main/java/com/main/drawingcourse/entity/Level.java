package com.main.drawingcourse.entity;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Levels")
public class Level {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int levelId;
	
	@Column(columnDefinition = "nvarchar(20) not null")
	private String levelName;
	
	@OneToMany(mappedBy = "level")
	private Collection<Course> courses;
	
}
