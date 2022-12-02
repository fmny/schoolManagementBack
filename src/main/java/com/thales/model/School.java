package com.thales.model;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	private String name;

	@NonNull
	private String type;
	
	@NonNull
	private String phoneNumber;

	@NonNull
	private String logo;

	@OneToOne
	@Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	private Address address;

	@OneToMany(mappedBy = "school")
	@JsonIgnore
	private List<ClassRoom> classRooms=new ArrayList<>();

	@OneToMany(mappedBy = "school")
	@JsonIgnore
	List<Teacher> teachers=new ArrayList<>();

	@OneToMany(mappedBy = "school")
	@JsonIgnore
	List<Grade> grades=new ArrayList<>();

	@OneToMany(mappedBy = "school")
	@JsonIgnore
	List<Course> courses=new ArrayList<>();


}
