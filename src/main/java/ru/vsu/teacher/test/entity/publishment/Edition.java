package ru.vsu.teacher.test.entity.publishment;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Edition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
}
