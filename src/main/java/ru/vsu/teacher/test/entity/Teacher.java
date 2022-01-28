package ru.vsu.teacher.test.entity;

import ru.vsu.teacher.test.entity.award.Award;
import ru.vsu.teacher.test.entity.development.DevObject;
import ru.vsu.teacher.test.entity.event.EventResult;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "academic_degree")
    private AcademicDegree academicDegree;

    @ManyToMany
    private List<EventResult> eventResults;

    @ManyToMany
    private List<DevObject> devObjects;

    @ManyToMany
    private List<Award> awards;

}
