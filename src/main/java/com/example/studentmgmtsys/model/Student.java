package com.example.studentmgmtsys.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity  //map this class in out db
@Table //table in our db
public class Student {
    //here we have a class student
@Id
@SequenceGenerator(
        name="student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
)
@GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"

)
    private Long student_id;
    private String student_name;
    private String email;
    private LocalDate dob;
    @Transient
    private Integer age;

    public Student() {
    }

    public Student(Long student_id, String student_name, String email, LocalDate dob, Integer age) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.email = email;
        this.dob = dob;

    }


    public Student(String student_name, String email, LocalDate dob) {
        this.student_name = student_name;
        this.email = email;
        this.dob = dob;

    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob,LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
