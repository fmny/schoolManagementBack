package com.thales.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NonNull
	private String city;

	@NonNull
	private String street;
	@NonNull
	private int streetNumber;

	@NonNull
	private String country;

	@OneToOne(mappedBy = "address")
	@JsonIgnore
	private School school;


}
