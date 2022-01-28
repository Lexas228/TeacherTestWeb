package ru.vsu.teacher.test.entity;

import lombok.Getter;

@Getter
public enum AcademicDegree {
    Associate("Ассоциат"),
    Bachelor("Бакалавр"),
    Master("Магистр"),
    Doctoral("Доктор наук"),
    First_Professional("Др. Профессиональные степени");

    private final String description;

    AcademicDegree(String description){
        this.description = description;
    }



}
