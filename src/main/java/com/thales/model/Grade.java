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

public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String name;

    @NonNull
    private String section;

    @OneToMany(mappedBy = "grade")
    private List<Lesson> lessons=new ArrayList<>();

    @OneToOne
    private Teacher teacher;

    @ManyToOne
    School school;

}
