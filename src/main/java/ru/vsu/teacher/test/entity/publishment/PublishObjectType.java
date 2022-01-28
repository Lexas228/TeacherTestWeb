package ru.vsu.teacher.test.entity.publishment;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PublishObjectType {
    Thesis("Тэзис"),
    Note("Заметка"),
    Methodical_Development("Методичская разработка"),
    Lessons_Materials("Материалы к уроку"),
    Article("Статья"),
    Methodical_Manual("Методическое пособие"),
    Author_Program("Авторская программа"),
    Monograph("Монография");

    private final String name;

}
