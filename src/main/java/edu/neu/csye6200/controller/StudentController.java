package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.service.StudentService;
import edu.neu.csye6200.util.TestDataUtil;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class StudentController {
    @Autowired
    StudentService studentService;

    public void addTestData(){

        studentService.saveStudents(new TestDataUtil().populateStudentData("src/main/resources/Students.csv"));
    }

    public void displayAllStudents(){
        studentService.getAllStudents().forEach(System.out::println);
    }

    public List<Student> getStudents(){
        return studentService.getAllStudents();
    }
    public void removeStudentById(Integer id){
        studentService.deleteStudentById(id);
    }
    public Optional<Student> readStudentById(Integer id){
        return studentService.getStudentById(id);
    }

    public void addStudent(String csv){
        studentService.saveStudent(csv);
    }
    public void removeStudents(){
        studentService.deleteStudents();
    }
}
