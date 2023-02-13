//package com.example.studentmgmtsys.config;
//
//import com.example.studentmgmtsys.model.Student;
//import com.example.studentmgmtsys.repo.StudentRepo;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//import static java.time.Month.JANUARY;
//import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
//
//@Configuration
//public class StudentConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepo repo){
//        return arg->{
//           Student badsna= new Student(
//                   //id rakhna pardaina caasue id afaii sequencegenerator ley dinxa
//                    "Badsna",
//                    "badsna@gmail.com",
//                    LocalDate.of(2001, JANUARY,5)
////
//            );
//
//            Student rujan= new Student(
//                    "Rujan",
//                    "rujan@gmail.com",
//                    LocalDate.of(2000, JANUARY,5)
////
//            );
//
//            repo.saveAll( //save all vanne prebuilt function ho
//                    List.of(badsna,rujan)
//            );
//
//        };
//    }
//}
