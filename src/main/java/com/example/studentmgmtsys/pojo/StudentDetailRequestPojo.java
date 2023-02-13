package com.example.studentmgmtsys.pojo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
//request file user ley deyako data post garne db ma
import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Service
public class StudentDetailRequestPojo {
    private Long student_id;
    @NotNull //validation vanne dependency chaixa
    private String student_name;
    private String email;
    private LocalDate dob;
}
