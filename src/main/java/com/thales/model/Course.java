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

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String name;

    @NonNull
    private String color;

    @ManyToMany(mappedBy = "excludedCourses")
    private List<ClassRoom> excludedClassRooms=new ArrayList<>();

    @ManyToMany(mappedBy = "courses")
    List<Teacher> teachers =new ArrayList<>();

    @ManyToOne
    School school;

}
