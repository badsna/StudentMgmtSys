package com.example.studentmgmtsys.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

//pojo is simple class without any anotation and
// complex relation with other classes
//controller=>business logic=>pojo=>database
//response file user lai data present garna use garne

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDetailResponsePojo {

    private Long student_id;
    private String student_name;
    private String email;
    private LocalDate dob;
}
