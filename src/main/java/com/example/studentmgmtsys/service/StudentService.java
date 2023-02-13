package com.example.studentmgmtsys.service;

import com.example.studentmgmtsys.model.Student;
import com.example.studentmgmtsys.repo.StudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {
    //for dynamic data
    private final StudentRepo studentRepo;
    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }



    //yes vitra auna lai controller yo class ko object hunu parxa
    //for static data
//    public List<Student> liststudent(){
//        //returns array of an object
//        return List.of(
//                new Student(
//                        1L,
//                        "Badsna",
//                        "badsnastha@gmail.com",
//                        LocalDate.of(2001, Month.JUNE,03),
//                        21
//                )
//        );
//    }

    //for getting all students
    public List<Student> getStudents(){
        return studentRepo.findAll(); //returns a list
    }

    public void addStudent(Student student) {
        //ctr+alt+v object banauna
        //same word change garna shift+F6
        Optional<Student> studentOptional = studentRepo.
                findStudentByEmail((student.getEmail()));
        if(studentOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        studentRepo.save(student);
//        System.out.println(student);
    }

    public void deleteStudent(Long student_id) {
      boolean exists=studentRepo.existsById(student_id);
      if(!exists){
          throw new IllegalStateException(
                  "student with id" +student_id+"doesnot exists"
          );
      }
      studentRepo.deleteById(student_id);
    }
    @Transactional
    //you dont have to implement JPQL query so you can use setters from your entity
    public  void updateStudent(Long student_id, String student_name, String email) {
        Student student=studentRepo.findById(student_id)
                .orElseThrow(() -> new IllegalStateException(
                        "student with id " + student_id + " does not exist"
                ));
        if(student_name!=null &&
                student_name.length()>0 &&
                !Objects.equals(student.getStudent_name(), student_name)){
            student.setStudent_name(student_name);
        }
        if(email!=null &&
                email.length()>0 &&
                !Objects.equals(student.getEmail(), email)){
            Optional<Student> studentOptional=studentRepo.findStudentByEmail(email);
            if(studentOptional.isPresent()){
                throw new IllegalStateException("email taken");
            }
            student.setEmail(email);
        }
    }
}

