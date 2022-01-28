package ru.vsu.teacher.test.entity.event;

import lombok.Data;
import ru.vsu.teacher.test.entity.Teacher;

import javax.persistence.*;

@Entity
@Data
public class EventResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "teacher_role")
    private EventTeacherRole teacherRole;

    @OneToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @Column(name = "event_number")
    private Long numOfEvents;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
