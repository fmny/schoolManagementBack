package com.thales.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String name;

    @NonNull
    private String color;

    @ManyToMany(mappedBy = "excludedCourses")
    @JsonIgnore
    private List<ClassRoom> excludedClassRooms=new ArrayList<>();

    @ManyToMany(mappedBy = "courses")
    @JsonIgnore
    List<Teacher> teachers =new ArrayList<>();

    @ManyToOne
    School school;

}
