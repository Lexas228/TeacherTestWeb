package ru.vsu.teacher.test.entity.development;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class DevObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "link")
    private String link;

    @Column(name = "teacher_role")
    private TeacherDevObjectRole teacherDevObjectRole;
}
