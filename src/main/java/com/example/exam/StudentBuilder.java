package com.example.exam;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class StudentBuilder {
    private final String name;
    private final String surname;
    private final String university;
    private LocalDate birthday;
    private String parentsName;
    private String group;
    private String magisterTopic;
    private String specialistTopic;

    public StudentBuilder(String name, String surname, String university) {
        this.name = name;
        this.surname = surname;
        this.university = university;
    }
    public StudentBuilder birthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }
    public StudentBuilder parentsName(String parentsName) {
        this.parentsName = parentsName;
        return this;
    }
    public StudentBuilder group(String group) {
        this.group = group;
        return this;
    }
    public StudentBuilder magisterTopic(String magisterTopic) {
        if (specialistTopic != null) {
            throw new IllegalArgumentException("Special topic is already set");
        }
        this.magisterTopic = magisterTopic;
        return this;
    }
    public StudentBuilder specialistTopic(String specialistTopic) {
        if (this.magisterTopic != null) {
            throw new IllegalArgumentException("Magister topic is already set");
        }
        this.specialistTopic = specialistTopic;
        return this;
    }
    public Student build() {
        return new Student(this);
    }
}

