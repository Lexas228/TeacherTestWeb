package ru.vsu.teacher.test.entity.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EventType {
    Open_Lesson("Открытый урок"),
    Quiz("Викторина"),
    Olympics("Олимпиада"),
    Competition("Конкурс");

    private final String description;

}
