package ru.vsu.teacher.test.entity.event;

import lombok.Data;
import ru.vsu.teacher.test.entity.Cost;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class EventCost implements Cost{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "event_type")
    private EventType eventType;

    @Column(name = "event_level")
    private EventLevel eventLevel;

    @Column(name = "event_teacher_role")
    private EventTeacherRole teacherRole;

    @Column(name = "cost")
    private Integer cost;
}
