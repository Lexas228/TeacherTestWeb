package ru.vsu.teacher.test.entity.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EventLevel {
    Education_Organization("Уровень образовательной организации"),
    International("Международный уровень"),
    Federal("Федеральный уровень"),
    Regional("Региональный уровень"),
    Interregional("Межрегиональный уровень"),
    Municipal("Муниципальный уровень"),
    Intermunicipal("Межмуниципальный уровень"),
    Educational_District("Уровень образовательного округа");

    private final String description;
}
