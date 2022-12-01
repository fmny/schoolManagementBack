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

        Address address1=new Address("Nantes","rue de Paris",12,"France");
        Address address2=new Address("Grenoble","rue du Général de Gaulle",27,"France");
        addressDao.save(address1);
        addressDao.save(address2);

        School Lycee1=new School("Lycée de La Colinière","Lycée","022545978","logo1");
        School college1=new School("Collège Claude Debussy","Collège","0123510290","logo2");

        Lycee1.setAddress(address1);
        college1.setAddress(address2);

        schoolDao.save(Lycee1);
        schoolDao.save(college1);

        Course coursMath1=new Course("Maths","blue");
        Course coursMath2=new Course("Maths","blue");
        Course coursPhys1=new Course("Physique","red");
        Course coursPhys2=new Course("Physique","red");
        Course coursChimie1=new Course("Chimie","green");
        Course coursChimie2=new Course("Chimie","green");
        Course coursBiologie=new Course("Biologie","grey");
        Course coursEPS=new Course("EPS","pink");
        Course coursAnglais=new Course("Anglais","yellow");//reprendre
        Course coursFrancais1=new Course("Français","orange");
        Course coursFrancais2=new Course("Français","orange");
        Course coursPhilo=new Course("Philosophie","purple");
        Course coursAllemand=new Course("Allemand","crimson");
        Course coursLatin=new Course("Latin","black");

        coursMath1.setSchool(Lycee1);
        coursPhys1.setSchool(Lycee1);
        coursChimie1.setSchool(Lycee1);
        coursBiologie.setSchool(Lycee1);
        coursEPS.setSchool(Lycee1);
        coursFrancais2.setSchool(Lycee1);
        coursPhilo.setSchool(Lycee1);

        coursMath2.setSchool(college1);
        coursPhys2.setSchool(college1);
        coursChimie2.setSchool(college1);
        coursFrancais1.setSchool(college1);
        coursAnglais.setSchool(college1);
        coursAllemand.setSchool(college1);
        coursLatin.setSchool(college1);

        this.courseDao.save(coursMath1);
        this.courseDao.save(coursMath2);
        this.courseDao.save(coursPhys1);
        this.courseDao.save(coursPhys2);
        this.courseDao.save(coursChimie1);
        this.courseDao.save(coursChimie2);
        this.courseDao.save(coursBiologie);
        this.courseDao.save(coursEPS);
        this.courseDao.save(coursAnglais);
        this.courseDao.save(coursFrancais1);
        this.courseDao.save(coursFrancais2);
        this.courseDao.save(coursPhilo);
        this.courseDao.save(coursAllemand);
        this.courseDao.save(coursLatin);

        ClassRoom classRoom1=new ClassRoom("Aristote",30);
        ClassRoom classRoom2=new ClassRoom("Socrate",28);
        ClassRoom classRoom3=new ClassRoom("Archimède",27);
        ClassRoom classRoom4=new ClassRoom("Einstein",32);
        ClassRoom classRoom5=new ClassRoom("Petites Puces",24);
        ClassRoom classRoom6=new ClassRoom("Petits Loups",22);
        ClassRoom classRoom7=new ClassRoom("Petits Boûts",24);

        classRoom1.setSchool(Lycee1);
        classRoom2.setSchool(Lycee1);
        classRoom3.setSchool(Lycee1);
        classRoom4.setSchool(Lycee1);

        classRoom5.setSchool(college1);
        classRoom6.setSchool(college1);
        classRoom7.setSchool(college1);

        //A vérifier
        classRoom1.getExcludedCourses().add(coursMath1);
        classRoom2.getExcludedCourses().add(coursPhys1);
        classRoom3.getExcludedCourses().add(coursChimie1);
        classRoom4.getExcludedCourses().add(coursBiologie);
        classRoom5.getExcludedCourses().add(coursEPS);
        classRoom6.getExcludedCourses().add(coursAnglais);
        classRoom7.getExcludedCourses().add(coursFrancais1);


        classRoomDao.save(classRoom1);
        classRoomDao.save(classRoom2);
        classRoomDao.save(classRoom3);
        classRoomDao.save(classRoom4);
        classRoomDao.save(classRoom5);
        classRoomDao.save(classRoom6);
        classRoomDao.save(classRoom7);

        Teacher profMath=new Teacher("Emma","Martin","08/06/1972");
        Teacher profMath1=new Teacher("Liam","Bernard","15/01/1983");
        Teacher profPhys=new Teacher("Olivia","Lopez","23/08/2002");
        Teacher profChimie=new Teacher("Noah","Dupuy","13/12/1969");
        Teacher profBiologie=new Teacher("Alice","Guillot","27/03/2000");
        Teacher profEPS=new Teacher("William","Berger","21/02/1992");
        Teacher profAnglais=new Teacher("Léa","Hubert","03/08/1958");
        Teacher profFrancais=new Teacher("Thomas","Carpentier","01/10/1945");
        Teacher profPhilo=new Teacher("Sophia","Sanchez","10/12/2002");
        Teacher profAllemand=new Teacher("Logan","Moulin","17/11/2001");
        Teacher profLatin=new Teacher("Mia","Leroy","07/04/1995");
        Teacher profMath2=new Teacher("Jacob","Boucher","30/12/1998");
        Teacher profFrancais2=new Teacher("Charlie","Bonnet","25/01/1968");
        Teacher profLatin2=new Teacher("Nathan","Fleury","23/08/1995");

        /*
        profMath.setBirthdate(new Date(72, 6, 8, 12, 0, 0));
        profMath1.setBirthdate(new Date(83, 1, 15, 12, 0, 0));
        profPhys.setBirthdate(new Date(102, 7, 23, 12, 0, 0));
        profChimie.setBirthdate(new Date(69, 11, 13, 12, 0, 0));
        profBiologie.setBirthdate(new Date(100, 2, 27, 12, 0, 0));
        profEPS.setBirthdate(new Date(58, 7, 3, 12, 0, 0));
        profAnglais.setBirthdate(new Date(45, 9, 1, 12, 0, 0));
        profFrancais.setBirthdate(new Date(102, 11, 10, 12, 0, 0));
        profPhilo.setBirthdate(new Date(101, 10, 17, 12, 0, 0));
        profAllemand.setBirthdate(new Date(95, 3, 7, 12, 0, 0));
        profLatin.setBirthdate(new Date(98, 11, 30, 12, 0, 0));
        teacher8.setBirthdate(new Date(67, 12, 25, 12, 0, 0));
        teacher9.setBirthdate(new Date(88, 6, 19, 12, 0, 0));
        teacher10.setBirthdate(new Date(95, 7, 23, 12, 0, 0));*/


        profMath.setSchool(Lycee1);
        profPhys.setSchool(Lycee1);
        profBiologie.setSchool(Lycee1);
        profAnglais.setSchool(Lycee1);
        profFrancais.setSchool(Lycee1);
        profPhilo.setSchool(Lycee1);
        profAllemand.setSchool(Lycee1);

        profFrancais2.setSchool(college1);
        profLatin2.setSchool(college1);
        profMath2.setSchool(college1);
        profMath1.setSchool(college1);
        profChimie.setSchool(college1);
        profEPS.setSchool(college1);
        profLatin.setSchool(college1);

        profMath.getCourses().add(coursMath1);
        profMath.getCourses().add(coursPhys1);
        profMath1.getCourses().add(coursMath1);
        profPhys.getCourses().add(coursPhys1);
        profPhys.getCourses().add(coursChimie1);
        profChimie.getCourses().add(coursChimie1);
        profBiologie.getCourses().add(coursBiologie);
        //profBiologie.getCourses().add(coursEPS);
        profEPS.getCourses().add(coursEPS);
        profAnglais.getCourses().add(coursAnglais);
        profFrancais.getCourses().add(coursFrancais1);
        profPhilo.getCourses().add(coursPhilo);
        profAllemand.getCourses().add(coursAllemand);
        profLatin.getCourses().add(coursLatin);
        profFrancais2.getCourses().add(coursFrancais1);
        profMath2.getCourses().add(coursMath2);
        profLatin2.getCourses().add(coursLatin);




        this.teacherDao.save(profMath);
        this.teacherDao.save(profMath1);
        this.teacherDao.save(profPhys);
        this.teacherDao.save(profChimie);
        this.teacherDao.save(profBiologie);
        this.teacherDao.save(profEPS);
        this.teacherDao.save(profAnglais);
        this.teacherDao.save(profFrancais);
        this.teacherDao.save(profPhilo);
        this.teacherDao.save(profAllemand);
        this.teacherDao.save(profLatin);
        this.teacherDao.save(profFrancais2);
        this.teacherDao.save(profMath2);
        this.teacherDao.save(profLatin2);

        Grade gradeTermA=new Grade("Term.","A");
        Grade gradeTermB=new Grade("Term.","B");
        Grade gradeTermC=new Grade("Term.","C");
        Grade grade1ereA=new Grade("1ere","A");
        Grade grade1ereB=new Grade("1ere","B");
        Grade grade1ereC=new Grade("1ere","C");
        Grade grade2ndeA=new Grade("2nde","A");
        Grade grade2ndeB=new Grade("2nde","B");
        Grade grade2ndeC=new Grade("2nde","C");


        gradeTermA.setSchool(Lycee1);
        gradeTermB.setSchool(Lycee1);
        gradeTermC.setSchool(Lycee1);
        grade1ereA.setSchool(Lycee1);
        grade1ereB.setSchool(Lycee1);
        grade1ereC.setSchool(Lycee1);
        grade2ndeA.setSchool(Lycee1);
        grade2ndeB.setSchool(Lycee1);
        grade2ndeC.setSchool(Lycee1);


        gradeTermA.setMainTeacher(profMath);
        gradeTermB.setMainTeacher(profPhys);
        gradeTermC.setMainTeacher(profBiologie);
        grade1ereA.setMainTeacher(profAnglais);
        grade1ereB.setMainTeacher(profFrancais);
        grade1ereC.setMainTeacher(profPhilo);
        grade2ndeA.setMainTeacher(profAllemand);
        grade2ndeB.setMainTeacher(profMath);
        grade2ndeC.setMainTeacher(profPhys);

        Grade grade6emeA=new Grade("6eme","A");
        Grade grade6emeB=new Grade("6eme","B");
        Grade grade6emeC=new Grade("6eme","C");
        Grade grade5emeA=new Grade("5eme","A");
        Grade grade5emeB=new Grade("5eme","B");
        Grade grade5emeC=new Grade("5eme","C");
        Grade grade4emeA=new Grade("4eme","A");
        Grade grade4emeB=new Grade("4eme","B");
        Grade grade4emeC=new Grade("4eme","C");
        Grade grade3emeA=new Grade("3eme","A");
        Grade grade3emeB=new Grade("3eme","B");
        Grade grade3emeC=new Grade("3eme","C");

        grade6emeA.setSchool(college1);
        grade6emeB.setSchool(college1);
        grade6emeC.setSchool(college1);
        grade5emeA.setSchool(college1);
        grade5emeB.setSchool(college1);
        grade5emeC.setSchool(college1);
        grade4emeA.setSchool(college1);
        grade4emeB.setSchool(college1);
        grade4emeC.setSchool(college1);
        grade3emeA.setSchool(college1);
        grade3emeB.setSchool(college1);
        grade3emeC.setSchool(college1);

        grade6emeA.setMainTeacher(profMath2);
        grade6emeB.setMainTeacher(profFrancais2);
        grade6emeC.setMainTeacher(profLatin2);
        grade5emeA.setMainTeacher(profMath1);
        grade5emeB.setMainTeacher(profChimie);
        grade5emeC.setMainTeacher(profEPS);
        grade4emeA.setMainTeacher(profLatin);
        grade4emeB.setMainTeacher(profMath2);
        grade4emeC.setMainTeacher(profFrancais2);
        grade3emeA.setMainTeacher(profLatin2);
        grade3emeB.setMainTeacher(profMath1);
        grade3emeC.setMainTeacher(profChimie);


        this.gradeDao.save(gradeTermA);
        this.gradeDao.save(gradeTermB);
        this.gradeDao.save(gradeTermC);
        this.gradeDao.save(grade1ereA);
        this.gradeDao.save(grade1ereB);
        this.gradeDao.save(grade1ereC);
        this.gradeDao.save(grade2ndeA);
        this.gradeDao.save(grade2ndeB);
        this.gradeDao.save(grade2ndeC);
        this.gradeDao.save(grade6emeA);
        this.gradeDao.save(grade6emeB);
        this.gradeDao.save(grade6emeC);
        this.gradeDao.save(grade5emeA);
        this.gradeDao.save(grade5emeB);
        this.gradeDao.save(grade5emeC);
        this.gradeDao.save(grade4emeA);
        this.gradeDao.save(grade4emeB);
        this.gradeDao.save(grade4emeC);
        this.gradeDao.save(grade3emeA);
        this.gradeDao.save(grade3emeB);
        this.gradeDao.save(grade3emeC);

        User user1=new User("test","test");
        User user2=new User("log1","mdp1");
        User user3=new User("log2","mdp2");
        User user4=new User("log3","mdp3");

        this.userDao.save(user1);
        this.userDao.save(user2);
        this.userDao.save(user3);
        this.userDao.save(user4);


    }


}
