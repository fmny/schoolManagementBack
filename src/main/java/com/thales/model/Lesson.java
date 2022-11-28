package com.thales.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Lesson {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NonNull
	@Column(name = "hourstart")
	@Temporal(TemporalType.DATE)
	private Date startHour;

	@NonNull
	@Column(name = "hourend")
	@Temporal(TemporalType.DATE)
	private Date endHour;

	@ManyToOne
	private Course course;

	@ManyToOne
	private Grade grade;

	@ManyToOne
	private Teacher teacher;
}
