package com.thales.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthdate;

    @OneToOne(mappedBy = "teacher")
    private Grade grade;

    @OneToMany(mappedBy="teacher")
    List<Lesson> lessons=new ArrayList<>();

    @ManyToMany
    List<Course> courses=new ArrayList<>();

    @ManyToOne
    School school;

}
