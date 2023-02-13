package com.example.studentmgmtsys.repo;

import com.example.studentmgmtsys.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //this resposible for data access
//yesko object student service ma hunu paryo
public interface StudentRepo extends JpaRepository<Student,Long> {
    //custom function to find stds thorugh email
    //yesma student vanya class class naem ho
    @Query("select s From Student s where s.email=?1")
    Optional<Student> findStudentByEmail(String email);

}
