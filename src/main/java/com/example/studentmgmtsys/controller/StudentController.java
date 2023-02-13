package com.example.studentmgmtsys.controller;

import com.example.studentmgmtsys.model.Student;
import com.example.studentmgmtsys.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
//Controller  is a class that servers as API layer which have all the resources
//API layer should talk to service layer to get some data
//service layer should talk to data access layer to get data
public class StudentController {
    private final StudentService studentService;
@Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
//@GetMapping("/liststudent")
//    public List<Student> liststudent(){
//return studentService.liststudent();
//    }

    @GetMapping("/getStudents")
    public List<Student> getStudents(){
    return studentService.getStudents();
    }

    @PostMapping
    //@requestbody ley user ley deyako student jason lai student variable ma store garxa
    public void registerNewStudent(@RequestBody Student student){
    studentService.addStudent(student);
    }

    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long student_id){
    studentService.deleteStudent(student_id);
    }

    @PutMapping( path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long student_id,
            @RequestParam(required = false) String student_name,
            @RequestParam(required = false) String email){
        studentService.updateStudent(student_id, student_name, email);
    }
}

