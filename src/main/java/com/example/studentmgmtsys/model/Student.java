package com.example.studentmgmtsys.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Entity  //map this class in out db
@Table (name="student")//table in our db
//yo vanda  talla ko annotation ley garda code reduce hunxa
//but we need to make pojo class
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
@Column(name="student_id")
    private Long student_id;
@Column(name = "student_name")
    private String student_name;
@Column(name = "email")
    private String email;
@Column(name = "dob")
    private LocalDate dob;
}
