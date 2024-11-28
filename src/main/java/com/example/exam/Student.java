package com.example.exam;

import java.time.LocalDate;

public class Student {
    private final String name;
    private final String surname;
    private final String university;
    private final LocalDate birthday;
    private final String parentsName;
    private final String group;
    private final String magisterTopic;
    private final String specialistTopic;

    public Student(StudentBuilder sb) {
        this.name = sb.getName();
        this.surname = sb.getSurname();
        this.university = sb.getUniversity();
        this.birthday = sb.getBirthday();
        this.parentsName = sb.getParentsName();
        this.group = sb.getGroup();
        this.magisterTopic = sb.getMagisterTopic();
        this.specialistTopic = sb.getSpecialistTopic();
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", university='" + university + '\'' +
                ", birthday='" + birthday + '\'' +
                ", parentsName='" + parentsName + '\'' +
                ", group='" + group + '\'' +
                ", magisterTopic='" + magisterTopic + '\'' +
                ", specialistTopic='" + specialistTopic + '\'' + ']';
    }
}
