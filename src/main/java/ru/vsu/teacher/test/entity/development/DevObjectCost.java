package ru.vsu.teacher.test.entity.development;

import lombok.Data;
import ru.vsu.teacher.test.entity.Cost;

import javax.persistence.*;

@Entity
@Data
public class DevObjectCost implements Cost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "has_link")
    private Boolean hasLink;

    @Column(name = "teacher_role")
    private TeacherDevObjectRole teacherDevObjectRole;

    @Column(name = "cost")
    private Integer cost;
}
