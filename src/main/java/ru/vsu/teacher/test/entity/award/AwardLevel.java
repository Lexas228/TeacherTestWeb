package ru.vsu.teacher.test.entity.award;

import lombok.Getter;

@Getter
public enum AwardLevel {
    State("Государственные награды"),
    Departmental("Ведомственные награды");

    private final String description;

    AwardLevel(String description){
        this.description = description;
    }
}
