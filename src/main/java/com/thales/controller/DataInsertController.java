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

        //A vérifier
        classRoom1.getExcludedCourses().add(course1);
        classRoom2.getExcludedCourses().add(course2);
        classRoom3.getExcludedCourses().add(course3);
        classRoom4.getExcludedCourses().add(course4);
        classRoom5.getExcludedCourses().add(course5);
        classRoom6.getExcludedCourses().add(course6);
        classRoom7.getExcludedCourses().add(course7);


        classRoomDao.save(classRoom1);
        classRoomDao.save(classRoom2);
        classRoomDao.save(classRoom3);
        classRoomDao.save(classRoom4);
        classRoomDao.save(classRoom5);
        classRoomDao.save(classRoom6);
        classRoomDao.save(classRoom7);

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

        teacher1.setBirthdate(new Date(72, 6, 8, 12, 0, 0));
        teacher11.setBirthdate(new Date(83, 1, 15, 12, 0, 0));
        teacher2.setBirthdate(new Date(102, 7, 23, 12, 0, 0));
        teacher21.setBirthdate(new Date(69, 11, 13, 12, 0, 0));
        teacher3.setBirthdate(new Date(100, 2, 27, 12, 0, 0));
        teacher31.setBirthdate(new Date(58, 7, 3, 12, 0, 0));
        teacher4.setBirthdate(new Date(45, 9, 1, 12, 0, 0));
        teacher5.setBirthdate(new Date(102, 11, 10, 12, 0, 0));
        teacher6.setBirthdate(new Date(101, 10, 17, 12, 0, 0));
        teacher7.setBirthdate(new Date(95, 3, 7, 12, 0, 0));
        teacher71.setBirthdate(new Date(98, 11, 30, 12, 0, 0));
        teacher8.setBirthdate(new Date(67, 12, 25, 12, 0, 0));
        teacher9.setBirthdate(new Date(88, 6, 19, 12, 0, 0));
        teacher10.setBirthdate(new Date(95, 7, 23, 12, 0, 0));

        teacher1.setSchool(school1);
        teacher2.setSchool(school1);
        teacher3.setSchool(school1);
        teacher4.setSchool(school1);
        teacher5.setSchool(school1);
        teacher6.setSchool(school1);
        teacher7.setSchool(school1);

        teacher8.setSchool(school2);
        teacher9.setSchool(school2);
        teacher10.setSchool(school2);
        teacher11.setSchool(school2);
        teacher21.setSchool(school2);
        teacher31.setSchool(school2);
        teacher71.setSchool(school2);

        teacher1.getCourses().add(course1);
        teacher1.getCourses().add(course2);
        teacher11.getCourses().add(course1);
        teacher2.getCourses().add(course2);
        teacher2.getCourses().add(course3);
        teacher21.getCourses().add(course3);
        teacher3.getCourses().add(course4);
        teacher3.getCourses().add(course5);
        teacher31.getCourses().add(course5);
        teacher4.getCourses().add(course6);
        teacher5.getCourses().add(course7);
        teacher6.getCourses().add(course8);
        teacher7.getCourses().add(course9);
        teacher71.getCourses().add(course10);


        this.teacherDao.save(teacher1);
        this.teacherDao.save(teacher11);
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

        Grade grade1=new Grade("Term.","A");
        Grade grade2=new Grade("Term.","B");
        Grade grade3=new Grade("Term.","C");
        Grade grade4=new Grade("1ere","A");
        Grade grade5=new Grade("1ere","B");
        Grade grade6=new Grade("1ere","C");
        Grade grade7=new Grade("2nde","A");
        Grade grade8=new Grade("2nde","B");
        Grade grade9=new Grade("2nde","C");


        grade1.setSchool(school1);
        grade2.setSchool(school1);
        grade3.setSchool(school1);
        grade4.setSchool(school1);
        grade5.setSchool(school1);
        grade6.setSchool(school1);
        grade7.setSchool(school1);
        grade8.setSchool(school1);
        grade9.setSchool(school1);


        grade1.setMainTeacher(teacher1);
        grade2.setMainTeacher(teacher2);
        grade3.setMainTeacher(teacher3);
        grade4.setMainTeacher(teacher4);
        grade5.setMainTeacher(teacher5);
        grade6.setMainTeacher(teacher6);
        grade7.setMainTeacher(teacher7);
        grade8.setMainTeacher(teacher1);
        grade9.setMainTeacher(teacher2);

        Grade grade10=new Grade("6eme","A");
        Grade grade11=new Grade("6eme","B");
        Grade grade12=new Grade("6eme","C");
        Grade grade13=new Grade("5eme","A");
        Grade grade14=new Grade("5eme","B");
        Grade grade15=new Grade("5eme","C");
        Grade grade16=new Grade("4eme","A");
        Grade grade17=new Grade("4eme","B");
        Grade grade18=new Grade("4eme","C");
        Grade grade19=new Grade("3eme","A");
        Grade grade20=new Grade("3eme","B");
        Grade grade21=new Grade("3eme","C");

        grade10.setSchool(school2);
        grade11.setSchool(school2);
        grade12.setSchool(school2);
        grade13.setSchool(school2);
        grade14.setSchool(school2);
        grade15.setSchool(school2);
        grade16.setSchool(school2);
        grade17.setSchool(school2);
        grade18.setSchool(school2);
        grade19.setSchool(school2);
        grade20.setSchool(school2);
        grade21.setSchool(school2);

        grade10.setMainTeacher(teacher8);
        grade11.setMainTeacher(teacher9);
        grade12.setMainTeacher(teacher10);
        grade13.setMainTeacher(teacher11);
        grade14.setMainTeacher(teacher21);
        grade15.setMainTeacher(teacher31);
        grade16.setMainTeacher(teacher71);
        grade17.setMainTeacher(teacher8);
        grade18.setMainTeacher(teacher9);
        grade19.setMainTeacher(teacher10);
        grade20.setMainTeacher(teacher11);
        grade21.setMainTeacher(teacher21);


        this.gradeDao.save(grade1);
        this.gradeDao.save(grade2);
        this.gradeDao.save(grade3);
        this.gradeDao.save(grade4);
        this.gradeDao.save(grade5);
        this.gradeDao.save(grade6);
        this.gradeDao.save(grade7);
        this.gradeDao.save(grade8);
        this.gradeDao.save(grade9);
        this.gradeDao.save(grade10);
        this.gradeDao.save(grade11);
        this.gradeDao.save(grade12);
        this.gradeDao.save(grade13);
        this.gradeDao.save(grade14);
        this.gradeDao.save(grade15);
        this.gradeDao.save(grade16);
        this.gradeDao.save(grade17);
        this.gradeDao.save(grade18);
        this.gradeDao.save(grade19);
        this.gradeDao.save(grade20);
        this.gradeDao.save(grade21);

        User user1=new User("","");
        User user2=new User("login2","password2");
        User user3=new User("login3","password3");
        User user4=new User("login4","password4");

        this.userDao.save(user1);
        this.userDao.save(user2);
        this.userDao.save(user3);
        this.userDao.save(user4);




    }


}
