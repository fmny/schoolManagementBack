package com.thales.controller;


import com.thales.dao.*;
import com.thales.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;



@RestController()
@RequestMapping("/datainsert")
public class DataInsertController {
    @Autowired
    private AddressDao addressDao;
    @Autowired
    private ClassRoomDao classRoomDao;
    @Autowired
    private CourseDao courseDao;
    @Autowired
    private GradeDao gradeDao;
    @Autowired
    private LessonDao lessonDao;
    @Autowired
    private SchoolDao schoolDao;
    @Autowired
    private TeacherDao teacherDao;
    @Autowired
    private UserDao userDao;


    @GetMapping({"/", ""})
    public void insert(){
        getList();
    }


    final public void getList() {

        Address address1=new Address("Nantes","rue des 4",1,"France");
        Address address2=new Address("Nantes","rue des 5",1,"France");
        addressDao.save(address1);
        addressDao.save(address2);

        School school1=new School("etablissement1","Lycée","012345678","logo1");
        School school2=new School("etablissement2","Collège","012345678","logo2");

        school1.setAddress(address1);
        school2.setAddress(address2);

        schoolDao.save(school1);
        schoolDao.save(school2);

        ClassRoom classRoom1=new ClassRoom("maclasse1",20);
        ClassRoom classRoom2=new ClassRoom("maclasse2",25);
        ClassRoom classRoom3=new ClassRoom("maclasse3",30);
        ClassRoom classRoom4=new ClassRoom("maclasse4",35);
        ClassRoom classRoom5=new ClassRoom("maclasse5",22);
        ClassRoom classRoom6=new ClassRoom("maclasse6",21);
        ClassRoom classRoom7=new ClassRoom("maclasse7",27);

        classRoom1.setSchool(school1);
        classRoom2.setSchool(school1);
        classRoom3.setSchool(school1);
        classRoom4.setSchool(school1);

        classRoom5.setSchool(school2);
        classRoom6.setSchool(school2);
        classRoom7.setSchool(school2);

        classRoomDao.save(classRoom1);
        classRoomDao.save(classRoom2);
        classRoomDao.save(classRoom3);
        classRoomDao.save(classRoom4);
        classRoomDao.save(classRoom5);
        classRoomDao.save(classRoom6);
        classRoomDao.save(classRoom7);

        Course course1=new Course("Maths","blue");
        Course course11=new Course("Maths","blue");
        Course course2=new Course("Physique","red");
        Course course21=new Course("Physique","red");
        Course course3=new Course("Chimie","green");
        Course course31=new Course("Chimie","green");
        Course course4=new Course("Biologie","grey");
        Course course5=new Course("EPS","pink");
        Course course6=new Course("Anglais","yellow");
        Course course7=new Course("Français","orange");
        Course course71=new Course("Français","orange");
        Course course8=new Course("Philosophie","purple");
        Course course9=new Course("Allemand","crimson");
        Course course10=new Course("Latin","black");

        course1.setSchool(school1);
        course2.setSchool(school1);
        course3.setSchool(school1);
        course4.setSchool(school1);
        course5.setSchool(school1);
        course71.setSchool(school1);
        course8.setSchool(school1);

        course11.setSchool(school2);
        course21.setSchool(school2);
        course31.setSchool(school2);
        course7.setSchool(school2);
        course6.setSchool(school2);
        course9.setSchool(school2);
        course10.setSchool(school2);

        this.courseDao.save(course1);
        this.courseDao.save(course11);
        this.courseDao.save(course2);
        this.courseDao.save(course21);
        this.courseDao.save(course3);
        this.courseDao.save(course31);
        this.courseDao.save(course4);
        this.courseDao.save(course5);
        this.courseDao.save(course6);
        this.courseDao.save(course7);
        this.courseDao.save(course71);
        this.courseDao.save(course8);
        this.courseDao.save(course9);
        this.courseDao.save(course10);

        Teacher teacher1=new Teacher("prof1","LeProf");
        Teacher teacher11=new Teacher("prof11","LeProf");
        Teacher teacher2=new Teacher("prof2","LeProf");
        Teacher teacher21=new Teacher("prof21","LeProf");
        Teacher teacher3=new Teacher("prof3","LeProf");
        Teacher teacher31=new Teacher("prof3","LeProf");
        Teacher teacher4=new Teacher("prof4","LeProf");
        Teacher teacher5=new Teacher("prof5","LeProf");
        Teacher teacher6=new Teacher("prof6","LeProf");
        Teacher teacher7=new Teacher("prof7","LeProf");
        Teacher teacher71=new Teacher("prof71","LeProf");
        Teacher teacher8=new Teacher("prof8","LeProf");
        Teacher teacher9=new Teacher("prof9","LeProf");
        Teacher teacher10=new Teacher("prof10","LeProf");

        teacher1.setBirthdate("23","5","2000");


        this.teacherDao.save(teacher1);
        this.teacherDao.save(teacher2);
        this.teacherDao.save(teacher21);
        this.teacherDao.save(teacher3);
        this.teacherDao.save(teacher31);
        this.teacherDao.save(teacher4);
        this.teacherDao.save(teacher5);
        this.teacherDao.save(teacher6);
        this.teacherDao.save(teacher7);
        this.teacherDao.save(teacher71);
        this.teacherDao.save(teacher8);
        this.teacherDao.save(teacher9);
        this.teacherDao.save(teacher10);

        teacher1.setSchool(school1);
        schoolDao.save(school1);
        /*course2.setSchool(school1);
        course3.setSchool(school1);
        course4.setSchool(school1);
        course5.setSchool(school1);
        course71.setSchool(school1);
        course8.setSchool(school1);*/



    }


}
