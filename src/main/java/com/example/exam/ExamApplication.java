package com.example.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class ExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);
        String dateString = "2024-11-28";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, formatter);
        Student me = new StudentBuilder("Ivan", "Kaftanatii", "Karazin")
                .specialistTopic("Dunno").build();
        System.out.println(me);
        Student none = new StudentBuilder("Student", "Student", "Karazin").build();
        System.out.println(none);
        Student ruin = new StudentBuilder("Ruin", "Ruin", "Ruin")
                .birthday(date)
                .group("CS41")
                .parentsName("Ruin")
                .specialistTopic("Some")
                .magisterTopic("Some")
                .build();
        System.out.println(ruin);
    }

}
