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

public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String name;

    @NonNull
    private int Capacity;

    @ManyToOne
    private School school;

    @ManyToMany
    @JoinTable(name = "excluded_classroom")
    private List<Course> excludedCourses=new ArrayList<>();

}
