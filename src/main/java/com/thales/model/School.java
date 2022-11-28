package com.thales.model;


import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

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
	private Address address;

	@OneToMany(mappedBy = "school")
	private List<ClassRoom> classRooms=new ArrayList<>();

	@OneToMany(mappedBy = "school")
	List<Teacher> teachers=new ArrayList<>();

	@OneToMany(mappedBy = "school")
	List<Grade> grades=new ArrayList<>();

	@OneToMany(mappedBy = "school")
	List<Course> courses=new ArrayList<>();



}
